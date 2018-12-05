package common;

import edu.princeton.cs.algs4.StdOut;

public class Printer {

    /**
     * 打印一维数组
     * @param arr
     */
    public static void print(int[] arr){
        StdOut.print("[");
        for (int i = 0; i < arr.length; i++){
            if (i != arr.length - 1){
                StdOut.printf("%s,", arr[i]);
            }else {
                StdOut.print(arr[i]);
            }
        }
        StdOut.print("]");
        StdOut.println();
    }

}
