package c1_fundamentals.c1_2_data_abstraction;


//用我们对Date的实现（请见表1.2.12）作为模版实现Transaction类型。

import edu.princeton.cs.algs4.Date;

public class Q1_2_13 {

}
class Transaction{
	String who;
	Date when;
	double amount;
	
	public Transaction(String who, Date when, double amount){
		this.who = who;
		this.when = when;
		this.amount = amount;
	}
	
	public Transaction(String who, String when, double amount){
		this.who = who;
		this.amount = amount;
		
		String[] s = when.split("/");
		int month = Integer.parseInt(s[0]);
		int day = Integer.parseInt(s[1]);
		int year = Integer.parseInt(s[2]);
		this.when = new Date(month, day, year);
	}
	
	String who(){
		return who;
	}
	
	Date when(){
		return when;
	}
	
	double amount(){
		return amount;
	}
	
	public String toString(){
		return who + "," + when + "," + amount;
	}
	
	boolean equals(Transaction that){
		if(this.who == that.who && this.when == that.when && this.amount == that.amount)
			return true;
		return false;
	}
	
}
