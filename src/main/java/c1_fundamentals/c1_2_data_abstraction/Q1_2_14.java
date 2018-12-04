package c1_fundamentals.c1_2_data_abstraction;


//用我们对Date中的equals()方法的实现(请见1.2.5.8节中的Date类代码框)作为模版，实现Transaction中的equals()方法。

import edu.princeton.cs.algs4.Date;

public class Q1_2_14 {

}
class Transaction2{
	String who;
	Date when;
	double amount;
	
	public Transaction2(String who, Date when, double amount){
		this.who = who;
		this.when = when;
		this.amount = amount;
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
	
	int compareTo(Transaction that){
		if(this.amount > that.amount)
			return 1;
		else if(this.amount < that.amount)
			return -1;
		else 
			return 0;
	}
	
	public int hashCode(){
		int hash = 1991;
		int key = 61;
		hash = (int) (hash*key + amount);
		return hash;
	}
	
}
