package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Customer {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int customerId;
    String mobile;
    String password;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<TripBooking> triplist = new ArrayList<>();

    public Customer() {
    }

    public Customer(int customerId, String mobile, String password, List<TripBooking> triplist) {
        this.customerId = customerId;
        this.mobile = mobile;
        this.password = password;
        this.triplist = triplist;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTriplist() {
        return triplist;
    }

    public void setTriplist(List<TripBooking> triplist) {
        this.triplist = triplist;
    }
}