package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //BinaryTree tree = new BinaryTree();
        //tree.insert(10);
        //tree.insert(5);
        //tree.insert(15);
        //System.out.print("Inorder traversal: ");
        //tree.inorder();  // Output: 5 10 15

        BinaryTree tree = new BinaryTree();
        tree.insertManually();
        tree.inorder();

        List<Integer> list = new ArrayList<Integer>();
        tree.storeInorder(tree.root,list);
        System.out.println(list);

        Collections.sort(list);
        //System.out.println(list);

        BinaryTree newBST = new BinaryTree();
        newBST.root = newBST.createNewBST(list);
        newBST.inorder();
        System.out.println(newBST.root.value);

    }
}




