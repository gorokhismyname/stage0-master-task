package com.epam.OOP;

public class Animal {

    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {

        String pawsDescription = numberOfPaws == 1 ? "paw" : "paws";
        String furParticle = hasFur ? "a" : "no";

        return String.format("This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, pawsDescription, furParticle);

    }
}
