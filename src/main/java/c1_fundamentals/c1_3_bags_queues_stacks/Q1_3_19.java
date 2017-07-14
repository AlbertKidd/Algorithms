package c1_fundamentals.c1_3_bags_queues_stacks;

import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.Queue;

public class Q1_3_19 {
	
	class AQueue<Item>{
		private Node<Item> first;
		private Node<Item> last;
		private int N;
		
		private class Node<Item>{
			private Item item;
			private Node<Item> next;
		}
		
		public AQueue(){
			first = null;
			last = null;
			N = 0;
		}
		
		public boolean isEmpty(){
			return first == null;
		}
		
		public int size(){
			return N;
		}
		
		public void enqueue(Item item){
			Node<Item> oldLast = last;
			last = new Node<Item>();
			last.item = item;
			last.next = null;
			if(isEmpty())
				first = last;
			else
				oldLast.next = last;
			N++;
		}
		
		public Item dequeue(){
			if(isEmpty())
				throw new NoSuchElementException("Stack under flow");
			Item item = first.item;
			first = first.next;
			N--;
			if(isEmpty())
				last = null;
			return item;
		}
		
		public Item dequeueLast(){
			if(isEmpty())
				throw new NoSuchElementException("Stack under flow");
			Item mItem = null;
			for(Node node = first; node.next != null; node = node.next){
				if(node.next.next == null){
					mItem = last.item;
					last.item = null;
					last = node;
					N--;
					if(isEmpty())
						first = null;
				}
			}
			return mItem;
		}
	}
}
