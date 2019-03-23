package com.javagda21.wzorce.creational.builder.zad2;

public class Main {
    public static void main(String[] args) {
        Stamp.Builder builder = new Stamp.Builder();

        Stamp stamp = builder
                .setFirstDayNumber(1)
                .setFirstMonthNumber(3)
                .setSecondDayNumber(3)
                .setFirstMonthNumber(6)
                .setYearNumber1(1)
                .setYearNumber2(2)
                .setYearNumber3(3)
                .setYearNumber4(3)
                .setCaseNumber(3)
                .createStamp();
    }
}
