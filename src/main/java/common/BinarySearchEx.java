package common;

import edu.princeton.cs.algs4.BinarySearch;

/**
 * 二分查找扩展
 * 由于BinarySearch构造器为私有，无法继承
 */
public class BinarySearchEx{

    /**
     * 二分查找，指定从数组的某个范围开始查找
     * @param arr
     * @param key
     * @param start
     * @param end
     * @return
     */
    public static int indexOf(int[] arr, int key, int start, int end){
        if (start <= end){
            int mid = (start + end) / 2;
            if (key == arr[mid]){
                return mid;
            }else if (key > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
            return indexOf(arr, key, start, end);
        }
        return -1;
    }
}
