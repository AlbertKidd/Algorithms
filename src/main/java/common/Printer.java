package common;

import edu.princeton.cs.algs4.StdOut;

public class Printer {

    /**
     * 打印一维数组
     * @param arr
     */
    public static void print(int[] arr){
        StdOut.print("[");
        for (int i : arr){
            StdOut.printf("%4s", i);
        }
        StdOut.print("]");
        StdOut.println();
    }
}
