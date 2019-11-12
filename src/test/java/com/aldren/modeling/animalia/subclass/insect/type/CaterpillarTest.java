package com.aldren.modeling.animalia.subclass.insect.type;

import com.aldren.modeling.BaseTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CaterpillarTest extends BaseTest {

    private final Caterpillar caterpillar = new Caterpillar();

    @Test
    public void testCaterpillarWalking() {
        caterpillar.walk();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am walking.");
    }

}
