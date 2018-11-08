package com.cq.springbootjpademo.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;


@Entity
public class Wallet {

    @Id
    @GeneratedValue
    private Long id;

    private double balence;

    public Wallet() {
    }

    public Wallet(double balence) {
        this.balence = balence;
    }

    public Long getId() {
        return id;
    }


    public double getBalence() {
        return balence;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }
}
