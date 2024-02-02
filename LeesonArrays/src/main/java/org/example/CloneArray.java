package org.example;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
//        lineClone();
//        shallowCopy();
//        deepCopy();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i + " " + Arrays.toString(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void lineClone() {
        int[] arr = {1, 2, 3, 4, 5};

        int[] copyArr = arr.clone();

        System.out.println(arr == copyArr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr));

        arr[0] = 100;
        copyArr[4] = 0;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr));
    }

    public static void shallowCopy() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        int[][] arrCopy = arr.clone();

        System.out.println(arr == arrCopy);
//        System.out.println(arr[0] == arrCopy[0]);
//        System.out.println(arr[1] == arrCopy[1]);
//        System.out.println(arr[2] == arrCopy[2]);

        System.out.println("Arr origin");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Arr copy");
        for(int i = 0; i < arrCopy.length; i++) {
            for (int j = 0; j < arrCopy[i].length; j++) {
                System.out.print(arrCopy[i][j] + "\t");
            }
            System.out.println();
        }

        arr[0][0] = 100;
        arrCopy[3][2] = 0;

        System.out.println("----------------------------");
        System.out.println("Arr origin");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Arr copy");
        for(int i = 0; i < arrCopy.length; i++) {
            for (int j = 0; j < arrCopy[i].length; j++) {
                System.out.print(arrCopy[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void deepCopy() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        int[][] arrCopy = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Arr copy");
        for(int i = 0; i < arrCopy.length; i++) {
            for (int j = 0; j < arrCopy[i].length; j++) {
                System.out.print(arrCopy[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrCopy[i][j] = arr[i][j];
            }
        }

        System.out.println("------------------------------");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Arr copy");
        for(int i = 0; i < arrCopy.length; i++) {
            for (int j = 0; j < arrCopy[i].length; j++) {
                System.out.print(arrCopy[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        System.out.println(arr[0] == arrCopy[0]);
        System.out.println(arr[1] == arrCopy[1]);
        System.out.println(arr[2] == arrCopy[2]);
        System.out.println("-----------------------------");
        arr[0][0] = 100;
        arrCopy[3][2] = 0;

        System.out.println("Arr origin");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Arr copy");
        for(int i = 0; i < arrCopy.length; i++) {
            for (int j = 0; j < arrCopy[i].length; j++) {
                System.out.print(arrCopy[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
