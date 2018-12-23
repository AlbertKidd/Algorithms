package common;

import edu.princeton.cs.algs4.StdRandom;

/**
 * 随机数组类库
 */
public class RandomArray {

    /**
     * 创建一个指定大小的数组
     * @param size
     * @return
     */
    public static int[] generate(int size){
        return generate(size, true);
    }

    /**
     * 创建一个指定大小的数组，不含重复元素
     * @param size 数组大小
     * @param orderly 是否有序（递增）
     * @return
     */
    public static int[] generate(int size, boolean orderly){
        int[] arr = new int[size];
        return generate(size, orderly, false);
    }

    /**
     * 创建一个指定大小的数组
     * @param size 数组大小
     * @param orderly 是否有序（递增）
     * @param allowRepeat 是否允许元素重复
     * @return
     */
    public static int[] generate(int size, boolean orderly, boolean allowRepeat){
        int[] arr = new int[size];
        arr[0] = StdRandom.uniform(10);
        for (int i = 1; i < size; i++){
            arr[i] = arr[i - 1] + StdRandom.uniform(10);
            if (!allowRepeat){
                arr[i]++;
            }
        }
        if (!orderly){
            StdRandom.shuffle(arr);
        }
        return arr;
    }
}
