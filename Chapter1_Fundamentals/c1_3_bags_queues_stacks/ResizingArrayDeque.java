package c1_3_bags_queues_stacks;

import java.util.List;

public class ResizingArrayDeque<Item> {
	private Item[] list;
	private int N;
	private int left;
	private int right;
	
	public ResizingArrayDeque(){
		list = (Item[])new Object[2];
		N = 0;
		left = 0;
		right = 0;
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
		for(int i = 0; i < N; i++){
			temp[i] = list[left + i];
		}
		list = temp;
		left = 0;
		right = N - 1;
	}
	
	public void pushLeft(Item item){
		
	}
}
