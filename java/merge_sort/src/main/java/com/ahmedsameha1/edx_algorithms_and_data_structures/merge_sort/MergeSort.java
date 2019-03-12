package com.ahmedsameha1.edx_algorithms_and_data_structures.merge_sort;

import java.util.Arrays;

public class MergeSort {
    public int[] sort(int... arr) {
        if (arr.length < 2) {
            return arr;
        } else {
            return merge(sort(Arrays.copyOfRange(arr, 0, (arr.length / 2))), sort(Arrays.copyOfRange(arr, (arr.length / 2), arr.length)));
        }
    }

    private int[] merge(int[] arr1, int[] arr2) {
        int[] sorted_array = new int[arr1.length + arr2.length];
        int a = 0, b = 0, c = 0;
        while (a < arr1.length || b < arr2.length) {
            sorted_array[c++] = b >= arr2.length || ( a < arr1.length && arr1[a] < arr2[b]) ? arr1[a++] : arr2[b++];
        }
        return sorted_array;
    }
}
