package homework1;


/**
 * Node class.
 */
public class Node<T> {
    Node next;
    Node previous;
    T value;

    /**
     * Constructor node class.
     *
     * @param value generic data type value.
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
