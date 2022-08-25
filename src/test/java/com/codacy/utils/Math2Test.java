package com.codacy.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Math2Test {
    @Test
    public void shouldAddNumbers() {
        Math2 math2 = new Math2(23);

        assertEquals(7, math2.magicAdd(3, 4));
    }

    // Uncomment this to have 100% coverage
    @Test
    public void shouldSubtractIfMagicNumber() {
        Math2 math2 = new Math2(4);
        assertEquals(1, math2.magicAdd(3, 4));
    }
}
