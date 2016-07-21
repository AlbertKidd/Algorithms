package c1_3_bags_queues_stacks;

//实现一个套嵌类DoubleNode用来构造双向链表，其中每个结点都含有一个指向前驱元素的引用和一项指向后续元素的引用。
//为以下任务实现若干静态方法：在表头插入节点、在表尾插入节点、从表尾删除结点、在指定结点之前插入新结点、在指定节点之后插入新结点、删除指定结点。

public class Q1_3_31<T> {
	class DoubleNode{
		Q1_3_31<T> parent = list();
		T item;
		DoubleNode prev;
		DoubleNode next;
	}
	
	private int N;
	private DoubleNode first;
	private DoubleNode last;
	
	private Q1_3_31<T> list(){
		return this;
	}
	
	public Q1_3_31(){
		first = null;
		last = null;
		N = 0;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void appendFirst(T item){
		DoubleNode n = new DoubleNode();
		n.item = item;
		if(isEmpty()){
			first = n;
			last = n;
		}else{
			n.next = first;
			first.prev = n;
			first = n;
		}
		N++;
	}
	
	public void appendLast(T item){
		DoubleNode n = new DoubleNode();
		n.item = item;
		if(isEmpty()){
			first = n;
			last = n;
		}else{
			last.next = n;
			n.prev = last;
			last = n;
		}
		N++;
	}
	
	public void appendBefore(DoubleNode node, T item){
		if(node.parent != this)
			throw new RuntimeException("Node doesn't belong to list.");
		if(node == first)
			appendFirst(item);
		else{
			DoubleNode n = new DoubleNode();
			n.item = item;
			DoubleNode pre = node.prev;
			n.prev = pre;
			n.next = node;
			pre.next = n;
			node.prev = n;
			N++;
		}
	}
	
	public void appendAfter(DoubleNode node, T item){
		if(node.parent != this)
			throw new RuntimeException("Node doesn't belong to list.");
		if(node == last)
			appendLast(item);
		else{
			DoubleNode nex = node.next;
			DoubleNode n = new DoubleNode();
			n.item = item;
			node.next = n;
			nex.prev = n;
			n.next = nex;
			n.prev = node;
			N++;
		}
	}
	
	public T delFirst(){
		if(isEmpty())
			throw new RuntimeException("list is empty");
		T item = first.item;
		first = first.next;
		if(first != null)
			first.prev = null;
		else
			last = null;
		N--;
		return item;
	}
	
	public T delLast(){
		if(isEmpty())
			throw new RuntimeException("list is empty");
		T item = last.item;
		last = last.prev;
		if(last != null)
			last.next = null;
		else
			first = null;
		N--;
		return item;
	}
	
	public T remove(DoubleNode node){
		if(node.parent != this)
			throw new RuntimeException("Node doesn't belong to list.");
		if(node == first)
			return delFirst();
		else if(node == last)
			return delLast();
		else{
			DoubleNode pre = node.prev;
			DoubleNode nex = node.next;
			pre.next = nex;
			nex.prev = pre;
			T item = node.item;
			node = null;
			N--;
			return item;
		}
	}
}
