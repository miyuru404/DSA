package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

    this part shows how to use values in a normal binary tree to create a new binary search tree

        step 01 - create a binary tree and add values manually to make it normal tree
        step 02 - create a list and save values in normal binary tree to the list
        step 03 - sorting the list(this is optional if we can use both sorted and unsorted values in next step)
        step 04 -

 */

public class Main3 {
    public static void main(String[] args) {

        // step 01
        BinaryTree tree = new BinaryTree();           // create binary tree
        tree.insertManually();                        // insert manually
        System.out.print("Original tree inorder: ");
        tree.inorder();                               // print in order

        // step 02
        List<Integer> list = new ArrayList<Integer>();  // create a list to store data in order
        tree.storeInorder(tree.root,list);              // store data in list
        System.out.println("values in the normal binary tree without sorting");
        System.out.println(list);

        // step 03
        Collections.sort(list); //sort
        System.out.println(list);

        // step 04
        BinaryTree newBST = new BinaryTree();     // create new binary tree
        newBST.root = newBST.createNewBST(list);  // add values as a binary search tree and add new root values to the root
        System.out.println("values in binary search tree");
        newBST.inorder();
        System.out.println(newBST.root.value);    // new binary tree's root values(this will chane based on using  sorted or unsorted list)

    }
}
