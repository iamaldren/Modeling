package com.aldren.modeling.animalia.subclass.amphibian.type;

import com.aldren.modeling.BaseTest;
import com.aldren.modeling.animalia.subclass.amphibian.Amphibian;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogTest extends BaseTest {

    private final Amphibian frog = new Frog();

    @Test
    public void testFrogSwimming() {
        frog.swim();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am swimming.");
    }

    @Test
    public void testFrogWalking() {
        frog.walk();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am walking.");
    }

}
