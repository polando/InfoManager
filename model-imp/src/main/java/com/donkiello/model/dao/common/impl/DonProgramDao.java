/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.dao.common.impl;

import com.donkiello.model.dao.base.AbstractDao;
import com.donkiello.model.entity.common.DonProgram;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;


@Stateless
@LocalBean
public class DonProgramDao extends AbstractDao {
    
    public DonProgramDao(){
     super();   
    }

    public void create(DonProgram t) {
        getEntityManager().persist(t);
    }

    public DonProgram searchById(Object id) {
        return getEntityManager().find(DonProgram.class, id);
    }

    public void update(DonProgram t) {
        getEntityManager().merge(t);
    }

    public void remove(DonProgram t) {
       // t.setDeleted(Short.valueOf("1"));
        t.setProgramDeleted(1);
        getEntityManager().merge(t);
    }

    public List<DonProgram> getAll() {
        Query query = getEntityManager().createQuery("SELECT c FROM DonProgram c WHERE c.programDeleted = 0 ");
        List<DonProgram> programms = query.getResultList();
        return programms;
    }
    
}
