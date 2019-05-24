package homework1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomListTest {

    private CustomList<Object> customList;

    /**
     * Init list object.
     */
    @org.junit.Before
    public void init() {
        customList = new CustomList<Object>();
    }


    /**
     * Test that involve add method.
     */
    @org.junit.Test
    public void add() {

        customList.addFirst(1);
        customList.addFirst(2);
        customList.addFirst(3);
        customList.addFirst(4);
        customList.add(2, 8);
        customList.add(3, 9);
        customList.add(4, 10);
        customList.add(5, "OBJECT");
        customList.add(6, true);
        customList.add(7, 17.3);
        customList.addLast(4);

        assertEquals(customList.getIndex(2).value, 8);
        assertEquals(customList.getIndex(4).value, 10);
        assertEquals(customList.getIndex(5).value, "OBJECT");
        assertEquals(customList.getIndex(6).value, true);
        assertEquals(customList.getIndex(7).value, 17.3);

    }

    /**
     * Test that involve addFirst method.
     */
    @org.junit.Test
    public void addFirst() {
        customList.addFirst(1);

        assertEquals(customList.head.value, 1);
    }

    /**
     * Test that involve addFirstString method.
     */
    @org.junit.Test
    public void addFirstString() {
        customList.addFirst("First");

        assertEquals(customList.head.value, "First");
    }

    /**
     * Test that involve addLast method.
     */
    @org.junit.Test
    public void addLast() {
        customList.addLast(85);

        assertEquals(customList.tail.value, 85);
    }

    /**
     * Test that involve addLastString method.
     */
    @org.junit.Test
    public void addLastString() {
        customList.addLast("TAIL");

        assertEquals(customList.tail.value, "TAIL");
    }

    /**
     * Test that involve remove method.
     */
    @org.junit.Test
    public void remove() {
        customList.addFirst(1);
        customList.addFirst(4);
        customList.add(1, 8);
        customList.addLast(4);

        customList.remove(1);

        assertNotEquals(customList.getIndex(1), 4);
    }

    /**
     * Test that involve removeFirst method.
     */
    @org.junit.Test
    public void removeFirst() {
        customList.addFirst(1);
        customList.addFirst(2);
        customList.add(1, 3);
        customList.add(2, 4);
        customList.addLast(5);

        customList.removeFirst();

        assertNotEquals(customList.getIndex(0), 1);
    }

    /**
     * Test that involve removeLast method.
     */
    @org.junit.Test
    public void removeLast() {
        customList.addFirst(1);
        customList.addLast(4);

        customList.removeLast();

        assertNotEquals(customList.getIndex(1), 4);
    }

    /**
     * Test that involve getIndex method.
     */
    @org.junit.Test
    public void getIndex() {

        customList.addFirst(1);
        customList.add(0, 8);
        customList.add(1, 9);
        customList.add(2, 10);
        customList.addLast(4);

        assertEquals(customList.getIndex(0).value, 8);
        assertEquals(customList.getIndex(1).value, 9);
        assertEquals(customList.getIndex(2).value, 10);
    }
}
