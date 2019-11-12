package com.aldren.modeling.animalia.subclass.mammal.type;

import com.aldren.modeling.BaseTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DolphinTest extends BaseTest {

    private final Dolphin dolphin = new Dolphin();

    @Test
    public void testDolphinSwimming() {
        dolphin.swim();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am swimming.");
    }

}
