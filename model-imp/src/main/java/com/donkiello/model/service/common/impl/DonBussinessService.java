/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.service.common.impl;

import com.donkiello.dto.DonBussinessDTO;
import com.donkiello.model.dao.common.impl.DonBussinessDao;
import com.donkiello.model.entity.common.DonBussiness;
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
public class DonBussinessService {

    MapperFactory mapperFactory;
    MapperFacade mapper;
    DonBussiness donBussiness;

    @EJB
    private DonBussinessDao bussinessDao;

    @PostConstruct
    private void init(){
        mapperFactory = new DefaultMapperFactory.Builder().build();
        mapper = mapperFactory.getMapperFacade();
        donBussiness = new DonBussiness();
    }

    public EntityTransaction getTransaction() {
        return (bussinessDao).getEntityManager().getTransaction();
    }

    public void create(DonBussinessDTO donBussinessDTO) throws BusinessException {
        mapper.map(donBussinessDTO,donBussiness);
        bussinessDao.create(donBussiness);
    }

    public DonBussinessDTO searchById(Object id) throws BusinessException {
        DonBussinessDTO donBussinessDTO =new DonBussinessDTO();
        mapper.map(bussinessDao.searchById(id),donBussinessDTO);
        return donBussinessDTO;
    }

    public void update(DonBussinessDTO donBussinessDTO) throws BusinessException {
        mapper.map(donBussinessDTO,donBussiness);
        bussinessDao.update(donBussiness);
    }

    public void remove(DonBussinessDTO donBussinessDTO) throws BusinessException {
        mapper.map(donBussinessDTO,donBussiness);
        bussinessDao.remove(donBussiness);
    }

    public List<DonBussiness> getAll() throws BusinessException {
        return bussinessDao.getAll();
    }
    
}
