package c1_fundamentals.c1_3_bags_queues_stacks;

//为FixedCapacityStackOfStrings添加一个方法isFull()。

public class Q1_3_1 {
	
}
class FixedCapacityStackOfStrings{
	private String[] a;
	private int N;
	public FixedCapacityStackOfStrings(int cap){
		a = new String[cap];
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return a.length;
	}
	public void push(String item){
		a[N++] = item;
	}
	public String pop(){
		return a[--N];
	}
	
	//add method
	public boolean isFull(){
		return N == a.length;
	}
	
}
