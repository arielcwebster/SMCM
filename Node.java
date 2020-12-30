package LinkedList;
/*
Ariel Webster
Created: 9/18/18
For in class example, class 201

Node objects to be used in LinkedNodes
*/
public class Node {

	public String name; //identifies the node
	public Node next; // points to the next node
	
	public Node(String name) {
		this.name = name;
		next = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	public String toString(){
		return "Node[name = " + name + "]";
		//we don't print out the next node
	}
	
	
}
