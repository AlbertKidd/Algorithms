package c1_3_bags_queues_stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;

//用环形链表实现Queue。
//环形链表也是一条链表，只是没有任何节点的链接为空，且只要链表非空则last.next的值为first。
//只能使用一个Node类型的实例变量（last）。

public class Q1_3_29<Item> implements Iterable<Item>{
	private int N;
	private Node last;
	
	private class Node{
		private Item item;
		private Node next;
	}
	
	public Q1_3_29(){
		last = null;
	}
	
	public boolean isEmpty(){
		return last == null;
	}
	
	public int size(){
		return N;
	}
	
	public Item peek(){
		if(isEmpty())
			throw new RuntimeException("Queue underflow");
		return last.next.item;
	}
	
	public void enqueue(Item item){
		Node node = new Node();
		node.item = item;
		if(isEmpty())
			node.next = node;
		else{
			node.next = last.next;
			last.next = node;
		}
		last = node;
		N++;
	}
	
	public Item dequeue(){
		if(isEmpty())
			throw new RuntimeException("Queue underflow");
		Item item = last.next.item;
		if(last.next == last)
			last = null;
		else
			last.next = last.next.next;
		N--;
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item>{
		private int n = N;
		private Node current = last;
		
		public boolean hasNext(){
			return n > 0;
		}

		public Item next(){
			if(!hasNext())
				throw new NoSuchElementException();
			Item item = current.next.item;
			current = current.next;
			n--;
			return item;
		}
	}
}
