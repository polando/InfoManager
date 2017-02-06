/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.service.common.impl;

import com.donkiello.dto.DonPersonalDTO;
import com.donkiello.model.dao.base.AbstractDao;
import com.donkiello.model.dao.common.impl.DonPersonalDao;
import com.donkiello.model.entity.common.DonCustomer;
import com.donkiello.model.entity.common.DonPast;
import com.donkiello.model.entity.common.DonPersonal;
import com.donkiello.model.exeption.BusinessException;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityTransaction;


@Stateless
@LocalBean
public class DonPersonalService {

    MapperFactory mapperFactory;
    MapperFacade mapper;
    DonPersonal donPersonal;
    
    @EJB
    private DonPersonalDao donPersonalDao;

    @PostConstruct
    private void init(){
        mapperFactory = new DefaultMapperFactory.Builder().build();
        mapper = mapperFactory.getMapperFacade();
        donPersonal = new DonPersonal();
    }
    
    
    public EntityTransaction getTransaction() {
        return ((AbstractDao)donPersonalDao).getEntityManager().getTransaction();
    }

    public void create(DonPersonalDTO donPersonalDTO) throws BusinessException {
        mapper.map(donPersonalDTO,donPersonal);
        donPersonalDao.create(donPersonal);
    }

    public DonPersonalDTO searchById(Object id) throws BusinessException {
        DonPersonalDTO donPersonalDTO =new DonPersonalDTO();
        mapper.map(donPersonalDao.searchById(id),donPersonalDTO);
        return donPersonalDTO;
    }

    public void update(DonPersonalDTO donPersonalDTO) throws BusinessException {
        mapper.map(donPersonalDTO,donPersonal);
       donPersonalDao.update(donPersonal);
    }

    public void remove(DonPersonalDTO donPersonalDTO) throws BusinessException {
        mapper.map(donPersonalDTO,donPersonal);
        donPersonalDao.remove(donPersonal);
    }

    public List<DonPersonal> getAll() throws BusinessException {
        return donPersonalDao.getAll();
    }

    public void insertImage(byte[] image , int pid , boolean isPassport) throws BusinessException {
        DonPersonal p = donPersonalDao.searchById(pid);
        if(isPassport)
            p.setPersonalPassportScan(image);
        else
            p.setPersonalBirthCertScan(image);
           donPersonalDao.update(p);
    }

   
    
}
