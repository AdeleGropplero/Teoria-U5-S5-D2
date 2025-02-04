package com.epicode.projects.DependencyInjection;

public class EuropeanAddress extends Address implements IAddress{

    private String city;
    private String state;
    private String street;


    public EuropeanAddress(String city, String state, String street) {
        this.city = city;
        this.state = state;
        this.street = street;
    }
}
