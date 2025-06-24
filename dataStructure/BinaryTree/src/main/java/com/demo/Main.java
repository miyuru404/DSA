package com.demo;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);

        System.out.print("Inorder traversal: ");
        tree.inorder();  // Output: 5 10 15
    }
}

// Node class (can be in the same file or a separate one)
class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

// BinaryTree class
class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // INSERT method (place it here)
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // RECURSIVE insert helper method (place it here too)
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Optional: Traversal methods like inorder can also go here
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    public Boolean search(int value){
        return searchRec(root,value);
    }

    private Boolean searchRec(Node root, int value){
        if(root == null) return false;

        if(root.value == value) return true;

        if(root.value < value){
           return searchRec(root.right, value);
        }
        else {
           return searchRec(root.left, value);
        }
    }

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) return null;

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            else {
                // Find the inorder successor (smallest in right subtree)
                Node minNode = findMin(root.right);
                root.value = minNode.value; // Copy value
                root.right = deleteRec(root.right, minNode.value); // Delete duplicate
            }
        }

        return root;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


}

