package com.aldren.modeling.animalia.subclass.mammal.type;

import com.aldren.modeling.animalia.subclass.mammal.LandMammal;

public class Cat extends LandMammal {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

}
