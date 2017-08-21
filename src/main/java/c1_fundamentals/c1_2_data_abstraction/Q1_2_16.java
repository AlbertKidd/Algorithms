package c1_fundamentals.c1_2_data_abstraction;


//有理数。
//为有理数实现一个不可变数据类型Rational,支持加减乘除操作。

import edu.princeton.cs.introcs.StdOut;

public class Q1_2_16 {
	
	public static void main(String[] args){
		Rational a = new Rational(2, 4);
		Rational b = new Rational(1, 3);
		StdOut.println(a.plus(b));
		StdOut.println(a.minus(b));
		StdOut.println(a.times(b));
		StdOut.println(a.divides(b));
		StdOut.println(a.equals(b));
	}
	
	
}
class Rational{
	
	//n means numerator, d means denominator
	int n;
	int d;
	
	public Rational(int n, int d){
		if(d == 0)
			StdOut.print("wrong!");
		while(gcd(n, d) > 1){
			int gcd = gcd(n, d);
			n /= gcd;
			d /= gcd;
		}
		this.n = n;
		this.d = d;
	}
	
	public Rational plus(Rational b){
		return new Rational((this.n*b.d + b.n * this.d), this.d * b.d);
	}
	
	public Rational minus(Rational b){
		return new Rational((this.n*b.d - b.n * this.d), this.d * b.d);
	}
	
	public Rational times(Rational b){
		return new Rational(this.n*b.n, this.d * b.d);
	}
	
	public Rational divides(Rational b){
		return new Rational(this.n*b.d, this.d * b.n);
	}
	
	public boolean equals(Rational that){
		return (this.n/this.d == that.n/that.d);
	}
	
	public String toString(){
		return n + "/" + d;
	}
	
	public int gcd(int p, int q){
		if(q ==0)
			return p;
		int r = p % q;
		return gcd(q, r);
	}
}