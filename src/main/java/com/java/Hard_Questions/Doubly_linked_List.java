package com.java.Hard_Questions;


public class Doubly_linked_List {
    class Node{
        int Item;
        Node Previous;
        Node Next;

        public Node(int item) {
            this.Item = item;
        }
    }
    Node head, tail = null;
    

    public void Add(int item) {

        Node newNode = new Node(item);

        if(head == null) {
            head = tail = newNode;
            head.Previous = null;
            tail.Next = null;
        }
        else {

            tail.Next = newNode;
            newNode.Previous = tail;
            tail = newNode;
            tail.Next = null;
        }
    }
    
    public void Print() {
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.Item + " --> ");
            current = current.Next;
        }
        System.out.println("NULL"); 
    }

	public static void main(String[] args) {
		Doubly_linked_List AddNode = new Doubly_linked_List();

		AddNode.Add(1);
		AddNode.Add(2);
		AddNode.Add(3);
		AddNode.Add(4);
		AddNode.Add(5);

		AddNode.Print();

	}

}
