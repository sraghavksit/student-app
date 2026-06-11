package com.ksit;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGreetKSIT() {
        assertEquals("Hello, KSIT DevOps Lab!", App.greet("KSIT DevOps Lab"));
    }

    @Test
    public void testGreetWithName() {
        assertEquals("Hello, Raghu!", App.greet("Raghu"));
    }

    @Test
    public void testGreetFormat() {
        String result = App.greet("World");
        assertTrue(result.startsWith("Hello,"));
        assertTrue(result.endsWith("!"));
    }

    @Test
    public void testGreetEmpty() {
        assertEquals("Hello, !", App.greet(""));
    }

    @Test
    public void testMainMethod() {
        App.main(new String[]{});
        App.main(new String[]{"arg1"});
    }
}
