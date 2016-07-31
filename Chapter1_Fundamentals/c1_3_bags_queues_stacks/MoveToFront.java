package c1_3_bags_queues_stacks;

import edu.princeton.cs.algs4.StdOut;

public class MoveToFront<Item> {
	private int N;
	private Node first;
	
	private class Node<Item>{
		Item item;
		Node next;
	}
	
	public MoveToFront(){
		N = 0;
		first = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		return N;
	}
	
	public void print(){
		Node node = first;
		while(node != null){
			StdOut.print(node.item);
			node = node.next;
		}
		StdOut.println();
	}
	
	public void read(Item[] item){
		for(Item i : item){
			read(i);
		}
	}
	
	public void insert(Item item){
		Node node = new Node();
		node.item = item;
		if(this.isEmpty())
			first = node;
		else{
			node.next = first;
			first = node;
		}
		N++;
		
	}
	
	public void read(Item item){
		if(isEmpty())
			throw new RuntimeException("there is nothing to delete!");
		for(Node n = this.first; n.next != null; n = n.next){
			
			if(n.next.item == item){
				n.next = n.next.next;
				N--;
			}
		}
		insert(item);
			
	}
	
}
