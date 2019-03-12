package com.ahmedsameha1.edx_algorithms_and_data_structures.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int... intArr) {
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if ( intArr[j] < intArr[i] ) {
                    int tmp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tmp;
                }
            }
        }
        return intArr;
    }
}
