package com.codacy.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    @Test
    public void shouldAddNumbers() {
        Math math = new Math(23);

        assertEquals(7, math.magicAdd(3, 4));
    }

}
