package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.BaseTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SongBirdTest extends BaseTest {

    private final SongBird songBird = new SongBird();

    @Test
    public void testSongBirdWalking() {
        songBird.walk();
        String actual = content.toString().replaceAll("\r\n|\n", "");
        assertThat(actual).isEqualTo("I am walking.");
    }

    @Test
    public void testSongBirdFlying() {
        songBird.fly();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am flying.");
    }

    @Test
    public void testSongBirdSinging() {
        songBird.sing();
        assertThat(content.toString().replaceAll("\r\n|\n", "")).isEqualTo("I am singing.");
    }

}
