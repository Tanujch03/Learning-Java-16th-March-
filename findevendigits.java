// Counts the no of digits and returns whether the number contains even no of digits or not.
public class findevendigits {
    public static void main(String[] args)
    {
        //int[] nums = {12,2,344,45};
        int num = 123;
        int a = evendigits(num); //function call
        boolean c = evenodd(a);  //function call
        System.out.println(c);


    }
    static int evendigits(int num)  // functions which give the count of digits. eg: digit = 1 or 2 or 3
    {
        int count = 0;
        while(num>0)
        {
            count+=1; //3
            num = num/10; //1
        }
        return count; //return the count


    }

    static boolean evenodd(int b) // function tells whether the number is even or not.
    {
        return b % 2 == 0;
    }
}
