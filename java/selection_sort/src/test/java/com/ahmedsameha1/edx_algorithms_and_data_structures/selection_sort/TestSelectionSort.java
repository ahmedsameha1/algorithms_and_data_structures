package com.ahmedsameha1.edx_algorithms_and_data_structures.selection_sort;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSelectionSort {
    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3, 4}, selectionSort.sort(4, 3, 2, 1));
        assertArrayEquals(new int[] {-1, 1, 2, 3, 4}, selectionSort.sort (4, 3, 2, 1, -1));
        assertArrayEquals(new int[] {-1, 15, 15, 52, 73, 104}, selectionSort.sort(15, 73, 104, 15, 52, -1));
    }
}
