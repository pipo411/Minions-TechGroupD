package n_tree;

public class Main {
    public static void main(String[] args) {
        CustomNTree customNTree = new CustomNTree();
        customNTree.addRoot(1);
        customNTree.addNode(1, 2);
        customNTree.addNode(1, 3);
        customNTree.addNode(1, 4);
        customNTree.addNode(3, 99);
        customNTree.addNode(2, 5);
        customNTree.addNode(2, 6);
        customNTree.addNode(2, 7);
        customNTree.addNode(6, 15);
        customNTree.addNode(6, 20);
        customNTree.addNode(6, 25);
        customNTree.addNode(4, 16);

    }
}
