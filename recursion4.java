// linear search through recursion.

public class recursion4 {
    public static void main(String[] args)
    {
        int[] arr = {3,2,1,18,9};
        System.out.println(findindex(arr,18,0));
    }
    static int findindex(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index; // returns the index of the target value.
        }
        else
        {
            return findindex(arr,target,index+1);
        }



    }
}
