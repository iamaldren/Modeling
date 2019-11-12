package com.aldren.modeling.animalia.subclass.bird.species;

import com.aldren.modeling.BaseTest;
import com.aldren.modeling.animalia.subclass.bird.type.Chicken;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoosterTest extends BaseTest {

    private final Chicken rooster = new Rooster();

    @Test
    public void testRoosterMakingSound() {
        rooster.makeSound();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("Cock-a-doodle-doo");
    }

}
