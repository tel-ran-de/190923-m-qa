package org.example;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        int[][] arrInt2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        for(int i = 0; i < arrInt2d.length; i++) {
            for (int j = 0; j < arrInt2d[i].length; j++) {
                System.out.print(arrInt2d[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
