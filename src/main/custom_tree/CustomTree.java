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

    private int getNodeFe(Node node) {
        if (node == null)
            return -1;
        return node.fe;
    }

    public Node leftRotate(Node currentNode) {
        Node aux = currentNode.right;
        currentNode.right = aux.left;
        aux.right = currentNode;
        currentNode.fe = Math.max(this.getNodeFe(currentNode.right), this.getNodeFe(currentNode.left)) + 1;
        aux.fe = Math.max(this.getNodeFe(aux.right), this.getNodeFe(aux.left)) + 1;
        return aux;
    }

    public Node rigthRotate(Node currentNode) {
        Node aux = currentNode.left;
        currentNode.left = aux.right;
        aux.right = currentNode;
        currentNode.fe = Math.max(this.getNodeFe(currentNode.right), this.getNodeFe(currentNode.left)) + 1;
        aux.fe = Math.max(this.getNodeFe(aux.right), this.getNodeFe(aux.left)) + 1;
        return aux;
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
