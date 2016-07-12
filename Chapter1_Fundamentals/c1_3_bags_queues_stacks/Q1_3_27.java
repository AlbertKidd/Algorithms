package c1_3_bags_queues_stacks;

import c1_3_bags_queues_stacks.LinkedList.Node;

//编写一个方法max(),接受一条链表的首节点作为参数，返回链表中键最大的节点的值。
//假设所有键均为正整数，如果链表为空则返回0。

public class Q1_3_27 {
	private int max(LinkedList list){
		if(list.isEmpty())
			return 0;
		int temp = 0;
		for(Node node = list.first; node != null; node = node.next){
			if((int)node.item > temp)
				temp = (int)node.item;
		}
		return temp;
	}
}
