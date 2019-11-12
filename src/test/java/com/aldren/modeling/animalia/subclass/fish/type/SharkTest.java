package com.aldren.modeling.animalia.subclass.fish.type;

import com.aldren.modeling.BaseTest;
import com.aldren.modeling.animalia.subclass.fish.Fish;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SharkTest extends BaseTest {

    private final Fish shark = new Shark();

    @Test
    public void testSharkAttributes() {
        assertThat(shark.getSize()).isEqualTo("Large");
        assertThat(shark.getColor()).isEqualTo("Grey");
        assertThat(shark.isEatOtherFish()).isTrue();
        assertThat(shark.isMakeJokes()).isFalse();
    }

}
