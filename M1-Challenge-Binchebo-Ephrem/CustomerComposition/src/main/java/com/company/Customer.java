package com.company;

import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address shippingAddress;
    private Address billingAddress;
    private boolean rewardMember;

    public Customer(String firstName, String lastName, String email, String phoneNumber, Address shippingAddress, Address billingAddress, boolean rewardMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.rewardMember = rewardMember;
    }

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isRewardMember() {
        return rewardMember;
    }

    public void setRewardMember(boolean rewardMember) {
        this.rewardMember = rewardMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return rewardMember == customer.rewardMember && firstName.equals(customer.firstName) && lastName.equals(customer.lastName) && email.equals(customer.email) && phoneNumber.equals(customer.phoneNumber) && shippingAddress.equals(customer.shippingAddress) && billingAddress.equals(customer.billingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, shippingAddress, billingAddress, rewardMember);
    }

    @Override
    public String toString() {
        return "Customer(" +
                "FirstName: " + firstName + '\'' +
                ", LastName: " + lastName + '\'' +
                ", email: " + email + '\'' +
                ", PhoneNumber: '" + phoneNumber + '\'' +
                ", ShippingAddress" + shippingAddress +
                ", BillingAddress" + billingAddress +
                ", rewardMember: " + rewardMember +
                ')';
    }
}
