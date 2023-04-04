import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayswap {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
        int[] arr = {1,2,3,4,5};
        swap(arr,0,1);
        swap(arr,1,2);



        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}

