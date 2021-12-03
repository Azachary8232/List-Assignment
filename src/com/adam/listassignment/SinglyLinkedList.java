package com.adam.listassignment;

public class SinglyLinkedList {

	protected Node head;
	
	
	
//	CONSTRUCTORS
	protected SinglyLinkedList() {
		head = null;
	}
	
	// SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
    	Node runner = head;
    	Node follower = head;
    	while(runner.next != null) {
    		follower = runner;
    		runner = runner.next;
    	}
    	follower.next = null;
    }
	
	public void printValues() {
	      if(head == null){
	    	  System.out.println("Empty list");
	      }
	      Node runner = this.head;
	      while(runner != null){ // runner will be null at the end
	    	  System.out.println(runner.value);
	    	  runner = runner.next;            
	        }

	}
	

	
	
}
