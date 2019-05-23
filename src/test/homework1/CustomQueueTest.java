package homework1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CustomQueueTest {

    private CustomQueue<Object> customQueue;

    /**
     * Init list object.
     */
    @org.junit.Before
    public void init() {
        customQueue = new CustomQueue<>();
    }

    /**
     * Test that involve add method.
     */
    @Test
    public void add() {
        customQueue.add("W");
        assertEquals(customQueue.peek().value, "W");
    }

    /**
     * Test that involve remove method.
     */
    @Test
    public void remove() {
        customQueue.add("HELLO");
        customQueue.add("WORLD");
        Node removed = customQueue.remove();
        assertEquals(removed.value, "HELLO");
    }

    /**
     * Test that involve peek method.
     */
    @Test
    public void peek() {
        customQueue.add("H");
        customQueue.add("E");
        customQueue.add("L");
        customQueue.add("L");
        customQueue.add("O");

        assertEquals(customQueue.peek().value, "H");
        customQueue.remove();
        assertEquals(customQueue.peek().value, "E");
        customQueue.remove();
        assertEquals(customQueue.peek().value, "L");
        customQueue.remove();
        assertEquals(customQueue.peek().value, "L");

    }
}