package com.company.factory;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class IceCream {
    private String flavor;
    private String cupSize;
    private double salePrice;
    private double productionCost;
    private Date productionTime;
    private String[] ingredients;

    //Constructors
    public IceCream(String flavor,String cupSize, double salePrice, double productionCost, Date productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.cupSize = cupSize;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public IceCream() {
    }
    // Getter and setter methods
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public Date getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(Date productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    //Calculate profit
    public double calculateProfit(){

        return salePrice - productionCost;
    }

    // equals and hash code method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCream)) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice, salePrice) == 0 && Double.compare(iceCream.productionCost, productionCost) == 0 && flavor.equals(iceCream.flavor) && cupSize.equals(iceCream.cupSize) && productionTime.equals(iceCream.productionTime) && Arrays.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(flavor, cupSize, salePrice, productionCost, productionTime);
        result = 31 * result + Arrays.hashCode(ingredients);
        return result;
    }
    //toString method

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", cupSize='" + cupSize + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }

}
