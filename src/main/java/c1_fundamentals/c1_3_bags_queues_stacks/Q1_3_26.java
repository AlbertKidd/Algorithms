package c1_fundamentals.c1_3_bags_queues_stacks;

//编写一个方法remove(),接受一条链表和一个字符串key作为参数，删除链表中所有item域为key的节点。

public class Q1_3_26 {
	private LinkedList remove(LinkedList list, String key){
		for(LinkedList.Node node = list.first; node != null; node = node.next){
			if(node.next.item == key){
				node.next = node.next.next;
				list.N -= 1;
			}
		}
		return list;
	}
}
