package com.paribesh.finance.datastructures;

public class BinarySearchTree<T extends Comparable<T>> {

    public Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public BinarySearchTree(T data){
        this.root = new Node(data);
    }

    public void insert(T data) {
        root = insert(root, data);
    }

    public Node insert(Node node, T data){
        if (node == null){
            return new Node(data);
        }

        if (data.compareTo(node.data) < 0){
            node.left = insert(node.left, data);
        }
        else if(data.compareTo(node.data) > 0){
            node.right = insert(node.right, data);
        }

        return node;
    }

    public boolean search(T data) {
        return search(root, data);
    }

    public boolean search(Node node, T data) {
        if (node == null) return false;
        if (data.compareTo(node.data) == 0) return true;
        if (data.compareTo(node.data) < 0)
            return search(node.left, data);
        else
            return search(node.right, data);

    }

    public void inOrder(Node node){
        if (node != null){
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }

    class Node {
        private T data;
        private Node left;
        private Node right;
        
        public Node(T data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}