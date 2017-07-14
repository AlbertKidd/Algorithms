package c1_fundamentals.c1_3_bags_queues_stacks;

import java.util.NoSuchElementException;

//编写一个方法delete()，接受一个int参数k，删除链表的第k个元素（如果它存在的话）。

public class Q1_3_20 {
	class QueueB<Item>{
		
		private Node<Item> first;
		private Node<Item> last;
		private int N;
		
		private class Node<Item>{
			private Item item;
			private Node<Item> next;
		}
		
		public QueueB(){
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
			Node oldLast = last;
			last = new Node();
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
		
		public Item delete(int k){
			Node node = first;
			for(int i = 0; i < k; i++){
				node = node.next;
				if(i == k - 1){
					node.next = node.next.next;
				}
			}
			return (Item) node.item;
		}
	}
	
}
