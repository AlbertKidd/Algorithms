package c1_2_data_abstraction;

import edu.princeton.cs.algs4.Date;

//用我们对Date的实现（请见表1.2.12）作为模版实现Transaction类型。

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
