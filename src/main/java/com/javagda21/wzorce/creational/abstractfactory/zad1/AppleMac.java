package com.javagda21.wzorce.creational.abstractfactory.zad1;

public class AppleMac extends AbstractPC {

    public AppleMac(String name, int power, double gpuPower, boolean overclocked) {
        super(name, COMPUTER_BRAND.APPLE, power, gpuPower, overclocked);
    }
    public static AppleMac createAppleMac1(){
        return new AppleMac("1", 87, 96, true);
    }
    public static AppleMac createAppleMac2() {
        return new AppleMac("2", 100, 100, true);
    }
}
