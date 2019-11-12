package com.aldren.modeling.service;

import com.aldren.modeling.animalia.Animal;
import com.aldren.modeling.animalia.subclass.amphibian.type.Frog;
import com.aldren.modeling.animalia.subclass.bird.species.Rooster;
import com.aldren.modeling.animalia.subclass.bird.type.Chicken;
import com.aldren.modeling.animalia.subclass.bird.type.Duck;
import com.aldren.modeling.animalia.subclass.bird.type.Parrot;
import com.aldren.modeling.animalia.subclass.bird.type.SongBird;
import com.aldren.modeling.animalia.subclass.fish.type.ClownFish;
import com.aldren.modeling.animalia.subclass.fish.type.GenericFish;
import com.aldren.modeling.animalia.subclass.fish.type.Shark;
import com.aldren.modeling.animalia.subclass.insect.type.Butterfly;
import com.aldren.modeling.animalia.subclass.insect.type.Caterpillar;
import com.aldren.modeling.animalia.subclass.mammal.type.Cat;
import com.aldren.modeling.animalia.subclass.mammal.type.Dog;
import com.aldren.modeling.animalia.subclass.mammal.type.Dolphin;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountServiceTest {

    private CountService countService;

    @Before
    public void setup() {
        Animal[] animals = new Animal[]{
                new SongBird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot<>(new Dog()),
                new GenericFish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Butterfly(),
                new Caterpillar(),
                new Cat(),
                new Dog(),
                new Frog()
        };
        countService = new CountService(animals);
        countService.count();
    }

    @Test
    public void testCount() {
        assertThat(countService.getWalkingCount()).isEqualTo(9);
        assertThat(countService.getFlyingCount()).isEqualTo(4);
        assertThat(countService.getSingingCount()).isEqualTo(1);
        assertThat(countService.getSwimmingCount()).isEqualTo(6);
    }

}
