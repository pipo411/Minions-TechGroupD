package n_tree;

public class CustomNTree {
    private Node root;

    public void addRoot(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        }
    }

    public void addNode(int father, int value) {
        System.out.println("Start to insert Node");
        Node newNode = new Node(value);
        Node nodeFather = new Node(father);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.addNodeAux(nodeFather, newNode, this.root);
        }
    }

    private void addNodeAux(Node father, Node newNode, Node currentRoot) {
        if (father.value == currentRoot.value) {
            System.out.println("When root is -> " + currentRoot.value + " insert -> " + newNode.value);
            currentRoot.addChildNode(newNode);
        } else {
            if (currentRoot.isNodeExists(father)) {
                this.addNodeAux(father, newNode, currentRoot.getNode(father));
            } else {
                this.addNodeAux(father, newNode, currentRoot.getNext(currentRoot));
            }
        }
    }
}
