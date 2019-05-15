package homework1;

public class Node<T> {
    Node next;
    T value;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
