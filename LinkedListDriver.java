/*
Ariel Webster
Created: 9/8/20
For Lab 1: Linked Lists

This is just for your testing. Your assignment will be tested with a different LinkedListDriver file
Therefore make sure you don't change any assumptions about node construction that are made in this file
and make sure to catch potential issues that may not be encountered in this file. 
*/
public class LinkedListDriver {

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
		
		DoublyLinkedList ll = new DoublyLinkedList();
		ll.addFirst(p7);
		ll.addFirst(p8);
		ll.addLast(p1);
		ll.add(p5, 2);
		ll.indexOf(p7);
		ll.PrintList();
		ll.removeFirst();
		ll.get(1);
		ll.remove(3);
		ll.removeLast();
		ll.PrintList();
		ll.contains(p.16);
		ll.clear();
		
	}

}
