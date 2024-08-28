package com.java.Hard_Questions;


public class Stack_Using_linked_list {
	  private Node top;
	    private int Len;

	    public Stack_Using_linked_list() {
	        top = null;
	        Len = 0;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	        Len++;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        int poppedElement = top.data;
	        top = top.next;
	        Len--;
	        return poppedElement;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        return top.data;
	    }

	    public void Print() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	        } else {
	            Node current = top;
	            System.out.print("Stack elements: ");
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }
	    }

	    private class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            next = null;
	        }
	    }

	    public static void main(String[] args) {
	    	
	        System.out.println("Initialize a stack using Linked List");
	        System.out.println("\nInput some elements on the stack:");
	        Stack_Using_linked_list stack = new Stack_Using_linked_list();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);
	        stack.Print();
	        System.out.println("\nTop element: " + stack.peek());
	        System.out.println("\nRemove two elements from the stack:");
	        stack.pop();
	        stack.pop();
	        stack.Print();
	        System.out.println("\nTop element: " + stack.peek());
	    }

}
