package com.ahmedsameha1.edx_algorithms_and_data_structures.linear_search;

// Copied from: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
import static org.junit.jupiter.api.Assertions.*;
// Copied from: https://junit.org/junit5/docs/current/user-guide/
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestLinearSearch {
    private LinearSearch linearSearch;

    @BeforeEach
    private void setup() {
        linearSearch = new LinearSearch();
    }

    @Test
    private void test() {
        assertEquals(true, linearSearch.search(new int[] { 1, 3, 5 }, 5));
        assertEquals(false, linearSearch.search(new int[] { 1, 3, 5}, 7));
    }
}
