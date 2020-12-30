/*
Ariel Webster
Created: 9/18/18
For in class example and class lab, class 201

Fill in the methods below to create a functioning singly linked list
You should not change the provided method signatures, unless directed to by myself or the TA
*/

public class LinkedListStart {
	
	public Node head = null;

	public static void main(String [] args){
		
		//nodes to be added to the linkedlist
		Node p1 = new Node("Maddie");
		Node p2 = new Node("Garrett");
		Node p3 = new Node("Christine");
		Node p4 = new Node("Lainagail");
		Node p5 = new Node("Matt");
		Node p6 = new Node("Eythan");
		Node p7 = new Node("Ankush");
		Node p8 = new Node("Tyler");
		Node p9 = new Node("Lance");
		Node p10 = new Node("Dexter");
		Node p11 = new Node("Jakob");
		Node p12 = new Node("Michael");
		Node p13 = new Node("Alex");
		Node p14 = new Node("Eric");
		Node p15 = new Node("Xan");
		Node p16 = new Node("Liam");
		
		LinkedListStart ll = new LinkedListStart();
		ll.addFirst(p7);
		ll.addFirst(p8);
		ll.PrintList();
		
		
		
	}
	
	//adds an element to the head of the linked list
	// p is the new node to be added to the linked list.
	public void addFirst(Node p){
		if (head == null){
			head = p;
		}else{
			p.setNext(head);
			head = p;
		}
	}
	
	//adds an element to the end of the linked list
	public void addLast(Node p){
		
	}
	
	//adds an element to a specific index, i, within the linked list
	public void add(Node p, int i){
	
	}
	
	//removes the element at the head of the linked list
	public void removeFirst(){
		
	}
	
	//removes the element at the tail of the linked list
	public void removeLast(){
		
	}
	
	//removes an element at a specific index within the linked list
	public void remove(Node p){
		
	}
	
	//removes every element from the linked list
	public void clear(){
		
	}
	
	//returns true if the linked list contains specified Node, returns false if not
	public boolean contains(Node p){
		return false;
	}
	
	//returns the node at specified index.
	public Node get(int i){
		return null;
	}
	
	//returns the index of the specified node
	public int indexOf(Node p){
		return 0;
	}
	
	//prints out the Linked List
	public void PrintList(){
		Node index = head;
		while (index != null){
			System.out.println(index.getName());
			index = index.getNext();
		}
	}
	
}
