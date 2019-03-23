package com.javagda21.wzorce.creational.singleton.zad1;

public class GeneratorTicektow {
  //  INSTANCE;
    private static GeneratorTicektow ourInstance = new GeneratorTicektow();

    public static GeneratorTicektow getInstance() {
        return ourInstance;
    }

    private GeneratorTicektow() {
    }
    public int numerek = 1;

    public int pobierzNastepnyNumerek(){
        return numerek++;
    }
}
