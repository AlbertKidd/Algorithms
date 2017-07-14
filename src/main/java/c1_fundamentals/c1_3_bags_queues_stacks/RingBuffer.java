package c1_fundamentals.c1_3_bags_queues_stacks;

public class RingBuffer<Item> {
	
	private int size;
	private int N;
	private Item[] q;
	private int first, last;
	
	public RingBuffer(int size){
		N = 0;
		q = (Item[]) new Object[size];
		this.size = size;
		first = 0;
		last = 0;
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public boolean isFull(){
		return N == size;
	}
	
	public void enqueue(Item item){
		if(isFull())
			throw new RuntimeException("The buffer is full!");
		q[last++] = item;
		if(last == size)
			last = 0;
		N++;
	}
	
	public Item dequeue(){
		if(isEmpty())
			throw new RuntimeException("The buffer is empty!");
		Item item = q[first];
		first++;
		if(first == size)
			first = 0;
		N--;
		return item;
	}

}
