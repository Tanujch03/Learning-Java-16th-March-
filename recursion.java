public class recursion {
    public static void main(String[] args)
    {
        message(); //function is called

    }
    static void message()
    {
        System.out.println("hello world0");
        message1();
    }
    static void message1()
    {
        System.out.println("hello world1");
        message2();
    }
    static void message2()
    {
        System.out.println("hello world2");
        message3();
    }
    static void message3()
    {
        System.out.println("hello world3");
        message4();
    }
    static void message4()
    {
        System.out.println("hello world4");
        //message1();
    }

}
