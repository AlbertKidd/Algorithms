package c1_fundamentals.c1_3_bags_queues_stacks;


import edu.princeton.cs.introcs.StdOut;

public class Queue<Item> {
	private int N;
	private Node first;
	private Node last;
	
	private static class Node<Item>{
		Item item;
		Node next;
	}
	
	public Queue(){
		N = 0;
		first = null;
		last = null;
	}
	
	public Queue(Queue q){
		if(q.isEmpty()){
			this.N = 0;
			this.first = null;
			this.last = null;
		}else{
			Node n = new Node();
			n.item = q.first.item;
			this.first = n;
			this.N = q.N;
			n = this.first;
			for(Node m = q.first.next; m != null; m = m.next){
				Node x = new Node();
				x.item = m.item;
				n.next = x;
				if(m.next == null)
					this.last = x;
				else
					n = n.next;
			}
		}
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public int size(){
		return N;
	}
	
	public void enqueue(Item item){
		Node node = new Node();
		node.item = item;
		if(isEmpty()){
			first = node;
			last = node;
		}
		else{
			last.next = node;
			last = node;
		}
		N++;
	}
	
	public Item dequeue(){
		if(isEmpty())
			throw new RuntimeException("The queue is empty!");
		Item item = (Item) first.item;
		first = first.next;
		N--;
		if(isEmpty())
			last = null;
		return item;
	}
	
	public void print(){
		if(isEmpty())
			StdOut.println("Nothing");
		else{
			Node n = this.first;
			while(n != null){
				StdOut.println(n.item);
				n = n.next;
			}
		}
	}
}
