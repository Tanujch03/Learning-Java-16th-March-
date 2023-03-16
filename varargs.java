import java.util.Arrays;

public class varargs {
    public static void main(String[] args)
    {
        fun(1,2,3,4,5,5,65,4,4);

    }

    static void multiple(int a,int b,String ...v)
    {

    }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
