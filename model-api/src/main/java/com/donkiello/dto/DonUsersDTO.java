package com.donkiello.dto;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by ussocom on 2/1/2017.
 */

public class DonUsersDTO {
    private int usersId;
    private String usersUsername;
    private String usersPassword;
    private String usersName;
    private String usersFamily;
    private byte[] usersImage;
    private String usersRole;
    private Integer usersDeleted;


    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public String getUsersUsername() {
        return usersUsername;
    }

    public void setUsersUsername(String usersUsername) {
        this.usersUsername = usersUsername;
    }


    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }


    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersFamily() {
        return usersFamily;
    }

    public void setUsersFamily(String usersFamily) {
        this.usersFamily = usersFamily;
    }

    public byte[] getUsersImage() {
        return usersImage;
    }

    public void setUsersImage(byte[] usersImage) {
        this.usersImage = usersImage;
    }

    public String getUsersRole() {
        return usersRole;
    }

    public void setUsersRole(String usersRole) {
        this.usersRole = usersRole;
    }

    public Integer getUsersDeleted() {
        return usersDeleted;
    }

    public void setUsersDeleted(Integer usersDeleted) {
        this.usersDeleted = usersDeleted;
    }

}
