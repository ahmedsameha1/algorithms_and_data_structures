package com.ahmedsameha1.edx_algorithms_and_data_structures.bubble_sort;

public class BubbleSort {
    public int[] sort(int... arr) {
        boolean swap_done = true;
        while (swap_done) {
            swap_done = false;
            for ( int i = 0; i < arr.length - 1; i++ ) {
                if ( arr[i + 1] < arr[i] ) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap_done = true;
                }
            }
        }
        return arr;
    }
}
