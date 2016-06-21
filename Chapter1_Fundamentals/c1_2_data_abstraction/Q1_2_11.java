package c1_2_data_abstraction;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

//根据Date的API实现一个SmartDate类型， 在日期非法时抛出一个异常

public class Q1_2_11 {
	public static void main(String[] args){
		SmartDate date = new SmartDate(2, 29, 1200);
		StdOut.println(date.toText());
	}
	
}
class SmartDate{
	
	private int month;
	private int day;
	private int year;
	
	private final int[] days = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public SmartDate(int month, int day, int year){
		if(!isValid(month, day, year))
			throw new RuntimeException("invalid date");
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toText(){
		return month + "月" + day + "日" + "/" + year;
	}
	
	private boolean isValid(int month, int day, int year){
		if(month < 1 || month > 12)
			return false;
		if(day < 1 || day > days[month])
			return false;
		if(!isLeapYear(year) && month == 2  && day > 28)
			return false;
		return true;
	}
	
	private boolean isLeapYear(int year){
		if(year % 400 == 0)
			return true;
		if(year % 100 == 0)
			return false;
		return year % 4 == 0;
	}
}