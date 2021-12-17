package com.bridgelabz.linkedList;

/*
 * @class represents linked list Node
 */
class Node<T> {

	T data;
	Node<T> addressOfNextNode;
	/*
	 * Constructor to create a new node 
	 */
	public Node(T data) {
		this.data = data;
		this.addressOfNextNode = null; //addressOfNextNode is by default initialized as null
	}

}

/*
 * @class represents implementation of singly linked list.
 */
public class LinkdedListDemo {
	Node head;     // head of list
	// Method to add a new node
	public <T> void addNode(T data) {
		Node<T> temp = head;     //assign first node to temp

		Node<T> newNode = new Node<T>(data);   // Create a new node with given data

		if(temp == null) {
			head = newNode;// If the Linked List is empty, then make the new node as head
		}else {             // Else traverse till the last node and insert the new_node there
			while(temp.addressOfNextNode != null) {
				temp = temp.addressOfNextNode;
			}
			temp.addressOfNextNode = newNode;// Insert the new_node at last node
		}

	}
	// Method to print the LinkedList.
	public void printLinkedList() {
		Node temp = head;
		
		// Traverse through the LinkedList
		while(temp != null) {
			// Print the data at current node
			System.out.print(temp.data + " -> ");
			// Go to next node
			temp = temp.addressOfNextNode;
		}
	}
	public static void main(String[] args) {
		// Start with the empty list. 
		LinkdedListDemo demo = new LinkdedListDemo();
		
		//add the values to list
		demo.addNode(56);
		demo.addNode(30);
		demo.addNode(70);
		
		//print the linked list
		demo.printLinkedList();
	}
}
