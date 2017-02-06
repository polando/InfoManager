/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohammad.donkiello;

import com.donkiello.model.entity.common.DonUsers;
import com.donkiello.model.service.common.impl.DonCustomerService;
import com.donkiello.model.service.common.impl.DonPersonalService;
import com.donkiello.model.service.common.impl.DonUsersService;
import com.donkiello.utility.JSFUtils;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mohammad
 */
@ManagedBean(name = "login")
@SessionScoped
public class AuthenticationHandler implements Serializable {

   // @EJB(lookup = "ejb:ear-1.0/model-imp-1.0/com.donkiello.model.service.common.impl.DonUsersService")


    private DonUsersService donUsersService;

    @EJB
   public void setDonUsersService(DonUsersService calculator)
   {
       this.donUsersService = calculator;
   }






    private DonCustomerService customerService;
    private String userName;
    private String password;
    private DonUsers onlineUser = null;
    private List<DonUsers> dus;
    private DonPersonalService donPersonalService;
    private DonUsers user;
    private String salam;



    public AuthenticationHandler() {
      //  JSFUtils.addFacesErrorMessage("In authentication");
        user = new DonUsers();
      //  donUsersService = getDonUsersService();
    }

    public void viewAction() {

        if (null != onlineUser) {
            System.out.println("online user is : " + onlineUser.getUsersName());
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("donkielloApp/views/firstPage.xhtml");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void checkSession() {
        if (null == onlineUser) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("donkielloApp/views/notfound.xhtml");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public String authenticate() {
        try {

            dus = donUsersService.getAll();
            if (userName == null || userName.length() < 1 || password == null || password.length() < 1) {
                JSFUtils.addFacesErrorMessage("Authentication Failed!", "Please Enter needed Values");
                password = "";
                return "";
            } else {
                String name = donUsersService.checkLogin(userName, password);
                if (name == null) {
                    JSFUtils.addFacesErrorMessage("Authentication Failed!", "Incorrect User name or Password");
                    password = "";
                    return "";
                } else {
                    try {
                        onlineUser = donUsersService.getOnlineUser(name);
                    } catch (Exception e) {

                        System.out.println(e.getMessage());
                    } finally {
//                        System.out.println(name);
                        return "firstPage?faces-redirect=true";

                    }
                }

            }
        } catch (Exception e) {
            System.out.println("exeption");
            System.out.println(e.getMessage() + " " + e.getCause());
            return "";
        }
    }

    public String logout() {
        onlineUser = null;
        return "login?faces-redirect=true";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private DonUsersService getDonUsersService() {
        return donUsersService;
    }

    public DonUsers getUser() {
        return user;
    }

    public void setUser(DonUsers user) {
        this.user = user;
    }

    public DonUsers getOnlineUser() {
        return onlineUser;
    }

    public void setOnlineUser(DonUsers onlineUser) {
        this.onlineUser = onlineUser;
    }

}
