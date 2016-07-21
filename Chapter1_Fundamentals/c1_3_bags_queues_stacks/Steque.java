package c1_3_bags_queues_stacks;

public class Steque<T> {
	private int N;
	private Node first;
	private Node last;
	
	private class Node{
		T item;
		Node next;
	}
	
	public Steque(){
		first = null;
		last = null;
		N = 0;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void push(T item){
		Node n = new Node();
		n.item = item;
		n.next = first;
		first = n;
		if(N == 0)
			last = n;
		N++;
	}
	
	public void enqueue(T item){
		Node n = new Node();
		n.item = item;
		last.next = n;
		last = n;
		if(N == 0)
			first = n;
		N++;
	}
	
	public T pop(){
		if(isEmpty())
			throw new RuntimeException("list is empty!");
		T item = first.item;
		first = first.next;
		if(first == null){
			last = null;
		}
		N--;
		return item;
	}
}
