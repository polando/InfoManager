/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.service.common.impl;

import com.donkiello.dto.DonProgramDTO;
import com.donkiello.model.dao.base.AbstractDao;
import com.donkiello.model.dao.common.impl.DonProgramDao;
import com.donkiello.model.entity.common.DonProgram;
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
public class DonProgramService {

    MapperFactory mapperFactory;
    MapperFacade mapper;
    DonProgram donProgram;

    @EJB
    private DonProgramDao programDao;

    @PostConstruct
    private void init(){
        mapperFactory = new DefaultMapperFactory.Builder().build();
        mapper = mapperFactory.getMapperFacade();
        donProgram = new DonProgram();
    }


    public EntityTransaction getTransaction() {
        return ((AbstractDao)programDao).getEntityManager().getTransaction();
    }

    public void create(DonProgramDTO donProgramDTO) throws BusinessException {
        mapper.map(donProgramDTO,donProgram);
        programDao.create(donProgram);
    }

    public DonProgramDTO searchById(Object id) throws BusinessException {
        DonProgramDTO donProgramDTO =new DonProgramDTO();
        mapper.map(programDao.searchById(id),donProgramDTO);
        return donProgramDTO;
    }

    public void update(DonProgramDTO donProgramDTO) throws BusinessException {
        mapper.map(donProgramDTO,donProgram);
        programDao.update(donProgram);
    }

    public void remove(DonProgramDTO donProgramDTO) throws BusinessException {
        mapper.map(donProgramDTO,donProgram);
        programDao.remove(donProgram);
    }

    public List<DonProgram> getAll() throws BusinessException {
        return programDao.getAll();
    }
    
}
