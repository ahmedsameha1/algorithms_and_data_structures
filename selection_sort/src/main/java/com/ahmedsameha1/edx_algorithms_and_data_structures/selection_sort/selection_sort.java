package com.ahmedsameha1.edx_algorithms_and_data_structures.selection_sort;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] intArr = {4,9,7,1,3,6,5,-1, 33, -10, 77, 0};
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
        System.out.println(Arrays.toString(intArr));
    }
}
