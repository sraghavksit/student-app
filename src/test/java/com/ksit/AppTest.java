package com.ksit;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGreet() {
        assertEquals("Hello, KSIT DevOps Lab!", App.greet("KSIT DevOps Lab"));
    }
}