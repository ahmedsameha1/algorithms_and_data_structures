package com.ahmedsameha1.algorithms_and_data_structures.quick_sort;

// Copied from: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
import static org.junit.jupiter.api.Assertions.*;
// Copied from: https://junit.org/junit5/docs/current/user-guide/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class TestQuickSort{
    private QuickSort quickSort;

    @BeforeEach
    public void setup() {
        quickSort = new QuickSort();
    }

    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, quickSort.sort(5, 4, 3, 2, 1));
        assertArrayEquals(new int[] {1, 2, 3, 4}, quickSort.sort(4, 3, 2, 1));
        assertArrayEquals(new int[] {-1, 1, 2, 3, 4}, quickSort.sort(4, 3, 2, 1, -1));
        assertArrayEquals(new int[] {-1, 15, 15, 52, 73, 104}, quickSort.sort(15, 73, 104, 15, 52, -1));
    }
}
