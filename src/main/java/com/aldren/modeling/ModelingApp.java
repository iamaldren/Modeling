package com.aldren.modeling;

import com.aldren.modeling.animalia.Animal;
import com.aldren.modeling.animalia.subclass.amphibian.type.Frog;
import com.aldren.modeling.animalia.subclass.bird.species.OrphanRooster;
import com.aldren.modeling.animalia.subclass.bird.species.Rooster;
import com.aldren.modeling.animalia.subclass.bird.type.Chicken;
import com.aldren.modeling.animalia.subclass.bird.type.Duck;
import com.aldren.modeling.animalia.subclass.bird.type.Parrot;
import com.aldren.modeling.animalia.subclass.bird.type.SongBird;
import com.aldren.modeling.animalia.subclass.fish.Fish;
import com.aldren.modeling.animalia.subclass.fish.type.ClownFish;
import com.aldren.modeling.animalia.subclass.fish.type.GenericFish;
import com.aldren.modeling.animalia.subclass.fish.type.Shark;
import com.aldren.modeling.animalia.subclass.insect.type.Butterfly;
import com.aldren.modeling.animalia.subclass.insect.type.Caterpillar;
import com.aldren.modeling.animalia.subclass.mammal.type.Cat;
import com.aldren.modeling.animalia.subclass.mammal.type.Dog;
import com.aldren.modeling.animalia.subclass.mammal.type.Dolphin;
import com.aldren.modeling.service.CountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelingApp {

    public static void main(String[] args) {
        /**
         * Question #A1
         */
        SongBird bird = new SongBird();
        bird.walk();
        bird.fly();
        bird.sing();

        /**
         * Question #A2
         */
        Duck duck = new Duck();
        duck.swim();
        duck.makeSound();

        Chicken chicken = new Chicken();
        chicken.makeSound();

        /**
         * Question #A3
         */
        Chicken rooster = new Rooster();
        rooster.makeSound();

        OrphanRooster orphanRooster = new OrphanRooster();
        orphanRooster.makeSound();

        /**
         * Question #A4
         */
        Parrot<Dog> dogParrot = new Parrot<>(new Dog());
        dogParrot.makeSound();

        Parrot<Cat> catParrot = new Parrot<>(new Cat());
        catParrot.makeSound();

        Parrot<Rooster> roosterParrot = new Parrot<>(new Rooster());
        roosterParrot.makeSound();

        /**
         * Question #B1
         */
        Fish fish = new GenericFish();
        fish.swim();

        /**
         * Question #B2
         */
        Fish shark = new Shark();
        System.out.println("Shark Size: " + shark.getSize());
        System.out.println("Shark Color: " + shark.getColor());
        System.out.println("Eating other fish? " + shark.isEatOtherFish());
        System.out.println("Making jokes? " + shark.isMakeJokes());

        Fish clownFish = new ClownFish();
        System.out.println("Clownfish Size: " + clownFish.getSize());
        System.out.println("Clownfish Color: " + clownFish.getColor());
        System.out.println("Eating other fish? " + clownFish.isEatOtherFish());
        System.out.println("Making jokes? " + clownFish.isMakeJokes());

        /**
         * Question #B3
         */
        Dolphin dolphin = new Dolphin();
        dolphin.swim();

        /**
         * Question #D1
         */
        Butterfly butterfly = new Butterfly();
        butterfly.fly();
        butterfly.makeSound(); //Will not do anything

        /**
         * Question #D2
         */
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.walk();

        /**
         * Question E1
         */
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
        CountService countService = new CountService(animals);
        countService.count();
        System.out.printf("%d animals can walk.\n", countService.getWalkingCount());
        System.out.printf("%d animals can fly.\n", countService.getFlyingCount());
        System.out.printf("%d animals can sing.\n", countService.getSingingCount());
        System.out.printf("%d animals can swim.\n", countService.getSwimmingCount());

        SpringApplication.run(ModelingApp.class, args);
    }

}
