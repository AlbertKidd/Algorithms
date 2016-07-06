package c1_3_bags_queues_stacks;

//编写一个方法find()，接受一条链表和一个字符串key作为参数。
//如果链表中的某个节点的item域的值为key，则方法返回true，否则返回false。

public class Q1_3_21<T> {
	
	
	private int N;
	private Node first;
	private Node last;
	
	private class Node<T>{
		T item;
		Node next;
	}
	
	boolean find(T item){
		for(Node x = first; x != null; x = x.next){
			if(x.item == item)
				return true;
		}
		return false;
	}
}
