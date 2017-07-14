package c1_fundamentals.c1_3_bags_queues_stacks;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//编写一段程序，从标准输入得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式。

public class Q1_3_9 {
	
	public static void main(String[] args){
		
		Stack<String> ops = new Stack<String>();
		Stack<String> vals = new Stack<String>();
		
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			
			if (s.equals("("))
				StdOut.print(s);
			else if(s.equals("+") || s.equals("-") || s.equals("*") ||
				s.equals("/") || s.equals("sqrt"))
				ops.push(s);
			else if(s.equals(")")){
				String op = ops.pop();
				String v = vals.pop();
				
				if(op.equals("+") || op.equals("-") || op.equals("*") ||
						op.equals("/"))
					v = String.format("( %s %s %s )", vals.pop(), op, v);
				else if(op.equals("sqrt"))
					v = String.format("( %s, %s )", op, v);
				vals.push(v);
			}
			else vals.push(s);
		}
		StdOut.print(vals.pop());
	}
	
}
