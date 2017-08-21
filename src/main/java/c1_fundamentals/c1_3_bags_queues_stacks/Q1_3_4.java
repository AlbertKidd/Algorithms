package c1_fundamentals.c1_3_bags_queues_stacks;


//编写一个Stack的用例Parentheses，从标准输入中读取一个文本流并使用栈判定其中的括号是否配对完整。
//例如，对于[()]{}{[()()]()}程序应该打印true，对于[(])则打印false。

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Q1_3_4 {
	public static void main(String[] args){
		String s = StdIn.readString();
		StdOut.print(parentheses(s));
	}
	public static boolean parentheses(String s){
		Stack<Character> open = new Stack<Character>();
		int n = s.length();
		for(int i=0; i<n; i++){
			char c = s.charAt(i);
			
			if(c == '(' || c == '[' || c == '{')
				open.push(c);
			
			else if((c == ')' && (open.isEmpty() || open.pop() != '(')) ||
					(c == ']' && (open.isEmpty() || open.pop() != '['))||
					(c == '}' && (open.isEmpty() || open.pop() != '{')))
				return false;
		}
		return open.isEmpty();
	}
}

