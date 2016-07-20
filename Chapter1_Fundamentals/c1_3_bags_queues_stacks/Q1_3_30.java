package c1_3_bags_queues_stacks;

import c1_3_bags_queues_stacks.LinkedList.Node;

//编写一个函数，接受一条链表的首节点作为参数，（破坏性地）将链表反转并返回结果链表的首节点。

public class Q1_3_30 {
	public Node reverseLinkedList1(Node head){
		if(head == null || head.next == null)
			return head;
		Node p;
		Node q;
		Node r;
		p = head;
		q = head.next;
		head.next = null;
		while(q != null){
			r = q.next;
			q.next = p;
			p = q;
			q = r;
		}
		return p;
	}
	
	public Node reverseLinkedList2(Node head){
		Node p;
		Node q;
		p = head.next;
		while(p.next != null){
			q = p.next;
			p.next = q.next;
			q.next = head.next;
			head.next = q;
		}
		p.next = head;
		head = p.next.next;
		p.next.next = null;
		return head;
	}
}
