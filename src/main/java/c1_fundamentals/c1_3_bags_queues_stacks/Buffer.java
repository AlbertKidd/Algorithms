package c1_fundamentals.c1_3_bags_queues_stacks;

import edu.princeton.cs.algs4.StdOut;

public class Buffer {
	private Stack<Character> buffer, cursor;
	
	public Buffer(){
		buffer = new Stack();
		cursor = new Stack();
	}
	
	public void insert(char c){
		buffer.push(c);
		cursor.push(c);
	}
	
	public char delete(){
		buffer.pop();
		return cursor.pop();
	}
	
	public void left(int k){
		if(k > cursor.size() - 1)
			throw new RuntimeException("Out of bounds");
		for(int i = 0; i < k; i++){
			cursor.pop();
		}
	}
	
	public void right(int k){
		if(k > buffer.size() - cursor.size())
			throw new RuntimeException("Out of bounds");
		for(int i = 0; i < k; i++){
			Stack<Character> temp = new Stack(buffer);
			char c = '\0';
			for(int j = 0; j < k - 1; j++){
				c = temp.pop();
			}
			if(c != '\0')
				cursor.push(c);
		}
	}
	
	public int size(){
		return buffer.size();
	}
	
	public void print(){
		buffer.print();
		StdOut.println("光标位置在" + cursor.peek());
	}
}
