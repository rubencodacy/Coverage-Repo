package com.codacy.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Math2Test {

    // Uncomment this to have 100% coverage
    @Test
    public void shouldSubtractIfMagicNumber() {
        Math2 math2 = new Math2(4);
        assertEquals(1, math2.magicAdd(3, 4));
    }
}
