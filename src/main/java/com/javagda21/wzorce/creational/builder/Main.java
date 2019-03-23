package com.javagda21.wzorce.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GameCharacter.Builder builder = new GameCharacter.Builder();

        GameCharacter gameCharacter = builder
                .setHealth(1)
                .setMana(3)
                .setNumberOfPoints(12)
                .create();

        GameCharacter tenSamCoWyzej = builder.create();

        GameCharacter bohater2 = builder
                .setName("jules")
                .create();


        System.out.println(gameCharacter);
        System.out.println(bohater2);
        System.out.println(tenSamCoWyzej);

        List<GameCharacter> list = new ArrayList<>();
        list.add(gameCharacter);
        list.add(bohater2);
        list.add(tenSamCoWyzej);

        for (GameCharacter a: list) {
            System.out.println(a);

        }

    }
}