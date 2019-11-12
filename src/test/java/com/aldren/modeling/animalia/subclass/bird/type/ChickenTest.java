package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.BaseTest;
import com.aldren.modeling.animalia.domain.AerialAnimal;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChickenTest extends BaseTest {

    private final Chicken chicken = new Chicken();

    @Test
    public void testChickenMakingSound() {
        chicken.makeSound();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("Cluck, cluck");
    }

    @Test
    public void testChickenFlying() {
        assertThat((chicken instanceof AerialAnimal)).isFalse();
    }

}
