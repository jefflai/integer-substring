package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AppTest {
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { { 0, 1, 1 }, { 3, 5, 45678}, {30, 5, 2122}, {100, 3, 556}});
    }
    
    private int index;
    private int length;
    private int expected;
    
    public AppTest(int index, int length, int expected) {
        this.index = index;
        this.length = length;
        this.expected = expected;
    }
    
    @Test
    public void testRunBruteForce() {
        assertEquals(expected, App.integerSubstringBruteForce(index, length));
    }
    
    @Test
    public void integerSubstring() {
        assertEquals(expected, App.integerSubstringBruteForceTwo(index, length));
    }
    
}
