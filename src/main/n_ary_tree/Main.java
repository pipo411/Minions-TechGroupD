package n_ary_tree;

public class Main {
    public static void main(String[] args) {
        NaryTree naryTree = new NaryTree();
        naryTree.addNode(0, 1);
        naryTree.addNode(1, 2);
        naryTree.addNode(1, 3);
        naryTree.addNode(1, 4);
        naryTree.addNode(1, 5);
        naryTree.addNode(2, 3);
        naryTree.addNode(3, 4);
        naryTree.addNode(4, 6);
        naryTree.addNode(4, 5);
        naryTree.addNode(4, 7);
        naryTree.addNode(4, 9);

        naryTree.printNaryTree();
    }
}
