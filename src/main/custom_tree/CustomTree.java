package custom_tree;

public class CustomTree {

    Node root;

    public void add(int value) {
        this.addNode(this.root, new Node(value));

    }

    private void addNode(Node customRoot, Node newNode) {
        if (customRoot == null) {
            this.root = newNode;
        } else {
            if (newNode.value <= customRoot.value) {
                if (customRoot.left == null) {
                    customRoot.left = newNode;
                } else {
                    this.addNode(customRoot.left, newNode);
                }
            } else {
                if (customRoot.right == null) {
                    customRoot.right = newNode;
                } else {
                    this.addNode(customRoot.right, newNode);
                }
            }
        }

        newNode.height = 1 + Math.max(this.getHeight(newNode.right), this.getHeight(newNode.right));
        int balance = this.getBalance(newNode);

        if (balance > 1) {
            this.rightRotate(newNode);
        }
        if (balance < -1) {
            this.leftRotate(newNode);
        }

    }

    public int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public int getBalance(Node node) {
        if (node == null)
            return 0;
        return this.getHeight(node.right) - this.getHeight(node.left);
    }


    public Node leftRotate(Node currentNode) {
        System.out.println("Entro leftRotate");
        Node aux = currentNode.right;
        currentNode.right = aux.left;
        aux.right = currentNode;
        currentNode.height = Math.max(this.getHeight(currentNode.right), this.getHeight(currentNode.left)) + 1;
        aux.height = Math.max(this.getHeight(aux.right), this.getHeight(aux.left)) + 1;
        return aux;
    }

    public Node rightRotate(Node currentNode) {
        System.out.println("Entro rightRotate");
        Node aux = currentNode.left;
        currentNode.left = aux.right;
        aux.right = currentNode;
        currentNode.height = Math.max(this.getHeight(currentNode.right), this.getHeight(currentNode.left)) + 1;
        aux.height = Math.max(this.getHeight(aux.right), this.getHeight(aux.left)) + 1;
        return aux;
    }


    public void preOrden() {
        this.preOrdenAux(this.root);
    }

    private void preOrdenAux(Node currentRoot) {
        if (currentRoot == null) {
            return;
        }
        System.out.println(currentRoot.value);
        this.preOrdenAux(currentRoot.left);
        this.preOrdenAux(currentRoot.right);
    }

    public void inOrden() {
        this.inOrdenAux(this.root);
    }

    private void inOrdenAux(Node node) {
        if (node == null) {
            return;
        }
        this.inOrdenAux(node.left);
        System.out.println(node.value);
        this.inOrdenAux(node.right);
    }

    public void postOrden() {
        this.postOrdenAux(this.root);
    }

    private void postOrdenAux(Node node) {
        if (node == null) {
            return;
        }
        this.postOrdenAux(node.right);
        System.out.println(node.value);
        this.postOrdenAux(node.left);
    }
}
