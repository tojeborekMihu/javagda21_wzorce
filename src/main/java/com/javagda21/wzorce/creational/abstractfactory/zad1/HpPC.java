package com.javagda21.wzorce.creational.abstractfactory.zad1;

public class HpPC extends AbstractPC {

    public HpPC(String name, int power, double gpuPower, boolean overclocked) {
        super(name, COMPUTER_BRAND.HP, power, gpuPower, overclocked);
    }
    public static HpPC createHP100(){
        return new HpPC("HP100", 44, 55, false);
    }
    public static AsusPC createHP30() {
        return new AsusPC("HP30", 55, 44, false);
    }
}
