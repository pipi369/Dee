package com.pipi;

/**
 * @author sgcx251
 */
public class MainOfListFind {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(optFind(arr, 5));
    }

    public static int optFind(int[] arr, int key) {
        int len = arr.length;
        int tmp = arr[len - 1];

        arr[len - 1] = key;

        int i = 0;
        while (arr[i] != arr[len - 1]) {
            i++;
        }

        arr[len - 1] = tmp;

        if (i == len - 1) {
            return -1;
        } else {
            return i;
        }
    }

    public static int find(int[] arr, int key) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == key) {
                return i;
            }
            i++;
        }
        return -1;
    }

}
