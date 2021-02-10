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
		Node p1 = new Node("Matthew");
		Node p2 = new Node("Justin");
		Node p3 = new Node("Coleman");
		Node p4 = new Node("Thomas");
		Node p5 = new Node("Jack");
		Node p6 = new Node("Elise");
		Node p7 = new Node("Nahom");
		Node p8 = new Node("Noah");
		Node p9 = new Node("Kathryn");
		Node p10 = new Node("Faith");
		Node p11 = new Node("Jack");
		Node p12 = new Node("Liam");
		Node p13 = new Node("Victor");
		Node p14 = new Node("Albert");
		Node p15 = new Node("Adam");
		Node p16 = new Node("Alexander");
		Node p17 = new Node("Luke");
		Node p18 = new Node("Audrey");
		Node p19 = new Node("Alexander");
		
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
	public void remove(int i){
		
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
