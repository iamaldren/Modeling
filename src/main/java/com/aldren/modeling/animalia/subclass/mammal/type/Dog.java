package com.aldren.modeling.animalia.subclass.mammal.type;

import com.aldren.modeling.animalia.subclass.mammal.LandMammal;

public class Dog extends LandMammal {

    @Override
    public void makeSound() {
        System.out.println("Woof, woof");
    }

}
