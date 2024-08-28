package com.java.Hard_Questions;

public class Binary_Search_Tree {
    	Node root;
    	
	class Node {
	    int key;
	    Node left, right;

	    public Node(int item) {
	        key = item;
	        left = right = null;
	    }
	}
	

	    public Binary_Search_Tree() {
	        root = null;
	    }

	    void Insert(int key) {
	        root = insertRec(root, key);
	    }

	    Node insertRec(Node root, int key) {
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }

	        if (key < root.key)
	            root.left = insertRec(root.left, key);
	        else if (key > root.key)
	            root.right = insertRec(root.right, key);

	        return root;
	    }

	    void delete(int key) {
	        root = deleteRec(root, key);
	    }

	    Node deleteRec(Node root, int key) {
	        if (root == null)
	            return root;

	        if (key < root.key)
	            root.left = deleteRec(root.left, key);
	        else if (key > root.key)
	            root.right = deleteRec(root.right, key);
	        else {
	            if (root.left == null)
	                return root.right;
	            else if (root.right == null)
	                return root.left;

	            root.key = minValue(root.right);

	            root.right = deleteRec(root.right, root.key);
	        }

	        return root;
	    }

	    int minValue(Node root) {
	        int minv = root.key;
	        while (root.left != null) {
	            minv = root.left.key;
	            root = root.left;
	        }
	        return minv;
	    }

	    boolean Search(int key) {
	        return searchRec(root, key);
	    }

	    boolean searchRec(Node root, int key) {
	        if (root == null)
	            return false;
	        if (root.key == key)
	            return true;
	        if (root.key < key)
	            return searchRec(root.right, key);
	        return searchRec(root.left, key);
	    }

	    void inorder() {
	        inorderRec(root);
	        System.out.println("\n");
	    }

	    void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.key + " ");
	            inorderRec(root.right);
	        }
	    }

	    void Preorder() {
	        Preorder(root);
	        System.out.println("\n");
	        
	    }

	    void Preorder(Node root) {
	        if (root != null) {
	            System.out.print(root.key + " ");
	            Preorder(root.left);
	            Preorder(root.right);
	        }
	    }

	    void Postorder() {
	        Postorder(root);
	        System.out.println("\n");
	    }

	    void Postorder(Node root) {
	        if (root != null) {
	            Postorder(root.left);
	            Postorder(root.right);
	            System.out.print(root.key + " ");
	        }
	    }

	


	public static void main(String[] args) {
		Binary_Search_Tree BinaryTree = new Binary_Search_Tree();

		BinaryTree.Insert(27);
		BinaryTree.Insert(45);
		BinaryTree.Insert(19);
		BinaryTree.Insert(12);
		BinaryTree.Insert(65);
		BinaryTree.Insert(77);
		BinaryTree.Insert(5);

        System.out.println("Inorder traversal:");
        BinaryTree.inorder();

        BinaryTree.delete(19);
        BinaryTree.delete(65);

        System.out.println("Inorder traversal after deletion:");
        BinaryTree.inorder();

        int searchKey = 45;
        System.out.println("Is " + searchKey + " present in the tree? " + BinaryTree.Search(searchKey));

        System.out.println("Preorder traversal:");
        BinaryTree.Preorder();

        System.out.println("Postorder traversal:");
        BinaryTree.Postorder();


	}

}
