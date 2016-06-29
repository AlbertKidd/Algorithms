package c1_3_bags_queues_stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;

//编写一个可迭代的Stack用例，它含有一个静态的copy方法，接受一个字符串的栈作为参数并返回该栈的一个副本。

public class Q1_3_12 {
	private class Stack<Item> implements Iterable<Item>{
		
		private Node<Item> first;
		private int N;
		
		private class Node<Item>{
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
				throw new NoSuchElementException("Stack under flow");
			Item item = first.item;
			first = first.next;
			N--;
			return item;
		}
		
		public Item peek(){
			if(isEmpty())
				throw new NoSuchElementException("Stack under flow");
			return first.item;
		}
		
		public String toString(){
			StringBuilder sb = new StringBuilder();
			for(Item i : this)
				sb.append(i + " ");
			return sb.toString();
		}
		
		public Stack<Item> copy(Stack<Item> stack){
			Iterator<Item> a = stack.iterator();
			Stack<Item> x = new Stack<Item>();
			while(stack.iterator().hasNext()){
				x.push(a.next());
			}
			Iterator<Item> b = x.iterator();
			Stack<Item> y = new Stack<Item>();
			while(b.hasNext())
				y.push(b.next());
			return y;
		}

		@Override
		public Iterator<Item> iterator() {
			// TODO Auto-generated method stub
			return new ListIterator<Item>(first);
		}
		
		private class ListIterator<Item> implements Iterator<Item>{
			
			private Node<Item> current;
			
			public ListIterator(Node<Item> first){
				this.current = first;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return current != null;
			}

			@Override
			public Item next() {
				if(!hasNext())
					throw new NoSuchElementException("Stack under flow");
				Item item = current.item;
				current = current.next;
				return item;
			}
			
		}
		
	}
}
