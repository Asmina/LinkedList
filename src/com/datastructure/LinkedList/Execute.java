package com.datastructure.LinkedList;

public class Execute {
	
	public static void main(String args[]) {
		
		//creating object for linked list class 
		MyLinkedList mll = new MyLinkedList();
		mll.add("California");
		mll.add("Chicago");
		mll.add("Seattle");
		mll.add("New York");
		mll.add("Atlanta");
		mll.add("Hyderabad");

		mll.displayLinkedlist();
	}

}
