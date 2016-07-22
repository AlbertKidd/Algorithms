package c1_3_bags_queues_stacks;

import java.util.List;

public class ResizingArrayDeque<Item> {
	private Item[] list;
	private int N;
	private int left;
	private int right;
	
	public ResizingArrayDeque(){
		list = (Item[])new Object[3];
		N = 0;
		left = 1;
		right = 1;
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public int size(){
		return N;
	}
	
	private void resize(int n){
		assert n >= N;
		Item[] temp = (Item[])new Object[n];
		int newLeft = (n - list.length + 1) / 2;
		for(int i = 0; i < N; i++){
			temp[newLeft + i] = list[left + i];
		}
		list = temp;
		left = newLeft;
		right = newLeft + N - 1;
	}
	
	public void pushLeft(Item item){
		if(N == 0)
			list[1] = item;
		else{
			if(N == list.length - 2)
				resize(2 * N + 2);
			else
				resize(list.length);
			list[--left] = item;
		}				
		N++;
	}
	
	public void pushRight(Item item){
		if(N == 0)
			list[1] = item;
		else{
			if(N == list.length - 2)
				resize(2 * N + 2);
			else
				resize(list.length);
			list[++right] = item;
		}				
		N++;
	}
	
	public Item popLeft(){
		Item item = list[left];

		if(isEmpty())
			throw new RuntimeException("list is empty!");
		else if(N == (list.length - 2) / 4){
			resize(list.length/2 - 1);
			if(N == 1)
				list[left] = null;
			else
				list[left++] = null;
		}
		N--;
		return item;
	}
	
	public Item popRight(){
		Item item = list[right];

		if(isEmpty())
			throw new RuntimeException("list is empty!");
		else if(N == (list.length - 2) / 4){
			resize(list.length/2 - 1);
			if(N == 1)
				list[right] = null;
			else
				list[right--] = null;
		}
		N--;
		return item;
	}
	
	
}
