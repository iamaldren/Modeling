package com.aldren.modeling.animalia.subclass.mammal;

import com.aldren.modeling.animalia.domain.OceanicAnimal;

public abstract class OceanicMammal implements OceanicAnimal {

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }

}
