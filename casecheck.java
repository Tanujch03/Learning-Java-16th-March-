
import java.util.Scanner;
public class casecheck {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char word  = input.next().trim().charAt(0); // trims the  spaces and gives the
        // char at the specified index position.
        System.out.println(word);

        if (word>='a' && word<='z')
        {
            System.out.println("lower");
        }
        else
        {
            System.out.println("upper");
        }


    }

}
