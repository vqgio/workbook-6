package com.pluralsight;

public class Jewelry extends FixedAsset {
    double karat;
//    private static final double PRICE_PER_KARAT = 1300;

    public Jewelry(double karat) {
        super("Jewelry", 1300);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat * marketValue;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
}
