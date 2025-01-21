package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for Binary class and App functionality.
 */
public class AppTest {

    /**
     * Test the OR operation.
     */
    @Test
    public void testBinaryOR() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("110");
        Binary result = Binary.OR(binary1, binary2);
        assertEquals("1110", result.getValue());
    }

    /**
     * Test the AND operation.
     */
    @Test
    public void testBinaryAND() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("110");
        Binary result = Binary.AND(binary1, binary2);
        assertEquals("10", result.getValue());
    }

    /**
     * Test the Multiply operation.
     */
    @Test
    public void testBinaryMultiply() {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("11");
        Binary result = Binary.Multiply(binary1, binary2);
        assertEquals("1111", result.getValue());
    }

    /**
     * Test the addition operation.
     */
    @Test
    public void testBinaryAdd() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("110");
        Binary result = Binary.add(binary1, binary2);
        assertEquals("10000", result.getValue());
    }

    /**
     * Test edge case: OR with "0".
     */
    @Test
    public void testORWithZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1101");
        Binary result = Binary.OR(binary1, binary2);
        assertEquals("1101", result.getValue());
    }

    /**
     * Test edge case: AND with "0".
     */
    @Test
    public void testANDWithZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1101");
        Binary result = Binary.AND(binary1, binary2);
        assertEquals("0", result.getValue());
    }

    /**
     * Test edge case: Multiply with "0".
     */
    @Test
    public void testMultiplyWithZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1101");
        Binary result = Binary.Multiply(binary1, binary2);
        assertEquals("0", result.getValue());
    }

    /**
     * Test edge case: Both numbers are "0".
     */
    @Test
    public void testBothZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary result = Binary.add(binary1, binary2);
        assertEquals("0", result.getValue());
    }
}
