package com.demo;

/*

    this part demonstrate how to create a binary tree and add values to it following Inorder traversal

 */

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




