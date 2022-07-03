package com.company;

import java.util.Objects;

public class Address {
    private String street1;
    private String street2;
    private String city;
    private String state;
    private int zip;

    public Address(String street1, String street2, String city, String state, int zip) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address() {
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return zip == address.zip && street1.equals(address.street1) && street2.equals(address.street2) && city.equals(address.city) && state.equals(address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street1, street2, city, state, zip);
    }

    @Override
    public String toString() {
        return "(" +
                "street1='" + street1 + '\'' +
                ", street2=" + street2 +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ')';
    }
}