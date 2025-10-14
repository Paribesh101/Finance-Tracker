package com.paribesh.finance.datastructures;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        System.out.println("Testing BST...");
        
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        
        System.out.println("Search 30: " + tree.search(30));
        System.out.println("Search 100: " + tree.search(100));
        
        System.out.println("In-order:");
        tree.inOrder(tree.root);
        
        System.out.println("Test complete!");
    }
}