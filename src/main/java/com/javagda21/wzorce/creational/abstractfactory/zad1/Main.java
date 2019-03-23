package com.javagda21.wzorce.creational.abstractfactory.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            AbstractPC mpc = AppleMac.createAppleMac1();

            HpPC komputerHP = HpPC.createHP100();
            SamsungPC komputerSamsung = SamsungPC.createSamsungT3();

            List<AbstractPC> listaKompow = new ArrayList<>();
            listaKompow.add(komputerHP);
            listaKompow.add(komputerSamsung);



            for (AbstractPC a:  listaKompow  ) {
                System.out.println(a);

            }
        }
    }
