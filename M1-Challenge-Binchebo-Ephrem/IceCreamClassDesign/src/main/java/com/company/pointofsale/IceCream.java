package com.company.pointofsale;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;
    private String cupSize;
    private boolean expired;
    private Date salesTime;
    private double TAX;
    private double SERVICE_FEE;

    //Constructors

    public IceCream(String flavor, double price, int quantity, String cupSize, boolean expired, Date salesTime, double TAX, double SERVICE_FEE) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.cupSize = cupSize;
        this.expired = expired;
        this.salesTime = salesTime;
        this.TAX = TAX;
        this.SERVICE_FEE = SERVICE_FEE;
    }

    public IceCream() {
    }
    //Methods
    //Calculate the the total price at point of sale
    public double calculateTheTotalPriceAtPointOfSale(String state) {


        if (this.price > 0) {
            double totalPrice = this.price;

            if (state == "OH" || state == "WA" || state == "LA" || state == "KY" || state == "AL") {
                TAX = 0.15;
                SERVICE_FEE = 0.08;
                totalPrice = price + price * TAX + price * SERVICE_FEE;
                return totalPrice;
            }
            if (state == "DC" || state == "AR" || state == "CA" || state == "KS" || state == "IL") {
                TAX = 0.19;
                SERVICE_FEE = 0.1;
                totalPrice = price + price * TAX + price * SERVICE_FEE;
                return totalPrice;
            }
            if (state == "MA" || state == "MO" || state == "NV" || state == "IN" || state == "GA") {
                TAX = 0.11;
                SERVICE_FEE = 0.08;
                totalPrice = price + price * TAX + price * SERVICE_FEE;
                return totalPrice;
            }
            if (state == "TX") {
                TAX = 0;
                SERVICE_FEE = 0.00;
                totalPrice = price + price * TAX + price * SERVICE_FEE;
                return totalPrice;
            }
        }else{
            System.out.println("Enter selling price");
        }
            return this.price;
        }

    //Calculate the amout of profit from sale
    public double calculateGrossProfitFromSale(com.company.factory.IceCream iceCream, String state){
        double totalPriceAtPointOfSale = this.calculateTheTotalPriceAtPointOfSale(state);
        double productionCost = iceCream.getProductionCost();
        if(price > 0) {
            return totalPriceAtPointOfSale - productionCost;
        }else{
            System.out.println("Enter selling price");
            return 0.0;
        }
    }
    //Calculate the total amount of sales
    public double amountOfSalesPerFlavor(){
        return quantity * price;
    }
    //Checking the expiration date
    public boolean evaluateTheExpirationDateOfIceCream(com.company.factory.IceCream iceCream){
        int expirationDays = this.salesTime.getDate() - iceCream.getProductionTime().getDate();
        if( expirationDays >= 5){
            System.out.println("This " + this.getFlavor() + " is " + " expired");
            this.expired = true;
        }else{
            System.out.println("This" + this.getFlavor() + " is not expired " + (expirationDays-5) + " days left." );
            this.expired =false;
        }
        return this.expired;
    }
    //Getter and Setter methods
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Date getSalesTime() {
        return salesTime;
    }

    public void setSalesTime(Date salesTime) {
        this.salesTime = salesTime;
    }

    public double getTAX() {
        return TAX;
    }

    public void setTAX(double TAX) {
        this.TAX = TAX;
    }

    public double getSERVICE_FEE() {
        return SERVICE_FEE;
    }

    public void setSERVICE_FEE(double SERVICE_FEE) {
        this.SERVICE_FEE = SERVICE_FEE;
    }

    // equals method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCream)) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0 && quantity == iceCream.quantity && expired == iceCream.expired && Double.compare(iceCream.TAX, TAX) == 0 && Double.compare(iceCream.SERVICE_FEE, SERVICE_FEE) == 0 && flavor.equals(iceCream.flavor) && cupSize.equals(iceCream.cupSize) && salesTime.equals(iceCream.salesTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, price, quantity, cupSize, expired, salesTime, TAX, SERVICE_FEE);
    }

    //to String method

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", cupSize='" + cupSize + '\'' +
                ", expired=" + expired +
                ", salesTime=" + salesTime +
                ", TAX=" + TAX +
                ", SERVICE_FEE=" + SERVICE_FEE +
                '}';
    }

}
