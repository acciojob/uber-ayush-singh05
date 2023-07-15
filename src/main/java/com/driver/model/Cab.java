package com.driver.model;

import javax.persistence.*;

@Entity
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int perKmRate;
    private boolean avaliable;
    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab() {
    }

    public Cab(int id, int perKmRate, boolean avaliable, Driver driver) {
        this.id = id;
        this.perKmRate = perKmRate;
        this.avaliable = avaliable;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}