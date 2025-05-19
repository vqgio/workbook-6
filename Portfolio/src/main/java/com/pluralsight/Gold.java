package com.pluralsight;

public class Gold extends FixedAsset {
    double weight;
    private static double PRICE_PER_OUNCE = 3000;

    public Gold(double weight) {
        super("gold", weight * PRICE_PER_OUNCE);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public static double getPricePerOunce() {
        return PRICE_PER_OUNCE;
    }
    public void setPricePerOunce(double pricePerOunce) {
        Gold.PRICE_PER_OUNCE = pricePerOunce;
        marketValue = PRICE_PER_OUNCE * this.weight;
    }
//    @Override
//    public double getValue() {
//        return this.weight * PRICE_PER_OUNCE;
//    }
}
