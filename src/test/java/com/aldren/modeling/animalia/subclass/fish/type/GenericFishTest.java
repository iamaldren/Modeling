package com.aldren.modeling.animalia.subclass.fish.type;

import com.aldren.modeling.BaseTest;
import com.aldren.modeling.animalia.subclass.fish.Fish;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericFishTest extends BaseTest {

    private final Fish fish = new GenericFish();

    @Test
    public void testParrotMimicCat() {
        fish.swim();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am swimming.");
    }

}
