package com.qa.homeWork5;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// **************Task1****************
        int[] array1 = new int[7];
        int[] array2 = new int[7];
        int[] array3 = new int[7];

        fillArrays(array1,array2,array3);
        System.out.println("Task#1 Arrays before");
        outArrays(array1,array2,array3);
        sumArrays(array1,array2,array3);
        System.out.println("Task#1 Arrays after");
        outArrays(array1,array2,array3);
// **************Task2****************
        int[] array4 = new int[10];
        int[] arrayPositive = {};
        int[] arrayNegative = {};
        initArray(array4);
        System.out.println("Task#2 Arrays before");
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(arrayPositive));
        System.out.println(Arrays.toString(arrayNegative));
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] >= 0) {
                arrayPositive = Arrays.copyOf(arrayPositive,arrayPositive.length + 1);
                arrayPositive[arrayPositive.length - 1] = array4[i];
            } else {
                arrayNegative = Arrays.copyOf(arrayNegative,arrayNegative.length + 1);
                arrayNegative[arrayNegative.length - 1] = array4[i];
            }
        }
        System.out.println("Task#2 Arrays after");
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(arrayPositive));
        System.out.println(Arrays.toString(arrayNegative));
    }
    public static void sumArrays(int[] arr1, int[] arr2, int[] result) {
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
    }
    public static void fillArrays(int[] arr1, int[] arr2, int[] arr3) {
        final int lowlimit = 0;
        final int scale = 10;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)( lowlimit + Math.random() * scale);
            arr2[i] = (int)( lowlimit + Math.random() * scale);
            arr3[i] = 0;
        }
    }
    public static void outArrays (int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            System.out.print(" ");
            System.out.print(arr2[i]);
            System.out.print(" ");
            System.out.println(arr3[i]);
        }
    }
    public static void initArray(int[] arr1){
        final int lowlimit = -33;
        final int scale = 66;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (lowlimit + Math.random() * scale);
        }
    }
}
