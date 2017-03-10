package com.mohammad.donkiello;

import com.donkiello.dto.DonBussinessDTO;
import com.donkiello.dto.DonCustomerDTO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.donkiello.dto.DonPersonalDTO;
import com.google.common.io.ByteStreams;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

/**
 * Created by ussocom on 3/4/2017.
 */


public class ExcelOutput implements Serializable {

    public static void wrtiteData(List<DonCustomerDTO> customerDTOList)  {
        if (!isEmpty(customerDTOList)) {
            OutputStream os = null;
            File out = null;
            String absoluteFilePath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/resources");

            List<DonBussinessDTO> donBussinessDTOs= new ArrayList<DonBussinessDTO>();
            List<DonPersonalDTO> donPersonalDTOs= new ArrayList<DonPersonalDTO>();

            for (DonCustomerDTO c : customerDTOList ) {
                donBussinessDTOs.add(c.getFirstBusiness());
                donPersonalDTOs.add(c.getFirstPersonal());
            }



            InputStream is = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/object_collection_template.xls");
            try {

                out = new File(absoluteFilePath, "object_collection_output.xls");
                os = new FileOutputStream(out);
                Context context = new Context();
                context.putVar("customers", customerDTOList);
                context.putVar("businesses",donBussinessDTOs);
                context.putVar("personals",donPersonalDTOs);
                JxlsHelper.getInstance().processTemplate(is, os, context);
            } catch (Exception e) {
            }
            InputStream temp = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/object_collection_output.xls");
            download(temp, out);
        }
    }

    private static boolean isEmpty(List<DonCustomerDTO> donCustomerDTOList) {
        return donCustomerDTOList == null;
    }

    public static void download(InputStream inputStream, File file)  {
        ServletOutputStream servletOutputStream=null;
        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();
        HttpServletResponse httpServletResponse = (HttpServletResponse) ec.getResponse();
        httpServletResponse.setHeader("Content-Disposition", "attachment;filename=\"" + "object_collection_output.xls" + "\"");
        httpServletResponse.setContentType("application/vnd.ms-excel");
        httpServletResponse.setContentLength((int) file.length());
        try {
            servletOutputStream = httpServletResponse.getOutputStream();
            ByteStreams.copy(inputStream, servletOutputStream);
             servletOutputStream.flush();


        }
        catch (Exception e){}
        finally {
            try {
                servletOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        fc.responseComplete(); // Important! Otherwise JSF will attempt to render the response which obviously will fail since it's already written with a file and closed.
    }


}

