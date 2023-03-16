public class minarray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(min(arr));
        System.out.println(max(arr));

    }
    static int min(int[] arr)
    {
        int ans = arr[0];//1

        for(int i=1;i<arr.length;i+=1)
        {
            if(arr[i]<ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int max(int[] arr)
    {
        int ans1 = arr[0];
        for(int i = 1;i<arr.length;i+=1)
        {
            if(arr[i]>ans1)
            {
                ans1 = arr[i];
            }
        }
        return ans1;
    }
}
