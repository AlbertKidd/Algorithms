package common;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 数学函数扩展类
 */
public class MathEx {

    /**
     * 求出两个整数的最大公约数
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q){
        if (q == 0){
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
