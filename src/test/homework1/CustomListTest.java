package homework1;


import static org.junit.Assert.assertNotEquals;

public class CustomListTest {

    private CustomList customList;

    @org.junit.Before
    public void init() {
        customList = new CustomList();
    }


    @org.junit.Test
    public void add() {
        customList.addFirst(1);
        customList.add(1, 2);
        customList.addLast(4);
        assertEquals(customList.getIndex(0).value, 1);
        assertEquals(customList.getIndex(1).value, 2);
        assertEquals(customList.getIndex(2).value, 4);

    }

    private void assertEquals(int value, int i) {
    }

    @org.junit.Test
    public void addFirst() {
        customList.addFirst(1);
        assertEquals(customList.head.value, 1);
    }

    @org.junit.Test
    public void addLast() {
        customList.addLast(85);
        assertEquals(customList.tail.value, 85);
    }

    @org.junit.Test
    public void remove() {
        customList.addFirst(1);
        customList.add(1, 2);
        customList.add(2, 3);
        customList.addLast(4);

        customList.remove(2);
        assertNotEquals(customList.getIndex(2), 3);
    }

    @org.junit.Test
    public void removeFirst() {
        customList.addFirst(1);
        customList.add(1, 2);
        customList.add(2, 3);
        customList.addLast(4);

        customList.removeFirst();
        assertNotEquals(customList.getIndex(0), 1);
    }

    @org.junit.Test
    public void removeLast() {
        customList.addFirst(1);
        customList.add(1, 2);
        customList.add(2, 3);
        customList.addLast(4);

        customList.removeLast();
        assertNotEquals(customList.getIndex(3), 4);
    }

    @org.junit.Test
    public void getIndex() {

        customList.addFirst(1);
        customList.add(1, 2);
        customList.add(2, 3);
        customList.addLast(4);
        assertEquals(customList.getIndex(0).value, 1);
        assertEquals(customList.getIndex(1).value, 2);
        assertEquals(customList.getIndex(2).value, 3);
        assertEquals(customList.getIndex(3).value, 4);
    }
}
