package custom_tree;

public class CustomTree {

    Node root;

    public void add(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            this.root = newNode;
        } else {
            this.addNode(newNode, this.root);
        }
    }

    private void addNode(Node newNode, Node customRoot) {
        Node currentNode = customRoot;
        if (newNode.value <= customRoot.value) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                this.addNode(newNode, currentNode.left);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                this.addNode(newNode, currentNode.right);
            }
        }
    }

    public void printCustomTree() {
        this.internalPrint(this.root);
    }

    private void internalPrint(Node currentRoot) {
        System.out.println(currentRoot.value);
        if (currentRoot.left != null) {
            this.internalPrint(currentRoot.left);
        }
        if (currentRoot.right != null) {
            this.internalPrint(currentRoot.right);
        }
    }
}
