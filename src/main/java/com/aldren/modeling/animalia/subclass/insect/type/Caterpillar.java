package com.aldren.modeling.animalia.subclass.insect.type;

import com.aldren.modeling.animalia.domain.LandAnimal;
import com.aldren.modeling.animalia.subclass.insect.Insect;

public class Caterpillar extends Insect implements LandAnimal {

    @Override
    public void walk() {
        System.out.println("I am walking.");
    }

    @Override
    public void makeSound() {

    }
}
