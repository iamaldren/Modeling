package com.aldren.modeling.animalia.subclass.fish;

import com.aldren.modeling.animalia.domain.OceanicAnimal;

public abstract class Fish implements OceanicAnimal {

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }

}
