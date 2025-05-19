package com.pluralsight;

public class House extends FixedAsset {
    int yearBuilt;
    int squareFeet;
    int bedrooms;

    public House(String name, double marketValue) {
        super(name, marketValue);
    }
}
