
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(34);
        System.out.println(list.contains(34));
        System.out.println(list.set(0,23));
        System.out.println(list);


    }
}
