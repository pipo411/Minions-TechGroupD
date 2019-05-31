package custom_tree;

/**
 * Node class.
 */
public class Node<T> {
    Node right;
    Node left;
    T value;

    /**
     * Constructor node class.
     *
     * @param value generic data type value.
     */
    public Node(T value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}

