
// sum of 1d array
public class sumarray {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,56,5}; //array declaration
        int a = sumfun(arr); //function call
        System.out.println("The sum of the array is: "+ a); //printing the called function.

    }
    static int sumfun(int[] arr) //funtion for calculating the sum of the 1d array.
    {
        int sum =0;
        for(int i = 0;i<arr.length;i+=1)
        {
            sum+=arr[i];
        }
        return sum; // returning the sum value.
    }
}
