package com.aldren.modeling.animalia.subclass.insect.type;

import com.aldren.modeling.BaseTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButterflyTest extends BaseTest {

    private final Butterfly butterfly = new Butterfly();

    @Test
    public void testSongButterflyFlying() {
        butterfly.fly();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am flying.");
    }

    @Test
    public void testButterflyMakingSound() {
        butterfly.makeSound();
        assertThat(content.toString()).isEmpty();
    }

}
