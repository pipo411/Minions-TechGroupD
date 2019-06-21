package custom_tree;

/**
 * Node class.
 */
public class Node {
    Node right;
    Node left;
    int height;
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
        this.height = 1;
    }
}

