import java.util.Arrays;

public class search2darray {
    public static void main(String[] args)
    {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {23,34}
        };
        int target = 23;

        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i+=1)
        {
            for(int j=0;j<arr[i].length;j+=1)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
