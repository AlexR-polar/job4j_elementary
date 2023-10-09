package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when10to43then4dot24() {
        double expected = 4.24;
        double out = Point.distance(1, 0, 4, 3);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when16to34then2dot82() {
        double expected = 2.82;
        double out = Point.distance(1, 6, 3, 4);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when115to67then5dot38() {
        double expected = 5.38;
        double out = Point.distance(11, 5, 6, 7);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}