package com.aldren.modeling.animalia.subclass.fish;

import com.aldren.modeling.animalia.domain.OceanicAnimal;

public abstract class Fish implements OceanicAnimal {

    protected String size;
    protected String color;
    protected boolean isEatOtherFish;
    protected boolean isMakeJokes;

    public Fish() {
    }

    public Fish(String size, String color, boolean isEatOtherFish, boolean isMakeJokes) {
        this.size = size;
        this.color = color;
        this.isEatOtherFish = isEatOtherFish;
        this.isMakeJokes = isMakeJokes;
    }

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }

    @Override
    public void makeSound() {
        System.out.println("Bubble, bubble");
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isEatOtherFish() {
        return isEatOtherFish;
    }

    public boolean isMakeJokes() {
        return isMakeJokes;
    }

}
