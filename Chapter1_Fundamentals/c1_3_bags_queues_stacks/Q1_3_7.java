package c1_3_bags_queues_stacks;

import java.util.NoSuchElementException;

//为Stack添加一个方法peek()，返回栈中最近添加的元素（而不弹出它）。

public class Q1_3_7 {
	
}
class Stack<Item>{
	private Node<Item> first;
	private int N;
	
	private static class Node<Item>{
		private Item item;
		private Node<Item> next;
	}
	
	public Stack(){
		first = null;
		N = 0;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		return N;
	}
	
	public void push(Item item){
		Node<Item> oldFirst = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	public Item pop(){
		if(isEmpty())
			throw new NoSuchElementException("stack under flow");
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public Item peek(){
		if(isEmpty())
			throw new NoSuchElementException("stack under flow");
		return first.item;
	}
}

