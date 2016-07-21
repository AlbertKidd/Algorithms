package c1_3_bags_queues_stacks;

public class Deque<Item> {
	private class Node{
		Item item;
		Node prev;
		Node next;
	}
	
	private int N;
	private Node left;
	private Node right;
	
	public Deque(){
		N = 0;
		left = null;
		right = null;
	}
	
	public boolean isEmpty(){
		return left == null;
	}
	
	public int size(){
		return N;
	}
	
	public void pushLeft(Item item){
		Node n = new Node();
		n.item = item;
		if(isEmpty()){
			left = n;
			right = n;
		}else{
			n.next = left;
			left.prev = n;
			left = n;
		}
		N++;
	}
	
	public void pushRight(Item item){
		Node n = new Node();
		n.item = item;
		if(isEmpty()){
			left = n;
			right = n;
		}else{
			right.next = n;
			n.prev = right;
			right = n;
		}
		N++;
	}
	
	public Item popLeft(){
		if(isEmpty())
			throw new RuntimeException("List is empty!");
		Item item = left.item;
		left = left.next;
		left.prev = null;
		if(left == null)
			right = null;
		N--;
		return item;
	}
	
	public Item popRight(){
		if(isEmpty())
			throw new RuntimeException("List is empty!");
		Item item = right.item;
		right = right.prev;
		right.next = null;
		if(right == null)
			left = null;
		N--;
		return item;
	}
}
