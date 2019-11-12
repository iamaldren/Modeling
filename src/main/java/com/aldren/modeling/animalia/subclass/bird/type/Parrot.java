package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.animalia.Animal;
import com.aldren.modeling.animalia.domain.AerialAnimal;
import com.aldren.modeling.animalia.subclass.bird.Bird;

public class Parrot<T> extends Bird implements AerialAnimal {

    private Animal animal;

    public Parrot() {}

    public Parrot(T animal) {
        this.animal = (Animal) animal;
    }

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }

    @Override
    public void makeSound() {
        animal.makeSound();
    }

}
