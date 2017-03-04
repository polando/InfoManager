package com.donkiello.model.entity.common;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by ussocom on 2/1/2017.
 */
@Entity
@Table(name = "don_users", schema = "dondb", catalog = "")
public class DonUsers {
    private int usersId;
    private String usersUsername;
    private String usersPassword;
    private String usersName;
    private String usersFamily;
    private byte[] usersImage;
    private String usersRole;
    private Integer usersDeleted;

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UsersID",unique = true,nullable = false)
    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    @Basic
    @Column(name = "UsersUsername")
    public String getUsersUsername() {
        return usersUsername;
    }

    public void setUsersUsername(String usersUsername) {
        this.usersUsername = usersUsername;
    }

    @Basic
    @Column(name = "UsersPassword")
    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }

    @Basic
    @Column(name = "UsersName")
    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    @Basic
    @Column(name = "UsersFamily")
    public String getUsersFamily() {
        return usersFamily;
    }

    public void setUsersFamily(String usersFamily) {
        this.usersFamily = usersFamily;
    }

    @Basic
    @Column(name = "UsersImage")
    public byte[] getUsersImage() {
        return usersImage;
    }

    public void setUsersImage(byte[] usersImage) {
        this.usersImage = usersImage;
    }

    @Basic
    @Column(name = "UsersRole")
    public String getUsersRole() {
        return usersRole;
    }

    public void setUsersRole(String usersRole) {
        this.usersRole = usersRole;
    }

    @Basic
    @Column(name = "UsersDeleted")
    public Integer getUsersDeleted() {
        return usersDeleted;
    }

    public void setUsersDeleted(Integer usersDeleted) {
        this.usersDeleted = usersDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DonUsers donUsers = (DonUsers) o;

        if (usersId != donUsers.usersId) return false;
        if (usersUsername != null ? !usersUsername.equals(donUsers.usersUsername) : donUsers.usersUsername != null)
            return false;
        if (usersPassword != null ? !usersPassword.equals(donUsers.usersPassword) : donUsers.usersPassword != null)
            return false;
        if (usersName != null ? !usersName.equals(donUsers.usersName) : donUsers.usersName != null) return false;
        if (usersFamily != null ? !usersFamily.equals(donUsers.usersFamily) : donUsers.usersFamily != null)
            return false;
        if (!Arrays.equals(usersImage, donUsers.usersImage)) return false;
        if (usersRole != null ? !usersRole.equals(donUsers.usersRole) : donUsers.usersRole != null) return false;
        if (usersDeleted != null ? !usersDeleted.equals(donUsers.usersDeleted) : donUsers.usersDeleted != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usersId;
        result = 31 * result + (usersUsername != null ? usersUsername.hashCode() : 0);
        result = 31 * result + (usersPassword != null ? usersPassword.hashCode() : 0);
        result = 31 * result + (usersName != null ? usersName.hashCode() : 0);
        result = 31 * result + (usersFamily != null ? usersFamily.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(usersImage);
        result = 31 * result + (usersRole != null ? usersRole.hashCode() : 0);
        result = 31 * result + (usersDeleted != null ? usersDeleted.hashCode() : 0);
        return result;
    }
}
