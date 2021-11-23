package Algorithms_course;

public class BalancedBinaryTree {

    //Balanced Binary Tree is valid
    static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);
        root.left.right = new Node(7);
        root.right.left = new Node(13);
        root.right.left.right = new Node(14);
        root.right.right = new Node(21);

        System.out.println(isValidBST(root));
    }

    private static boolean isValidBST(Node node) {
        if(node == null) return true;
        if(node.left != null && node.left.value > node.value) return false;
        if(node.right != null && node.right.value < node.value) return false;
        if(!isValidBST(node.left) || !isValidBST(node.right))
            return false;
        return true;
    }


}



