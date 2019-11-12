package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.animalia.domain.AerialAnimal;
import com.aldren.modeling.animalia.domain.OceanicAnimal;
import com.aldren.modeling.animalia.subclass.bird.Bird;

public class Duck extends Bird implements OceanicAnimal, AerialAnimal {

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }

    @Override
    public void makeSound() {
        System.out.println("Quack, quack");
    }

}
