/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.service.common.impl;


import com.donkiello.dto.DonCustomerDTO;
import com.donkiello.model.dao.base.AbstractDao;
import com.donkiello.model.dao.common.impl.DonCustomerDao;
import com.donkiello.model.dao.common.inter.IDonCustomerDao;
import com.donkiello.model.entity.common.*;
import com.donkiello.model.exeption.BusinessException;
import com.donkiello.model.service.common.inter.IDonCustomerService;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityTransaction;


@Stateless
public class DonCustomerService implements IDonCustomerService{
    
    @EJB
    private DonCustomerDao donCustomerDao;

    public EntityTransaction getTransaction() {
        return donCustomerDao.getEntityManager().getTransaction();
    }

    public void create(DonCustomerDTO t) throws BusinessException {
      // donCustomerDao.create(t);
    }

    public DonCustomerDTO searchById(Object id) throws BusinessException {
      //  return donCustomerDao.searchById(id);
        return null;
    }

    public void update(DonCustomerDTO t) throws BusinessException {
        donCustomerDao.update(t);
    }

    public void remove(DonCustomerDTO t) throws BusinessException {
       // donCustomerDao.remove(t);
    }

    /*public List<DonCustomer> getAll() throws BusinessException {
        return donCustomerDao.getAll();
    }*/

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
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        MapperFacade mapper = mapperFactory.getMapperFacade();
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

    public List<DonPast> getNotDeletedPasts(Integer c) {
        try {
             return  (List<DonPast>)((donCustomerDao).getEntityManager().createNamedQuery("PastNotDeleted").setParameter("CID",c).getResultList());
           }
        catch (Exception e){
            return null;
        }
    }

    public List<DonProgram> getNotDeletedPrograms(Integer c) {
        try {
            return  (List<DonProgram>)((donCustomerDao).getEntityManager().createNamedQuery("ProgramNotDeleted").setParameter("CID",c).getResultList());
        }
        catch (Exception e){
            return null;
        }
    }

    public List<DonBussiness> getCustomerBusinessInfo(Integer c){
        try {
            return  (List<DonBussiness>)((donCustomerDao).getEntityManager().createNamedQuery("CustomerBusinesses").setParameter("CID",c).getResultList());
        }
        catch (Exception e){
            return null;
        }
    }

    public List<DonPersonal> getCustomerPersonalInfo(Integer c){
        try {
            return  (List<DonPersonal>)((donCustomerDao).getEntityManager().createNamedQuery("CustomerPersonal").setParameter("CID",c).getResultList());
        }
        catch (Exception e){
            return null;
        }
    }





}
