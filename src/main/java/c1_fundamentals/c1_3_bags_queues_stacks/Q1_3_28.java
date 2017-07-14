package c1_fundamentals.c1_3_bags_queues_stacks;

//用递归的方法解答上一道练习。

public class Q1_3_28 {
	private int max(LinkedList list){
		if(list.isEmpty())
			return 0;
		if(list.first.next != null && (int)list.first.item < (int)list.first.next.item){
			list.first = list.first.next;
			list.N -= 1;
			return max(list);
		}else
			return (int)list.first.item;
	}
}
