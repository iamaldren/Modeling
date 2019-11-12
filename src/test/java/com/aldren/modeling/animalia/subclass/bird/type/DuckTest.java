package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.BaseTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuckTest extends BaseTest {

    private final Duck duck = new Duck();

    @Test
    public void testDuckMakingSound() {
        duck.makeSound();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("Quack, quack");
    }

    @Test
    public void testDuckSwimming() {
        duck.swim();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am swimming.");
    }

}
