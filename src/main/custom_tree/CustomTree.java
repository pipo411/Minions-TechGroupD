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
        newNode.fe = this.getNodeFe(newNode.right) - this.getNodeFe(newNode.left);
        System.out.println("fe is  "+newNode.fe );
        this.verifyBalance(this.root);
    }

    private void verifyBalance(Node node) {
        if (node == null) {
            return;
        }
        this.verifyBalance(node.left);
        System.out.println("FE is "+node.fe);
        if(this.getBalance(node) == 2){
            this.rigthRotate(node);
        }
        this.verifyBalance(node.right);
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

    private Node rigthRotate(Node currentNode) {
        Node aux = currentNode.left;
        currentNode.left = aux.right;
        aux.right = currentNode;
        currentNode.fe = Math.max(this.getNodeFe(currentNode.right), this.getNodeFe(currentNode.left)) + 1;
        aux.fe = Math.max(this.getNodeFe(aux.right), this.getNodeFe(aux.left)) + 1;
        return aux;
    }


    private int getBalance(Node node) {
        return this.getNodeFe(node.right) - this.getNodeFe(node.left);
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
