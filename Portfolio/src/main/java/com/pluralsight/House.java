package com.pluralsight;

public class House extends FixedAsset {
    int yearBuilt;
    int squareFeet;
    int bedrooms;
    //need a base price for square feet and number of apartments
    //depreciation from year built
    private static final double BASE_PRICE = 50000;

    public House(String name, double marketValue) {
        super(name, marketValue);
    }
    @Override
    public double getValue() {
        return marketValue;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
}
