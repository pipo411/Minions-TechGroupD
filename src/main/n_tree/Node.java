package n_tree;

import java.util.ArrayList;

public class Node {
    int value;
    private ArrayList<Node> children;

    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChildNode(Node newNode) {
        System.out.println("Insert Node value ->  " + newNode.value);
        this.children.add(newNode);
    }

    public Node getNext(Node currentNode) {
        int position = this.children.indexOf(currentNode);
        return this.children.get(position + 1);
    }

    public boolean isNodeExists(Node node) {
        for (Node n : this.children) {
            if (n.value == node.value) {
                return true;
            }
        }
        return false;
    }

    public Node getNode(Node currentNode) {
        int i = 0;
        while (i < this.children.size()) {
            if (this.children.get(i).value == currentNode.value) {
                return this.children.get(i);
            }
            i++;
        }
        return null;
    }

}
