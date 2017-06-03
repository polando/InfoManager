/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.service.common.impl;


import com.donkiello.dto.*;
import com.donkiello.model.dao.common.impl.DonCustomerDao;
import com.donkiello.model.entity.common.*;
import com.donkiello.model.exeption.BusinessException;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityTransaction;


@Stateless
@LocalBean
public class DonCustomerService {

    MapperFactory mapperFactory;
    MapperFacade mapper;
    DonCustomer donCustomer;

    @EJB
    private DonCustomerDao donCustomerDao;

    @PostConstruct
    private void init(){
        mapperFactory = new DefaultMapperFactory.Builder().build();
        mapper = mapperFactory.getMapperFacade();
        donCustomer = new DonCustomer();
    }

    public EntityTransaction getTransaction() {
        return donCustomerDao.getEntityManager().getTransaction();
    }

    public void create(DonCustomerDTO donCustomerDTO) throws BusinessException {
        mapper.map(donCustomerDTO,donCustomer);
        donCustomerDao.create(donCustomer);
    }

    public DonCustomerDTO searchById(Object id) throws BusinessException {
        DonCustomer donCustomer = donCustomerDao.searchById(id);
        DonCustomerDTO donCustomerDTO = new DonCustomerDTO();
        mapper.map(donCustomer , donCustomerDTO);
        return donCustomerDTO;
    }

    public void update(DonCustomerDTO donCustomerDTO) throws BusinessException {
        mapper.map(donCustomerDTO,donCustomer);
        donCustomerDao.update(donCustomer);
    }

    public void remove(DonCustomerDTO donCustomerDTO) throws BusinessException {
        mapper.map(donCustomerDTO,donCustomer);
        donCustomerDao.remove(donCustomer);
    }

    public List<DonCustomerDTO> getAll() throws BusinessException {

        //Using Dozer
//        Mapper mapper = new DozerBeanMapper();
//        CustomerMapper customerMapper = Selma.builder(CustomerMapper.class).build();
//        List<DonCustomerDTO>  listDonCustomerDTO = new ArrayList<DonCustomerDTO>();
//        for (DonCustomer donCustomer : donCustomerDao.getAll())
//       {
//           DonCustomerDTO destObject = mapper.map(donCustomer, DonCustomerDTO.class);
//           listDonCustomerDTO.add(destObject);
//        }

        //Using Orika
        List<DonCustomerDTO>  listDonCustomerDTO = new ArrayList<DonCustomerDTO>();
        DonCustomerDTO destObject;
        for (DonCustomer donCustomer : donCustomerDao.getAll())
        {
            destObject = mapper.map(donCustomer,DonCustomerDTO.class);
            listDonCustomerDTO.add(destObject);
        }

        return listDonCustomerDTO;
    }


    public void insertPhoto(byte[] image, int pid) throws BusinessException {
        DonCustomer customer = donCustomerDao.searchById(pid);
        customer.setCustomerImage(image);
        donCustomerDao.update(customer);
    }

    public List<DonPastDTO> getNotDeletedPasts(Integer c) {
        List<DonPastDTO> listDonPastDTO = new ArrayList<DonPastDTO>();
        List<DonPast> listDonPast;
        try {
            listDonPast = (List<DonPast>)((donCustomerDao).getEntityManager().createNamedQuery("PastNotDeleted").setParameter("CID",c).getResultList());
            for (DonPast past: listDonPast) {
                DonPastDTO pastDTO= new DonPastDTO();
                mapper.map(past,pastDTO);
                listDonPastDTO.add(pastDTO);
            }
            return listDonPastDTO;
           }
        catch (Exception e){
            return null;
        }
    }

    public List<DonProgramDTO> getNotDeletedPrograms(Integer c) {
            List<DonProgramDTO> listDonProgramDTO = new ArrayList<DonProgramDTO>();
            List<DonProgram> listDonProgram;
        try{
            listDonProgram = (List<DonProgram>)((donCustomerDao).getEntityManager().createNamedQuery("ProgramNotDeleted").setParameter("CID",c).getResultList());
            for (DonProgram program: listDonProgram) {
                DonProgramDTO programDTO= new DonProgramDTO();
                mapper.map(program,programDTO);
                listDonProgramDTO.add(programDTO);
            }
            return  listDonProgramDTO;
        }
        catch (Exception e){
            return null;
        }
    }

    public List<DonBussinessDTO> getCustomerBusinessInfo(Integer c){
        try {
            List<DonBussinessDTO> listDonBusinessDTO = new ArrayList<DonBussinessDTO>();
            List<DonBussiness> listDonBusiness;
            listDonBusiness = (List<DonBussiness>)((donCustomerDao).getEntityManager().createNamedQuery("CustomerBusinesses").setParameter("CID",c).getResultList());
            for (DonBussiness business: listDonBusiness) {
                DonBussinessDTO businessDTO= new DonBussinessDTO();
                mapper.map(business,businessDTO);
                listDonBusinessDTO.add(businessDTO);
            }
            return  listDonBusinessDTO;
        }
        catch (Exception e){
            return null;
        }
    }

    public List<DonPersonalDTO> getCustomerPersonalInfo(Integer c){
        try {
            List<DonPersonalDTO> listDonPersonalDTO = new ArrayList<DonPersonalDTO>();
            List<DonPersonal> listDonPersonal;
            listDonPersonal = (List<DonPersonal>)((donCustomerDao).getEntityManager().createNamedQuery("CustomerPersonal").setParameter("CID",c).getResultList());
            for (DonPersonal personal: listDonPersonal) {
                DonPersonalDTO personalDTO= new DonPersonalDTO();
                mapper.map(personal,personalDTO);
                listDonPersonalDTO.add(personalDTO);
            }
            return  listDonPersonalDTO;
        }
        catch (Exception e){
            return null;
        }
    }

}
