package com.javagda21.wzorce.creational.abstractfactory.zad1;

import com.javagda21.wzorce.creational.builder.zad2.Stamp;

public class AbstractPC {
    String nazwaKomputera;
    COMPUTER_BRAND computer_brand;
    int cpu_power;
    double gpu_power;
    boolean isOverclocked;
    private int firstDayNumber;
    private int secondDayNumber;
    private int firstMonthNumber;
    private int secondMonthNumer;
    private int yearNumber1;
    private int yearNumber2;
    private int yearNumber3;
    private int yearNumber4;
    private int caseNumber;

    public AbstractPC(String nazwaKomputera, COMPUTER_BRAND computer_brand, int cpu_power, double gpu_power, boolean isOverclocked) {
        this.nazwaKomputera = nazwaKomputera;
        this.computer_brand = computer_brand;
        this.cpu_power = cpu_power;
        this.gpu_power = gpu_power;
        this.isOverclocked = isOverclocked;
    }

    public String getNazwaKomputera() {
        return nazwaKomputera;
    }

    public void setNazwaKomputera(String nazwaKomputera) {
        this.nazwaKomputera = nazwaKomputera;
    }

    public AbstractPC setFirstDayNumber(int firstDayNumber) {
        this.firstDayNumber = firstDayNumber;
        return this;
    }

    public AbstractPC setSecondDayNumber(int secondDayNumber) {
        this.secondDayNumber = secondDayNumber;
        return this;
    }

    public AbstractPC setFirstMonthNumber(int firstMonthNumber) {
        this.firstMonthNumber = firstMonthNumber;
        return this;
    }

    public AbstractPC setSecondMonthNumer(int secondMonthNumer) {
        this.secondMonthNumer = secondMonthNumer;
        return this;
    }

    public AbstractPC setYearNumber1(int yearNumber1) {
        this.yearNumber1 = yearNumber1;
        return this;
    }

    public AbstractPC setYearNumber2(int yearNumber2) {
        this.yearNumber2 = yearNumber2;
        return this;
    }

    public AbstractPC setYearNumber3(int yearNumber3) {
        this.yearNumber3 = yearNumber3;
        return this;
    }

    public AbstractPC setYearNumber4(int yearNumber4) {
        this.yearNumber4 = yearNumber4;
        return this;
    }

    public AbstractPC setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
        return this;
    }

    public Stamp createStamp() {
        return new Stamp.Builder().setFirstDayNumber(firstDayNumber).setSecondDayNumber(secondDayNumber).setFirstMonthNumber(firstMonthNumber).setSecondMonthNumer(secondMonthNumer).setYearNumber1(yearNumber1).setYearNumber2(yearNumber2).setYearNumber3(yearNumber3).setYearNumber4(yearNumber4).setCaseNumber(caseNumber).createStamp();
    }
}
