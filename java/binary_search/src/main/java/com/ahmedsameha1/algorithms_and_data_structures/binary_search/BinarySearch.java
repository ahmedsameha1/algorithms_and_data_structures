package com.ahmedsameha1.algorithms_and_data_structures.binary_search;

public class BinarySearch {
    public boolean search(int num, int... arr) {
        return search(arr, 0, arr.length - 1, num);
    }

    private boolean search(int[] arr, int start, int end, int num) {
        int median = (start + end) / 2;
        if (arr[median] == num) {
            return true;
        } else if ( end - start < 1) {
            return false;
        } else if (arr[median] > num) {
            return search(arr, start, median - 1, num);
        } else {
            return search(arr, median + 1, end, num);
        }
    }
}
