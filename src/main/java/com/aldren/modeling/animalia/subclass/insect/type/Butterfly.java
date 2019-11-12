package com.aldren.modeling.animalia.subclass.insect.type;

import com.aldren.modeling.animalia.domain.AerialAnimal;
import com.aldren.modeling.animalia.subclass.insect.Insect;

public class Butterfly extends Insect implements AerialAnimal {

    @Override
    public void makeSound() {}

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }

}
