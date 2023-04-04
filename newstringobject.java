import java.util.Scanner;

// Program to create to string objects(name1 and name2) and compare(==) whether we get it or not.
public class newstringobject {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name1 = new String("Tanuj"); //this is new object.
        String name2 = new String("Tanuj"); //this is new object.
        System.out.println(name1==name2);


        System.out.printf("hi this is %s",in.next());

    }
}
