package c1_3_bags_queues_stacks;

import java.util.NoSuchElementException;

//编写一个类ResizingArrayQueueOfString，使用定长数组实现队列的抽象，然后扩展实现，使用调整数组的方法突破大小的限制。

public class Q1_3_14 {
	class ResizingArrayQueueOfString<Item>{
		private Item[] a;
		private int head;
		private int tail;
		
		public ResizingArrayQueueOfString(int cap){
			a = (Item[]) new Object[cap];
			head = 0;
			tail = a.length - 1;
		}
		
		private void resize(int max){
			Item[] temp = (Item[]) new Object[max];
			int count = 1;
			for(int i = 0; i < tail - head; i++){
				temp[i] = a[head - i];
				count++;
			}
			head = 0;
			tail = count - 1;
			a = temp;
		}
		
		public void enqueue(Item item){
			if(tail == a.length - 1)
				resize(2 * a.length);
			a[++tail] = item;
		}
		
		public Item dequeue(){
			if(isEmpty())
				throw new NoSuchElementException("Stack under flow!");
			Item item = a[head];
			a[head] = null;
			head++;
			if(tail - head + 1 == a.length/4 )
				resize(a.length/2);
			return item;
		}
		
		public int size(){
			return tail - head;
		}
		
		public boolean isEmpty(){
			return this.size() == 0;
		}
	}
}
