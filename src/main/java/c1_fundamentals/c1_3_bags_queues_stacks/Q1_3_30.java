package c1_fundamentals.c1_3_bags_queues_stacks;

//编写一个函数，接受一条链表的首节点作为参数，（破坏性地）将链表反转并返回结果链表的首节点。

public class Q1_3_30 {
	public LinkedList.Node reverseLinkedList1(LinkedList.Node head){
		if(head == null || head.next == null)
			return head;
		LinkedList.Node p;
		LinkedList.Node q;
		LinkedList.Node r;
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
	
	public LinkedList.Node reverseLinkedList2(LinkedList.Node head){
		LinkedList.Node p;
		LinkedList.Node q;
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
