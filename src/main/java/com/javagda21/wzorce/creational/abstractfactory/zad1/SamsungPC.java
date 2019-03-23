package com.javagda21.wzorce.creational.abstractfactory.zad1;

public class SamsungPC extends AbstractPC {

    public SamsungPC(String name, int power, double gpuPower, boolean overclocked) {
        super(name, COMPUTER_BRAND.SAMSUNG, power, gpuPower, overclocked);
    }
    public static SamsungPC createSamsungX3(){
        return new SamsungPC("X3", 85, 55, false);
    }
    public static SamsungPC createSamsungT3() {
        return new SamsungPC("HP30", 100, 100, true);
    }
}
