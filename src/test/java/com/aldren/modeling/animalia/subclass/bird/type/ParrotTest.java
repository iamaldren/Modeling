package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.BaseTest;
import com.aldren.modeling.animalia.subclass.bird.species.Rooster;
import com.aldren.modeling.animalia.subclass.mammal.type.Cat;
import com.aldren.modeling.animalia.subclass.mammal.type.Dog;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParrotTest extends BaseTest {

    @Test
    public void testParrotMimicDog() {
        Parrot<Dog> dogParrot = new Parrot<>(new Dog());
        dogParrot.makeSound();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("Woof, woof");
    }

    @Test
    public void testParrotMimicCat() {
        Parrot<Cat> catParrot = new Parrot<>(new Cat());
        catParrot.makeSound();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("Meow");
    }

    @Test
    public void testParrotMimicRooster() {
        Parrot<Rooster> roosterParrot = new Parrot<>(new Rooster());
        roosterParrot.makeSound();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("Cock-a-doodle-doo");
    }

}
