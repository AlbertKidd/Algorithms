package c1_fundamentals.c1_3_bags_queues_stacks;

import java.util.Iterator;

public class LinkedList<T>{
	public int N;
	public Node first;
	public Node last;
	
	public class Node{
		T item;
		Node next;
	}
	
	public LinkedList(){
		first = null;
		last = null;
		N = 0;
	}
	
	public LinkedList(T[] list){
		for(T item : list){
			this.append(item);
		}
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void append(T item){
		Node n = new Node();
		n.item = item;
		if(isEmpty()){
			first = n;
			last = n;
		}
		else{
			last.next = n;
			last = n;
		}
		N++;
	}
	
	public T removeLast(){
		if(isEmpty())
			throw new RuntimeException("List is empty");
		T item = last.item;
		for(Node n = first; n.next != null; n = n.next){
			if(n.next.next == null){
				last = n;
				n.next = null;
			}
		}
		return item;
	}
	
	public T delete(int k){
		if(k > N - 1)
			throw new RuntimeException("Out of boundary");
		Node n = first;
		T item = first.item;
		for(int i = 0; i < k; i++){
			if(i == k - 1){
				item = n.next.item;
				n.next = n.next.next;
				
			}else{
				n = n.next;
			}
		}
		return item;
	}

}
