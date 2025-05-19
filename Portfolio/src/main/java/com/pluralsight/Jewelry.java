package com.pluralsight;

public class Jewelry extends FixedAsset {
    double karat;
    private static final double PRICE_PER_KARAT = 1300;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat * PRICE_PER_KARAT;
    }
}
