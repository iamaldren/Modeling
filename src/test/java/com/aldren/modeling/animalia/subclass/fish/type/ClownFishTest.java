package com.aldren.modeling.animalia.subclass.fish.type;

import com.aldren.modeling.BaseTest;
import com.aldren.modeling.animalia.subclass.fish.Fish;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClownFishTest extends BaseTest {

    private final Fish clown = new ClownFish();

    @Test
    public void testSharkAttributes() {
        assertThat(clown.getSize()).isEqualTo("Small");
        assertThat(clown.getColor()).isEqualTo("Colorful");
        assertThat(clown.isEatOtherFish()).isFalse();
        assertThat(clown.isMakeJokes()).isTrue();
    }

}
