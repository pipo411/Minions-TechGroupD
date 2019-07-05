package n_ary_tree;

public class NaryTree {
    NaryNode root;

    /**
     * Add new node.
     *
     * @param father_value father node value.
     * @param value        new node value
     */
    public void addNode(int father_value, int value) {
        NaryNode newNode = new NaryNode(value);
        if (this.root == null) {
            System.out.println("set root");
            this.root = newNode;
        } else {
            this.addNodeNaryTree(this.root, newNode, father_value);
        }
    }

    /**
     * Add new node control.
     *
     * @param currentRoot  current root.
     * @param newNode      new node.
     * @param father_value father value.
     */
    public void addNodeNaryTree(NaryNode currentRoot, NaryNode newNode, int father_value) {
        System.out.println("start addNode");
        if (currentRoot.getNaryNodeValue() == father_value) {
            currentRoot.add_child(newNode);
        } else {
            int index = currentRoot.getNaryNodeIndex(currentRoot);
            currentRoot = currentRoot.getChild(index + 1);
            this.addNodeNaryTree(currentRoot, newNode, father_value);
        }
    }

    /**
     * print N-ary tree.
     */
    public void printNaryTree() {
        this.printNaryTreeAux(this.root);
    }

    /**
     * print N-ary tree auxiliar
     *
     * @param currentRoot current node.
     */
    private void printNaryTreeAux(NaryNode currentRoot) {
        System.out.println(currentRoot.getNaryNodeValue());
        int index = currentRoot.getNaryNodeIndex(currentRoot);
        currentRoot = currentRoot.getChild(index + 1);
        if (currentRoot.getChildrenLenght() == 0) {
            System.out.println("");
        } else {
            this.printNaryTreeAux(currentRoot);
        }

    }
}
