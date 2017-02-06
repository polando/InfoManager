/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.service.common.impl;

import com.donkiello.dto.DonUsersDTO;
import com.donkiello.model.dao.base.AbstractDao;
import com.donkiello.model.dao.common.impl.DonUsersDao;
import com.donkiello.model.entity.common.DonUsers;
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

public class DonUsersService {

    MapperFactory mapperFactory;
    MapperFacade mapper;
    DonUsers donUsers;

    @EJB
    private DonUsersDao donUsersService;

    @PostConstruct
    private void init(){
        mapperFactory = new DefaultMapperFactory.Builder().build();
        mapper = mapperFactory.getMapperFacade();
        donUsers = new DonUsers();
    }


    public EntityTransaction getTransaction() {
        return ((AbstractDao)donUsersService).getEntityManager().getTransaction();
    }

    public void create(DonUsersDTO donUsersDTO) throws BusinessException {
        mapper.map(donUsersDTO,donUsers);
        donUsersService.create(donUsers);
    }

    public DonUsersDTO searchById(Object id) throws BusinessException {
        DonUsersDTO donUsersDTO =new DonUsersDTO();
        mapper.map(donUsersService.searchById(id),donUsersDTO);
        return donUsersDTO;
    }

    public void update(DonUsersDTO donUsersDTO) throws BusinessException {
        mapper.map(donUsersDTO,donUsers);
        donUsersService.update(donUsers);
    }

    public void remove(DonUsersDTO donUsersDTO) throws BusinessException {
        mapper.map(donUsersDTO,donUsers);
        donUsersService.remove(donUsers);
    }

    public List<DonUsers> getAll() throws BusinessException {
        return donUsersService.getAll();
    }

    public String checkLogin(String username, String password) throws BusinessException{
        return donUsersService.checkLogin(username, password);
    }
    public DonUsers getOnlineUser(String name){
        return donUsersService.getOnlineUser(name);
    }
}
