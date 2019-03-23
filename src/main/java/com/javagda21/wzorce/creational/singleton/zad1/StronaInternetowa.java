package com.javagda21.wzorce.creational.singleton.zad1;

public class StronaInternetowa implements IGeneratorTicketow {
    public int generujTicket() {
        return GeneratorTicektow.getInstance().pobierzNastepnyNumerek();
    }

}
