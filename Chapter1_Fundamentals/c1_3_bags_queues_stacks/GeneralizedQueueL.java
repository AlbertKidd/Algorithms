package c1_3_bags_queues_stacks;

import java.util.NoSuchElementException;

public class GeneralizedQueueL<Item> {
	private int N;
	private Node first,last;
	
	class Node<Item>{
		Item item;
		Node next;
	}
	
	public GeneralizedQueueL(){
		N = 0;
		first = null;
		last = null;
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public void insert(Item x){
		Node node = new Node();
		node.item = x;
		if(isEmpty()){
			first = node;
			last = node;
		}
		else
			last.next = node;
		N++;
	}
	
	public Item delete(int k){
		if(k >= N)
			throw new NoSuchElementException();
		if(k == 1){
			Item oldFirst = (Item) first.item;
			first = first.next;
			if(first == null)
				last = null;
			N--;
			return oldFirst;
		}else{
			Node n = first;
			Item mItem;
			for(int i = 0; i < k - 2; i++){
				n = n.next;
			}
			mItem = (Item) n.next.item;
			n.next = n.next.next;
			N--;
			return mItem;
		}
		
	}
}
