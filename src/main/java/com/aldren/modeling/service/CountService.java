package com.aldren.modeling.service;

import com.aldren.modeling.animalia.Animal;
import com.aldren.modeling.animalia.domain.AerialAnimal;
import com.aldren.modeling.animalia.domain.LandAnimal;
import com.aldren.modeling.animalia.domain.MusicalAnimal;
import com.aldren.modeling.animalia.domain.OceanicAnimal;

public class CountService {

    private Animal[] animals;

    private int walkingCount = 0;
    private int flyingCount = 0;
    private int swimmingCount = 0;
    private int singingCount = 0;

    public CountService() {
    }

    public CountService(Animal[] animals) {
        this.animals = animals;
    }

    public void count() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof LandAnimal) {
                walkingCount += 1;
            }

            if (animals[i] instanceof OceanicAnimal) {
                swimmingCount += 1;
            }

            if (animals[i] instanceof AerialAnimal) {
                flyingCount += 1;
            }

            if (animals[i] instanceof MusicalAnimal) {
                singingCount += 1;
            }
        }
    }

    public int getWalkingCount() {
        return walkingCount;
    }

    public int getFlyingCount() {
        return flyingCount;
    }

    public int getSwimmingCount() {
        return swimmingCount;
    }

    public int getSingingCount() {
        return singingCount;
    }

}
