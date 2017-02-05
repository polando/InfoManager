/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.donkiello.model.service.common.inter;

import com.donkiello.dto.DonCustomerDTO;
import com.donkiello.model.entity.common.*;
import com.donkiello.model.exeption.BusinessException;
import com.donkiello.model.service.base.IService;
import javax.ejb.Remote;
import javax.ejb.Local;
import java.util.List;


@Local
public interface IDonCustomerService extends IService<DonCustomerDTO>{
    void insertPhoto(byte[] image, int pid) throws BusinessException;
    List<DonPast> getNotDeletedPasts(Integer object);
    List<DonProgram> getNotDeletedPrograms(Integer object);
    List<DonBussiness> getCustomerBusinessInfo(Integer object);
    List<DonPersonal> getCustomerPersonalInfo(Integer object);
}
