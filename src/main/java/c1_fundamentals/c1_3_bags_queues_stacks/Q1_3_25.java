package c1_fundamentals.c1_3_bags_queues_stacks;

//编写一个方法insertAfter()，接受两个链表节点作为参数，将第二个节点插入链表并使之成为第一个节点的后续节点。
//如果两个参数为空则什么都不做。

public class Q1_3_25<T> {
	
	void insertAfter(LinkedList.Node a, LinkedList.Node b){
		if(a != null && b != null){
			b.next = a.next;
			a.next = b;
		}
	}
}
