package org.example;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 20, 100, 200}; //2

        int foundIdx = binarySearch(arr, 0, arr.length - 1, 1);

        System.out.println(foundIdx);

//        int[] arrNotSorted = {10, 0, -4, -100, 20, 5};
//        Arrays.sort(arrNotSorted);
//        System.out.println(Arrays.toString(arrNotSorted));
    }

    public static int binarySearch(int[] arr, int lIndx, int rIndx, int elem) {
        if (rIndx >= lIndx) {
            int mid = lIndx + (rIndx - lIndx) / 2;

            if (arr[mid] == elem) {
                return mid;
            }

            if (arr[mid] > elem) {
                return binarySearch(arr, lIndx, mid - 1, elem);
            }

            return binarySearch(arr, mid + 1, rIndx, elem);
        }

        return -1;
    }
}
