package com.bridgelabz.generics;

/*
 * code for maximumtest using generics
 * @deepak  started 6/10/21
 * this code  determines the largest of three Comparable objects
 *
 * */

public class MaximumTest {


    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;   // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y;   // y is the largest so far
        }

        if (z.compareTo(max) > 0) {
            max = z;   // z is the largest now
        }
        return max;   // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum(3, 4, 5));


    }
}

