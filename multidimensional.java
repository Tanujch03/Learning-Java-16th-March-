
import java.util.Scanner;
public class multidimensional {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }


        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arr1 = {
                {1,2,3,4},
                {1,2,3},
                {1,2}
        };
        int[][] arrone = {
                {1,2,3,4},
                {1,2,3},
                {1,2}
        };
        for(int row = 0;row<arrone.length;row+=1)
        {
            for(int col=0;col<arrone[row].length;col+=1)
            {
                System.out.print(arrone[row][col]+" ");

            }
            System.out.println();
        }

    }



}
