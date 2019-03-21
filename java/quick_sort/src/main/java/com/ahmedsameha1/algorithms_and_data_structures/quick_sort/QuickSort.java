package com.ahmedsameha1.algorithms_and_data_structures.quick_sort;

public class QuickSort {
    public int[] sort(int... arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private void sort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        } else {
            int pivot = end;
            int i = start;
            int j = end - 1;
            while (i < j) {
                while (i < j && arr[i] < arr[pivot]) {
                    i++;
                }
                while (j > i && arr[j] > arr[pivot]) {
                    j--;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            int temp = arr[pivot];
            arr[pivot] = arr[j];
            arr[j] = temp;
            sort(arr, start, j - 1);
            sort(arr, j + 1, end);
        }
    }
}
