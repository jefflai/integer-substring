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
        return Arrays.asList(new Object[][] {
                        {0, 1, "1"},
                        {3, 5, "45678"},
                        {30, 5, "02122"},
                        {100, 3, "556"}
                });
    }
    
    private int index;
    private int length;
    private String expected;
    
    public AppTest(int index, int length, String expected) {
        this.index = index;
        this.length = length;
        this.expected = expected;
    }
    
    @Test
    public void testRunBruteForce() {
        assertEquals(expected, App.integerSubstringBruteForce(index, length));
    }
    
    @Test
    public void integerPartial() {
        assertEquals(expected, App.integerSubstringPartialNumberString(index, length));
    }
    
}
