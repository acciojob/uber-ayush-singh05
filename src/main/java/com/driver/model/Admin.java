package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int adminId;
    String userName;
    String password;

    public Admin() {
    }

    public Admin(int id, String userName, String password) {
        this.adminId = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return adminId;
    }

    public void setId(int id) {
        this.adminId = id;
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
}