package com.java.Hard_Questions;
import java.util.Stack;
import java.util.Scanner;

public class Queue_using_Two_Stacks {

	    Stack<Integer> s1 = new Stack<Integer>();
	    Stack<Integer> s2 = new Stack<Integer>();


	    void push(int x) {
	        if (s1.isEmpty()) {  
	            s1.push(x);
	        } else {
	            while (!s1.isEmpty()) {   
	                s2.push(s1.pop());    
	            }

	            s1.push(x);              

	            while (!s2.isEmpty()) {   
	                s1.push(s2.pop());   
	            }
	        }
	    }

	    int pop() {
	        if (s1.isEmpty()) {
	            return -1;
	        }
	        return s1.pop();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Queue_using_Two_Stacks queue = new Queue_using_Two_Stacks();

	        System.out.print("Enter the number of elements to push: ");
	        int n = scanner.nextInt();

	        System.out.println("Enter the elements to push:");
	        for (int i = 0; i < n; i++) {
	            int element = scanner.nextInt();
	            queue.push(element);
	        }

	        System.out.println("Elements popped from the queue:");
	        while (true) {
	            int poppedElement = queue.pop();
	            if (poppedElement == -1) {
	                break;
	            }
	            System.out.println(poppedElement);
	        }
	    }
	

}
