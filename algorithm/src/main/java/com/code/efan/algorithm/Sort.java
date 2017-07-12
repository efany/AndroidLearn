package com.code.efan.algorithm;

import android.icu.text.BreakIterator;
import android.view.ViewDebug;

/**
 * Created by efan on 2017/4/30.
 * Email: yifanyan@sohu-inc.com
 */

public class Sort {

    private static Comparable[] merge; // 归并排序

    public static void sort(Comparable[] a) {
        /* 请见算法2.1、 算法2.2、 算法2.3、 算法2.4、 算法2.5或算法2.7*/
    }

    public static void selectionSort(Comparable[] a) { // 选择排序
        int N = a.length;
        for (int i = 0; i < N; i++){
            int min = i;
            for (int j = i + 1; j < N; j++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(a,i,min);
        }
    }

    public static void insertionSort(Comparable[] a) { // 插入排序
        int N = a.length;
        for (int i = 1; i < N; i++){
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--){
                exch(a, j - 1, j);
            }
        }
    }

    public static void shellSort(Comparable[] a) { // 希尔排序
        int N = a.length;
        int h = 1;
        while (h < N/3){
            h = h * 3 + 1;
        }
        while (h >= 1){
            for (int i = h; i < N; i++){
                for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h){
                    exch(a, j - h, j);
                }
            }
            h = h / 3;
        }
    }

    public static void mergeSortMerge(Comparable[] a, int low, int mid, int height) { // 归并排序，用于合并有序序列
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= height; k++){
            merge[k] = a[k];
        }
        for (int k = low; k <= height; k++){
            if (i > mid){
                a[k] = merge[j++];
            }else if (j > height){
                a[k] = merge[i++];
            }else if (less(merge[j], merge[i])){
                a[k] = merge[j++];
            }else {
                a[k] = merge[i++];
            }
        }
    }

    public static void mergeSort1(Comparable[] a, int low, int height) { // 归并排序 自顶向下
        if (height <= low){
            return;
        }
        int mid = low + (height - low)/2;
        mergeSort1(a, low, mid);
        mergeSort1(a, mid + 1, height);
        mergeSortMerge(a, low, mid, height);
    }

    public static void mergeSort2(Comparable[] a) { // 归并排序 自底向上
        int N = a.length;
        for (int size = 1; size < N; size = size + size){
            for (int low = 0; low < N - size; low += size + size){
                mergeSortMerge(a, low, low + size - 1, Math.min(low + size + size - 1, N - 1));
            }
        }
    }

    public static int quickSortPartition(Comparable[] a, int low, int height) { // 快速排序 选取首元素作为切分元素并完成切分
        int i = low;
        int j = height + 1;
        Comparable v = a[low];
        while (true) {
            while (less(a[++i], v)) {
                if (i == height){
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == low){
                    break;
                }
            }
            if (i >= j){
                break;
            }
            exch(a, i, j);
        }
        exch(a, low, j);
        return j;
    }

    public static void quickSort(Comparable[] a, int low, int height) { // 快速排序，递归执行
        if(height <= low){
            return;
        }
        int j = quickSortPartition(a, low, height);
        quickSort(a, low, j - 1);
        quickSort(a, j + 1, height);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }

    private static void show(Comparable[] a) { // 在单行中打印数组
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) { // 测试数组元素是否有序
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    public static void main(String[] args) { // 从标准输入读取字符串， 将它们排序并输出
        Integer[] a = {5,3,6,4,7,2,8,1,9};
//        merge = new Comparable[a.length];
//        mergeSort2(a);
        quickSort(a, 0, a.length - 1);
        assert isSorted(a);
        show(a);
    }
}
