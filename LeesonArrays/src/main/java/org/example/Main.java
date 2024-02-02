package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrIntNew = new int[10];
        String[] strIntNew = new String[10];
        int[] arrIntInit = {1, 2, 10, -1, 0, -200};
        boolean[] boolArr = new boolean[5];

//        Int array

//        System.out.println("Before init:");
//        System.out.println(Arrays.toString(arrIntNew));
//        System.out.println("arrIntNew.length = " + arrIntNew.length);
////        System.out.println(Arrays.toString(arrIntInit));
//        System.out.println("arrIntInit.length = " + arrIntInit.length);
//        arrIntNew[10] = 100;
//        arrIntInit[11] = 1000;

//        for(int i = 0; i < arrIntNew.length; i++) {
//            arrIntNew[i] = i + 1;
//        }
//        System.out.println("After init:");
//        System.out.println(Arrays.toString(arrIntNew));
//        System.out.println("arrIntNew.length = " + arrIntNew.length);

//        String array
//        System.out.println(Arrays.toString(strIntNew));
//        System.out.println("strIntNew.length = " + strIntNew.length);
//
//        for(int i = 0; i < strIntNew.length; i++) {
//            strIntNew[i] = "Hello";
//        }
//        System.out.println(Arrays.toString(strIntNew));
//        System.out.println("strIntNew.length = " + strIntNew.length);

//        Boolean array
        System.out.println(Arrays.toString(boolArr));
        System.out.println("boolArr.length = " + boolArr.length);

        for(int i = 0; i < boolArr.length; i++) {
//            if (i % 2 == 0) {
//                boolArr[i] = true;
//            } else {
//                boolArr[i] = false;
//            }
            boolArr[i] = i % 2 != 0;
        }
        System.out.println(Arrays.toString(boolArr));
        System.out.println("boolArr.length = " + boolArr.length);

    }
}