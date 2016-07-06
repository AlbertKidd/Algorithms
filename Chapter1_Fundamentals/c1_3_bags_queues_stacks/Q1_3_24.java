package c1_3_bags_queues_stacks;

//编写一个方法removeAfter()，接受一个链表节点作为参数并删除该节点的后续节点。
//如果参数节点或参数节点的后续节点为空则什么都不做。

public class Q1_3_24<T> {
	private int n;
	private Node first;
	private Node last;
	
	private class Node{
		T item;
		Node next;
	}
	
	void removeAfter(Node node){
		if(node != null && node.next != null){
			if(node.next.next != null)
				node.next = node.next.next;
			else{
				node.next = null;
				last = node;
			}
		}
	}
}
