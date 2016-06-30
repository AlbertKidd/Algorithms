package c1_3_bags_queues_stacks;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

//使用1.3.1.5节中的readInts()作为模版为Date编写一个静态方法readDates()，从标准输入中读取由1.2.19的表格所指定的格式的多个日期并返回它们的一个数组。

public class Q1_3_16 {
	public static Date[] readDates(String[] args){
		In in = new In();
		Queue<Date> queue = new Queue<Date>();
		while(!in.isEmpty()){
			
			String[] sDate = in.readString().split("/");
			int month = Integer.parseInt(sDate[0]);
			int day = Integer.parseInt(sDate[1]);
			int year = Integer.parseInt(sDate[2]);
			Date date = new Date(month, day, year);
			queue.enqueue(date);
		}
		Date[] dates = new Date[queue.size()];
		for(int i = 0; i < queue.size(); i++)
			dates[i] = queue.dequeue();
		return dates;
	}
}
