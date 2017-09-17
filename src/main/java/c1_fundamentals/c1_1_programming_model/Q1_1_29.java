package c1_fundamentals.c1_1_programming_model;


//等值键。
//为BinarySearch 类添加一个静态方法rank()，它接受一个键和一个整型有序数组（可能存在重复键）作为参数并返回数组中小于该键的元素数量，以及一个类似的方法count() 来返回数组中等于该键的元素的数量。
//注意：如果i 和j 分别是rank(key,a) 和count(key,a)的返回值，那么a[i..i+j-1] 就是数组中所有和key 相等的元素。

import edu.princeton.cs.introcs.StdOut;

public class Q1_1_29 {
	public static void main(String[] args){
		int[] a = {1, 1, 2 , 3 ,3 , 3 , 4, 5 ,6 ,7 };
		int i = rank(4, a);
		StdOut.println(i);
		int j = count(4, a);
		StdOut.println(j);
	}
	private static int rank(int key, int[] a){
		int nearKey = searchNearKey(a, key);
		if (key > a[nearKey]){
			return nearKey + 1;
		}else if (key < a[nearKey]){
			return nearKey;
		}else {
			while (nearKey >= 0 && key == a[nearKey]) nearKey--;
			return nearKey + 1;
		}
	}

	private static int count(int key, int[] a){
		int searchedKey = searchKey(a, key);
		if (searchedKey == -1){
			return 0;
		}else {
			int n = 1;
			int pre = searchedKey - 1;
			while (pre >= 0 && key == a[pre]){
				n++;
				pre = pre - 1;
			}
			int after = searchedKey + 1;
			while (key < a.length && key == a[after] ){
				n++;
				after = after + 1;
			}
			return n;
		}
	}

	private static int searchKey(int[] a, int value){
		int lo = 0;
		int hi = a.length;
		while (lo < hi){
			int mid = lo + (hi - lo) / 2;
			if (value > a[mid]) lo = mid + 1;
			else if (value < a[mid]) hi = mid - 1;
			else return mid;
		}
		return -1;
	}

	private static int searchNearKey(int[] a, int value){
		int lo = 0;
		int hi = a.length;
		int mid = 0;
		while (lo < hi){
			mid = lo + (hi - lo) / 2;
			if (value < a[mid]) hi = mid - 1;
			else if (value > a[mid]) lo = mid + 1;
			else return mid;
		}
		return mid;
	}
}
