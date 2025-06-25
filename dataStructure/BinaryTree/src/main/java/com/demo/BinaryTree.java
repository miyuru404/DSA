package com.demo;

import java.util.Collections;
import java.util.List;

// BinaryTree class
public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // INSERT method (place it here)
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // RECURSIVE insert helper method
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

    public Node insertManually(){
        root = new Node(10);
        root.left = new Node(30);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.right.left = new Node(5);
        root.right.right = new Node(25);

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

    public void storeInorder(Node root, List<Integer> list){
        if(root == null) return;
        storeInorder(root.left,list);
        list.add(root.value);
        storeInorder(root.right,list);
    }
    public void sortList(List<Integer> list){
        Collections.sort(list);
    }

    public Node createNewBST(List<Integer> list ){
        Node newRoot = null;
        for (int val : list) {
            newRoot = createNewBSTREC(newRoot, val);
        }
        return newRoot;
    }

    public  Node createNewBSTREC(Node root , int value){
        if (root == null) return new Node(value);

        if (value < root.value)
            root.left = createNewBSTREC(root.left, value);
        else
            root.right = createNewBSTREC(root.right, value);

        return root;
    }
    int index = 0; // Use instance variable or pass via object reference

    public void assignSortedValues(Node root, List<Integer> sortedValues) {
        if (root == null) return;
        assignSortedValues(root.left, sortedValues);
        root.value = sortedValues.get(index++);
        assignSortedValues(root.right, sortedValues);
    }

}
