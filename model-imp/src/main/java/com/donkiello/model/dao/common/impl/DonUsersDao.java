/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donkiello.model.dao.common.impl;

import com.donkiello.model.dao.base.AbstractDao;
import com.donkiello.model.dao.common.inter.IDonUsersDao;
import com.donkiello.model.entity.common.DonUsers;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;


@Stateless
@LocalBean
public class DonUsersDao extends AbstractDao {

    public DonUsersDao() {
        super();
    }

    public void create(DonUsers t) {
        getEntityManager().persist(t);
    }

    public DonUsers searchById(Object id) {
        return getEntityManager().find(DonUsers.class, id);
    }

    public void update(DonUsers t) {
        getEntityManager().merge(t);
    }

    public void remove(DonUsers t) {
       // t.setDeleted(Short.valueOf("1"));
        t.setUsersDeleted(1);
        getEntityManager().merge(t);
    }

    public List<DonUsers> getAll() {
        Query query = getEntityManager().createQuery("SELECT c FROM DonUsers c WHERE c.usersDeleted = 0 ");
        List<DonUsers> users = query.getResultList();
        return users;
    }

    public String checkLogin(String username, String password){
        Query query = getEntityManager().createQuery("SELECT c FROM DonUsers c WHERE c.usersDeleted = 0 AND c.usersUsername=:un AND c.usersPassword=:pw");
        query.setParameter("un", username);
        query.setParameter("pw", password);
        List<DonUsers> users = query.getResultList();
        if (users==null || users.size() < 1) {
            return null;
        } else if (users.size() == 1) {
            return users.get(0).getUsersUsername();
        } else {
            return null;
        }
    }
    
    public DonUsers getOnlineUser(String username){
        
        Query query = getEntityManager().createQuery("SELECT c FROM DonUsers c WHERE c.usersDeleted = 0 AND c.usersUsername=:un");
        query.setParameter("un", username);
        DonUsers users = (DonUsers) query.getSingleResult();
        return users;
    }

}
