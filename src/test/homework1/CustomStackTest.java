package homework1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomStackTest {

    private CustomStack<Object> customQueue;

    /**
     * Init list object.
     */
    @org.junit.Before
    public void init() {
        customQueue = new CustomStack<Object>();
    }

    /**
     * Test that involve push method.
     */
    @Test
    public void push() {
        customQueue.push("H");
        customQueue.push("E");
        customQueue.push("L");
        customQueue.push("L");
        customQueue.push("O");

        assertEquals(customQueue.peek().value, "O");

    }

    /**
     * Test that involve pop method.
     */
    @Test
    public void pop() {

        customQueue.push("E");
        customQueue.push("O");

        assertEquals(customQueue.peek().value, "O");
    }

    /**
     * Test that involve peek method.
     */
    @Test
    public void peek() {
        customQueue.push("H");
        customQueue.push("E");
        customQueue.push("L");
        customQueue.push("L");
        customQueue.push("O");

        assertEquals(customQueue.peek().value, "O");
        customQueue.pop();
        assertEquals(customQueue.peek().value, "L");
        customQueue.pop();
        assertEquals(customQueue.peek().value, "L");
        customQueue.pop();
        assertEquals(customQueue.peek().value, "E");
    }
}