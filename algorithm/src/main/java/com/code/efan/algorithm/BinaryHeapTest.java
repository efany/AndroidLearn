package com.code.efan.algorithm;

import java.util.Arrays;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public class BinaryHeapTest<Key extends Comparable<Key>> { // 二叉堆
    private Key[] pq;
    private int N = 0;

    private BinaryHeapTest(int MaxN){
        pq = (Key[]) new Comparable[MaxN + 1];
    }

    private boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void insert(Key v){
        pq[++N] = v;
        swim(N);
    }

    public Key delMax(){
        Key max = pq[1];
        exch(1, N--);
        pq[N + 1] = null;
        sink(1);
        return max;
    }

    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j){
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private void swim(int k){
        while (k > 1 && less(k / 2, k)){
            exch(k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k){
        while (2 * k < N) {
            int j = k * 2;
            if (j < N && less(j, j + 1)){
                j++;
            }
            if (!(less(k, j))){
                break;
            }
            exch(k, j);
            k = j;
        }
    }

    private void sort(){
        while(N > 1){
            System.out.print(delMax().toString()+", ");
        }
    }

    @Override
    public String toString() {
        return "BinaryHeapSort{" +
                "pq=" + Arrays.toString(pq) +
                ", N=" + N +
                '}';
    }

    public static void main(String[] args) {
        BinaryHeapTest binaryHeapSort = new BinaryHeapTest(20);
        for (Integer i = 0; i < 20; i++) {
            binaryHeapSort.insert(i);
        }
        System.out.println(binaryHeapSort.toString());
        binaryHeapSort.sort();
    }
}
