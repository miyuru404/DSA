package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*

this part demonstrate how to convert unsorted normal binary tree into binary search tree(BST)
in this code:
    step 01 - create empty binary tree and  add value manually without Inorder Traversal
    step 02 - create an empty array list and add values in the binary tree to it
    step 03 - sort that list
    step 04 - re-assigned the values to the binary tree using sorted array
*/



public class Main2 {
    public static void main(String[] args) {

        // step 01
        BinaryTree tree = new BinaryTree();   //create empty binary tree
        tree.insertManually();                // add value manually

        System.out.print("Original tree inorder: ");
        tree.inorder(); // Not sorted

        // step 02
        List<Integer> values = new ArrayList<>(); // create list
        tree.storeInorder(tree.root, values);     //store values
        System.out.println("stored values before sorting");
        System.out.println(values);

        // step 03
        Collections.sort(values); // sort values
        System.out.println("sorted values after sorting");
        System.out.println(values);

        // step 04
        tree.index = 0;                                // reset index for assignment
        tree.assignSortedValues(tree.root, values);    // reassign values in inorder
        System.out.print("Converted BST (same structure): ");
        tree.inorder(); // ✅ Now should be sorted!
    }

}
