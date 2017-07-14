package c1_fundamentals.c1_3_bags_queues_stacks;

//编写一个Queue的用例，接受一个命令行参数k并打印出标准输入中的倒数第k个字符串（假设标准输入中至少有k个字符串）。

public class Q1_3_15 {
	class Queue<Item>{
		private Item[] a;
		private int first;
		private int tail;
		
		public Queue(int cap){
			a = (Item[]) new Object[cap];
		}
		
		void enqueque(Item item){
			a[++tail] = item;
		}
		
		Item dequeue(){
			Item item = a[first];
			a[first] = null;
			first++;
			return item;
		}
		
		Item peek(int k){
			Item item = a[tail - k];
			return item;
		}
	}
}
