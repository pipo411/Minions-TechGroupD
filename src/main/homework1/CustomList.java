package homework1;


/**
 * CustomList class.
 */
public class CustomList implements IList {
    Node head;
    Node tail;

    /**
     * Function that involve add node
     * by index into the list.
     *
     * @param index int  index.
     * @param value T    value.
     */
    @Override
    public void add(int index, Object value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        if (index == 0) {
            this.addFirst(value);
        } else {
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next.previous = newNode;
            newNode.previous = currentNode;
            currentNode.next = newNode;
        }
    }

    /**
     * Function that involve add node
     * at the head into the list.
     *
     * @param value T    value.
     */
    @Override
    public void addFirst(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * Function that involve add node
     * at the tail into the list.
     *
     * @param value T    value.
     */
    @Override
    public void addLast(Object value) {
        Node newNode = new Node(value);
        if (tail == null) {
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    /**
     * Function that involve remove node
     * by index into the list.
     *
     * @param index int  index.
     */
    @Override
    public void remove(int index) {
        Node currentNode = head;
        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }

        currentNode.next = currentNode.next.next;
        currentNode.next.next.previous = currentNode;
    }


    /**
     * Function that involve remove head node
     * on the list.
     */
    @Override
    public void removeFirst() {
        head = head.next;
        head.previous = null;
    }


    /**
     * Function that involve remove tail node
     * on the list.
     */
    @Override
    public void removeLast() {
        tail = tail.previous;
        tail.next = null;
    }

    /**
     * Function that show the list
     * elements.
     */
    @Override
    public void printList() {
        Node currentNode = head;
        while (true) {
            System.out.println(currentNode.value);
            if (currentNode.next == null) {
                break;
            }
            currentNode = currentNode.next;
        }
    }

    /**
     * Function that return specific node
     * into the list.
     *
     * @param index int  index.
     * @return node value
     */
    @Override
    public Node getIndex(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}
