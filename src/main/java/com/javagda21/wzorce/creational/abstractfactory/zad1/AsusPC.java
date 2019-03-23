package com.javagda21.wzorce.creational.abstractfactory.zad1;

public class AsusPC extends AbstractPC {
    

    public  AsusPC(String name, int power, double gpuPower, boolean overclocked){
        super (name, COMPUTER_BRAND.ASUS, power, gpuPower, overclocked);
    }
    public static AsusPC createAsusN53(){
        return new AsusPC("N53", 100, 100, false);
    }
    public static AsusPC createasusZ44(){
        return new AsusPC("Z44", 98, 88, false);
    }
}
