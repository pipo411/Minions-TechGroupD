package n_ary_tree;

import java.util.ArrayList;

public class NaryNode {
    int value;
    ArrayList<NaryNode> children;

    /**
     * NaryNode constructor
     *
     * @param value value
     */
    public NaryNode(int value) {
        this.value = value;
        this.children = new ArrayList<NaryNode>();
    }

    /**
     * Add child.
     *
     * @param newNode Node.
     */
    public void add_child(NaryNode newNode) {
        System.out.println("start add_child");
        this.children.add(newNode);
    }

    /**
     * Return the child given an index.
     *
     * @param index int index.
     * @return NaryNode node.
     */
    public NaryNode getChild(int index) {
        return this.children.get(index);
    }

    /**
     * Return index from node.
     *
     * @param node NaryNode node.
     * @return int      index.
     */
    public int getNaryNodeIndex(NaryNode node) {
        return this.children.indexOf(node);
    }

    /**
     * Return children size.
     *
     * @return int arraylist size.
     */
    public int getChildrenLenght() {
        return this.children.size();
    }

    /**
     * Return node's value.
     *
     * @return int value.
     */
    public int getNaryNodeValue() {
        return this.value;
    }
}
