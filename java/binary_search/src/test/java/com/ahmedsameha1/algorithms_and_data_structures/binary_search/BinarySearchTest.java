package com.ahmedsameha1.algorithms_and_data_structures.binary_search;

// Copied from: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
import static org.junit.jupiter.api.Assertions.*;
// Copied from: https://junit.org/junit5/docs/current/user-guide/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    public void setup() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void test() {
        assertTrue(binarySearch.search(5, 1, 3, 5));
        assertTrue(binarySearch.search(1, 1, 3, 5));
        assertFalse(binarySearch.search(7, 1, 3, 5));
        assertFalse(binarySearch.search(7, -536, -66, -1, 1, 3, 5, 100, 1754));
        assertTrue(binarySearch.search(-66,-536, -66, -1, 1, 3, 5, 100, 1754));
    }
}
