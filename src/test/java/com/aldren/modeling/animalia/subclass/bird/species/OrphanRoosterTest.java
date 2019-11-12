package com.aldren.modeling.animalia.subclass.bird.species;

import com.aldren.modeling.BaseTest;
import com.aldren.modeling.animalia.Animal;
import com.aldren.modeling.animalia.domain.LandAnimal;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrphanRoosterTest extends BaseTest {

    private final OrphanRooster rooster = new OrphanRooster();

    @Test
    public void testRoosterMakingSound() {
        rooster.makeSound();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("Cock-a-doodle-doo");
    }

    @Test
    public void testRoosterInheritance() {
        assertThat((rooster instanceof Animal)).isFalse();
        assertThat((rooster instanceof LandAnimal)).isFalse();
    }

}
