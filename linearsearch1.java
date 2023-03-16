
import java.util.Scanner;
import java.util.Arrays;
public class linearsearch1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        linearsearchfunction(45); // calling the functionarray

    }

    public static void linearsearchfunction(int a){
        Scanner in = new Scanner(System.in);
        int cont = 0;
        System.out.println("Enter the size of the array: ");
        int si = in.nextInt();
        int[] arr = new int[si];
        System.out.println("Enter the values of the array: ");
        for(int i=0;i<arr.length;i+=1)
        {
            arr[i] = in.nextInt();
        }

        for(int i=0;i<arr.length;i+=1)
        {
            if(arr[i]==a)
            {
                cont++;
                System.out.println(arr[i]+" contains in array");
                //System.out.println(arr[i]+" contains "+cont+" in the array");

                //break;
            }
            //System.out.println(arr[i]+" contains "+cont+" in the array");
        }

        System.out.println(" contains "+cont+"times in the array");

    }

}
