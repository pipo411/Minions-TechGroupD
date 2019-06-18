package custom_tree;

/**
 * Node class.
 */
public class Node {
    Node right;
    Node left;
    int fe;
    int value;

    /**
     * Constructor node class.
     *
     * @param value generic data type value.
     */
    public Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
        this.fe = 0;
    }
}

