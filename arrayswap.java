//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayswap {
    public arrayswap() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        new ArrayList();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
