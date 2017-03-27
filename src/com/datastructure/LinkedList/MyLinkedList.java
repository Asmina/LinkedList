package com.datastructure.LinkedList;

public class MyLinkedList {
	
	//need to declare the subclass Node as a field
	private Node head;
	
	//defining a constructor 
	public MyLinkedList() {
		
		//initializing new node
		head = new Node("Head Node"); //defined parameterized constructor in subclass
	}
	
	//adding a method to add nodes
	public void add (String data){

		Node newNode = new Node (data);  //if you want to create a new node to the linked list you have add an object here
		// head.setNext(newNode); //set the reference value to the node 
		
		//create a pointer to add new node before the null element where current is a pointer
		Node current = head;
		
		//loop for searching node pointing towards null - the pointer keeps moving until it finds the node before null to add the next element in the node
		while (current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(newNode); //the next node is set before null
	}

	//method for displaying names of the elements
	public void displayLinkedlist(){
		Node current = head; //node is currently pointing towards head
		while (current.getNext() != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	//creating subclass node for linked list objects. This will be maintaining the data and the references
	//it contains two fields (reference,data)
	    private class Node{
		private Node next; //next means the next node (object) reference 
		private String data; //the data inside the node 
		
	
		public Node(String data) {    //Parameterized constructor
			next = null;
			this.data = data; 
			
			
		}
		
		
		// re factored and encapsulated fields by getting getter and setter
		private String getData() {
			return data;
		}
		
		private void setData(String data) {
			this.data = data;
		}
		
		private Node getNext() {
			return next;
		}
		
		private void setNext(Node next) {
			this.next = next;
		}
		
	}

}
