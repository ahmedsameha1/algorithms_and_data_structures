package com.ahmedsameha1.edx_algorithms_and_data_structures.linear_search;

public class LinearSearch {
    public boolean search(int num, int... arr) {
        for ( int i: arr ) {
            if ( i == num ) {
                return true;
            }
        }
        return false;
    }
}
