package com.javagda21.wzorce.creational.builder;

public class GameCharacter {
    String name;
    int health;
    int mana;
    int numberOfPoints;

    public GameCharacter(String name, int health, int mana, int numberOfPoints) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.numberOfPoints = numberOfPoints;
    }

    public static class Builder {
        String name;
        int health;
        int mana;
        int numberOfPoints;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder setNumberOfPoints(int numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }
        public GameCharacter create (){
            return new GameCharacter(name, health, mana, numberOfPoints);
        }

    }
}