package com.company;

public class CustomerApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstName("Ephrem");
        customer.setLastName("Binchebo");
        customer.setEmail("jephremg@gmail.com");
        customer.setPhoneNumber("513-485-6418");

        Address billingAddress = new Address();
        billingAddress.setStreet1("3022 Forest Lane");
        billingAddress.setStreet2("Apt 222");
        billingAddress.setCity("Dallas");
        billingAddress.setState("Texas");
        billingAddress.setZip(75234);

        Address shippingAddress = new Address();
        shippingAddress.setStreet1("2958 Westridge Avenue");
        shippingAddress.setStreet2("Apt 02");
        shippingAddress.setCity("Cincinaty");
        shippingAddress.setState("Ohio");
        shippingAddress.setZip(45238);

        customer.setBillingAddress(billingAddress);
        customer.setShippingAddress(shippingAddress);
        customer.setRewardMember(true);
        System.out.println(customer.toString());
        System.out.println(customer.getBillingAddress());
        System.out.println(customer.getShippingAddress().getZip());
        System.out.println(customer.getShippingAddress().getState());
        System.out.println(customer.getPhoneNumber());
        System.out.println(customer.getEmail());
        System.out.println(customer.isRewardMember());

        System.out.println(customer.toString());
    }
}
