package common;

import edu.princeton.cs.algs4.BinarySearch;

/**
 * 二分查找扩展类
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

    /**
     * 找到数组中小于key值的数量
     * @param arr
     * @param key
     * @return
     */
    public static int rank(int[] arr, int key){
        int rank = 0;
        int min = 0;
        int max = arr.length;
        while (min < max){
            int mid = (min + max) / 2;
            if (key < arr[mid]){
                max = mid - 1;
            }else if (key > arr[mid]){
                rank = mid + 1;
                min = mid + 1;
            }else {
                rank = mid;
                while (rank > 0 && arr[rank] == arr[rank - 1]){
                    rank--;
                }
                return rank;
            }
        }
        return rank;
    }

    /**
     * 找出数组中与指定值相等的数量
     * @param arr
     * @param key
     * @return
     */
    public static int count(int[] arr, int key){
        int count = 0;
        int index = BinarySearch.indexOf(arr, key);
        if (index != -1){
            count = 1;
            int low = index;
            while (low > 0 && arr[low] == arr[low - 1]){
                low--;
                count++;
            }
            int high = index;
            while (high < arr.length - 2 && arr[high] == arr[high + 1]){
                high++;
                count++;
            }
        }
        return count;
    }
}
