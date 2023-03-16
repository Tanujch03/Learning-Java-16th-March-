
import java.util.Scanner;
public class switchcase {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit)
        {
            case "apple":
                System.out.println("Red fruit: "+fruit);
                break;
            case "mango":
                System.out.println("King fruit: "+fruit);
            case "Grape":
                System.out.println("green fruit: "+fruit);
            default:
                System.out.println("Enter the correct fruit");
        }

        int day = input.nextInt();
        switch(day)
        {
            case 1  -> System.out.println("Monday");
            case 2  -> System.out.println("Tuesday");
            case 3  -> System.out.println("Wednesday");
            case 4  -> System.out.println("Thursday");
            case 5  -> System.out.println("Friday");
            case 6  -> System.out.println("Saturday");
            case 7  -> System.out.println("Sunday");
            default -> System.out.println("wrong entry");


        }

    }

}
