package c1_fundamentals.c1_2_data_abstraction;


//为SmartDate添加一个方法dayOfTheWeek()，为日期中每周的日返回Monday、Tuesday、Wednesday、Thursday、Friday、Saturday或Sunday中的适当值。
//你可以假定时间是21世纪。

import edu.princeton.cs.algs4.StdOut;

public class Q1_2_12 {
	public static void main(String[] args){
		SmartDate2 date = new SmartDate2(6, 22, 2016);
		StdOut.println(date.toText());
		StdOut.println(date.dayOfTheWeek());
	}

}
class SmartDate2{
	
	private int month;
	private int day;
	private int year;
	
	private final int[] days = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final String[] week = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
	public SmartDate2(int month, int day, int year){
		if(!isValid(month, day, year))
			throw new RuntimeException("invalid date");
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toText(){
		return month + "月" + day + "日" + "/" + year;
	}
	
	public String dayOfTheWeek(){
		//1999年12月27日是星期一
		int dayNum = (month-1)*days[month] + day + 5;
		return week[dayNum%7];
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