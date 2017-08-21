package c1_fundamentals.c1_3_bags_queues_stacks;


import edu.princeton.cs.introcs.StdOut;

public class Stack<Item> {
	private int N;
	private Node<Item> first;
	
	private static class Node<Item>{
		Item item;
		Node<Item> next;
	}
	
	public Stack(){
		N = 0;
		first = null;
	}
	
	public Stack(Stack s){
		if(s.isEmpty()){
			N = 0;
			first = null;
		}else{
			this.N = s.N;
			
			Node n = new Node();
			n.item = s.first.item;
			this.first = n;
			
			n = this.first;
			for(Node m = s.first.next; m != null; m = m.next){
				Node x = new Node();
				x.item = m.item;
				n.next = x;
				n = n.next;
			}
		}
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		return N;
	}
	
	public void print(){
		Node n = first;
		while(n != null){
			StdOut.println(n.item);
			n = n.next;
		}
	}
	
	public Item peek(){
		if(isEmpty())
			throw new RuntimeException("Stack is empty!");
		return first.item;
	}
	
	public void push(Item item){
		Node node = new Node();
		node.item = item;
		if(isEmpty())
			first = node;
		else{
			node.next = first;
			first = node;	
		}
		N++;
	}
	
	public Item pop(){
		if(isEmpty())
			throw new RuntimeException("Stack is empty!");
		Item item = first.item;
		first = first.next;
		N--;
		return item;
		
	}
	
	
	public void catenation(Stack s){
		Node n = this.first;
		for(int i = 0; i < this.size() - 1; i++){
			n = n.next;
		}
		n.next = s.first;
		N = N + s.size();
	}
}
