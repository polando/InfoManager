/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.service.common.impl;

import com.donkiello.dto.DonBussinessDTO;
import com.donkiello.dto.DonPastDTO;
import com.donkiello.model.dao.base.AbstractDao;
import com.donkiello.model.dao.common.impl.DonPastDao;
import com.donkiello.model.entity.common.DonCustomer;
import com.donkiello.model.entity.common.DonPast;
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
public class DonPastService {


    MapperFactory mapperFactory;
    MapperFacade mapper;
    DonPast donPast;
    
    @EJB
    private DonPastDao pastDao;

    @PostConstruct
    private void init(){
        mapperFactory = new DefaultMapperFactory.Builder().build();
        mapper = mapperFactory.getMapperFacade();
        donPast = new DonPast();
    }

    public EntityTransaction getTransaction() {
        return ((AbstractDao)pastDao).getEntityManager().getTransaction();
    }

    public void create(DonPastDTO donPastDTO) throws BusinessException {
        mapper.map(donPastDTO,donPast);
        pastDao.create(donPast);
    }

    public DonPastDTO searchById(Object id) throws BusinessException {
        DonPastDTO donPastDTO =new DonPastDTO();
        mapper.map(pastDao.searchById(id),donPastDTO);
        return donPastDTO;
    }

    public void update(DonPastDTO donPastDTO) throws BusinessException {
        mapper.map(donPastDTO,donPast);
        pastDao.create(donPast);
    }

    public void remove(DonPastDTO donPastDTO) throws BusinessException {
        mapper.map(donPastDTO,donPast);
        pastDao.remove(donPast);
    }

    public List<DonPast> getAll() throws BusinessException {
        return pastDao.getAll();
    }
    
}
