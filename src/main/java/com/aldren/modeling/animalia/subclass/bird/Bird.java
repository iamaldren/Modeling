package com.aldren.modeling.animalia.subclass.bird;

import com.aldren.modeling.animalia.domain.AerialAnimal;
import com.aldren.modeling.animalia.domain.LandAnimal;

public abstract class Bird implements LandAnimal {

    public void walk() {
        System.out.println("I am walking.");
    }

    public void makeSound() {
        System.out.println("Chirp, chirp");
    }

}
