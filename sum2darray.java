
// sum of 2d array
public class sum2darray {

    public static void main(String[] args)
    {
        int[][] arr = {     //array declaration
                {1,2,3,4},
                {23,45},
                {67,78,89}

        };

        int a = arr2dfun(arr);  //function call
        System.out.println("The sum of 2d array "+a); //printing the called function.
    }

    static int arr2dfun(int[][] arr)  //funtion for calculating the sum of the 2d array.
    {
        int sum =0; //initializing the sum = 0.
        for(int row = 0;row<arr.length;row+=1)  //eg : row = 0
                                                //     row = 1
        {
            for(int col=0;col<arr[row].length;col+=1) //eg: col = 0,1,2
                                                      //    row = 0,1,2
            {
                sum+=arr[row][col];
            }
        }
        return sum; // returning the sum value.
    }
}

