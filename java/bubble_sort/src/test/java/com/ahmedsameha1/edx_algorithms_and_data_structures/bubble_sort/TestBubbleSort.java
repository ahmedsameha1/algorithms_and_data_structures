package com.ahmedsameha1.edx_algorithms_and_data_structures.bubble_sort;

// Copied from: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
import static org.junit.jupiter.api.Assertions.*;
// Copied from: https://junit.org/junit5/docs/current/user-guide/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestBubbleSort {
    private BubbleSort bubbleSort;

    @BeforeEach
    public void setup() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bubbleSort.sort(5, 4, 3, 2, 1));
        assertArrayEquals(new int[] {1, 2, 3, 4}, bubbleSort.sort(4, 3, 2, 1));
        assertArrayEquals(new int[] {-1, 1, 2, 3, 4}, bubbleSort.sort(4, 3, 2, 1, -1));
        assertArrayEquals(new int[] {-1, 15, 15, 52, 73, 104}, bubbleSort.sort(15, 73, 104, 15, 52, -1));
    }
}
