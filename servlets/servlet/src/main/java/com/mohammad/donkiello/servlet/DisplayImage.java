/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohammad.donkiello.servlet;

import com.donkiello.model.entity.common.DonCustomer;
import com.donkiello.model.entity.common.DonPersonal;
import com.donkiello.model.service.common.impl.DonCustomerService;
import com.donkiello.model.service.common.impl.DonPersonalService;
import com.donkiello.utility.JndiUtils;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Mohammad
 */
public class DisplayImage extends HttpServlet implements Serializable {

    private static final long serialVersionUID = 4593558495041379082L;

    private DonCustomerService customerService;
    private DonPersonalService personalService;

    @EJB
    public void setCustomerService(DonCustomerService customerService) {
        this.customerService = customerService;
    }

    @EJB
    public void setPersonalService(DonPersonalService personalService) {
        this.personalService = personalService;
    }







    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        try {
//            String type = request.getParameter("type").trim();
//            String id = request.getParameter("pid").trim();
//            if (type.equalsIgnoreCase("pps")) {
//             //   IDonPersonalService personalService = (IDonPersonalService) JndiUtils.getModelEjb("DonPersonalService");
//
//                DonPersonal personal = personalService.searchById(Integer.parseInt(id));
//                response.reset();
//                response.setContentType("image/jpeg");
//                response.getOutputStream().write(personal.getPersonalPassportScan());
//                response.flushBuffer();
//            } else if (type.equalsIgnoreCase("bcs")) {
//               // IDonPersonalService personalService = (IDonPersonalService) JndiUtils.getModelEjb("DonPersonalService");
//
//                DonPersonal personal = personalService.searchById(Integer.parseInt(id));
//                response.reset();
//                response.setContentType("image/jpeg");
//                response.getOutputStream().write(personal.getPersonalBirthCertScan());
//                response.flushBuffer();
//            }  else if (type.equalsIgnoreCase("ps")) {
//             //   IDonCustomerService customerService = (IDonCustomerService) JndiUtils.getModelEjb("DonCustomerService");
//                DonCustomer customer = customerService.searchById(Integer.parseInt(id));
//                response.reset();
//                response.setContentType("image/jpeg");
//                response.getOutputStream().write(customer.getCustomerImage());
//                response.flushBuffer();
//            }
//        } catch (Exception e) {
//            System.out.println("exception in servlet\nparameters are null");
//            System.out.println(e.getMessage());
//        }
    }
}
