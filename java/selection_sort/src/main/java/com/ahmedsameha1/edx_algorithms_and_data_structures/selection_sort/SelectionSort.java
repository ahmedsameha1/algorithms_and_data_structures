package com.ahmedsameha1.edx_algorithms_and_data_structures.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            int min = i;
            for (int j = i + 1; j < intArr.length; j++) {
                if ( intArr[j] < intArr[min] ) {
                    int tmp = intArr[min];
                    intArr[min] = intArr[j];
                    intArr[j] = tmp;
                }
            }
        }
        return intArr;
    }
}
