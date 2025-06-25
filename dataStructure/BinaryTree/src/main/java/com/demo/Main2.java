package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    BinaryTree tree = new BinaryTree();
    tree.insertManually(); // Normal tree

    System.out.print("Original tree inorder: ");
    tree.inorder(); // Not sorted

    List<Integer> values = new ArrayList<>();
    tree.storeInorderValues(tree.root, values); // 1. collect values
    Collections.sort(values);                   // 2. sort them

    tree.index = 0;                             // reset index for assignment
    tree.assignSortedValues(tree.root, values); // 3. reassign values in inorder

    System.out.print("Converted BST (same structure): ");
    tree.inorder(); // ✅ Now should be sorted!

}
