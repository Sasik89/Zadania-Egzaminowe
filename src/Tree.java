public class Tree {
    Node root;

    public void add(int value) {
        root = recursiveAdd(root, value);
    }

    public boolean contains(int value) {
        return recursiveContains(root, value);
    }

    public int max() {
        return recursiveMax(root);
    }

    public int min() {
        return recursiveMin(root);
    }

    private Node recursiveAdd(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.value) {
            currentNode.left = recursiveAdd(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = recursiveAdd(currentNode.right, value);
        }
        return currentNode;
    }

    private boolean recursiveContains(Node currentNode, int value) {

        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == value) {
            return true;
        } else if (currentNode.value < value) {
            return recursiveContains(currentNode.right, value);
        } else {
            return recursiveContains(currentNode.left, value);
        }
    }

    private int recursiveMax(Node currentNode) {
        if (currentNode == null) {
            return 0;
        } else if (currentNode.right == null) {
            return currentNode.value;
        } else {
            return recursiveMax(currentNode.right);
        }
    }

    private int recursiveMin(Node currentNode) {
        if (currentNode == null){
            return 0;
        }
        else if (currentNode.left == null) {
            return currentNode.value;
        }
        else {
            return recursiveMin(currentNode.left);
        }
    }
}
