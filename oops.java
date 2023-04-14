public class oops {
    public static void main(String[] args)
    {

        Student tanuj = new Student(12,"tanuj",34);
        tanuj.greetings();
        System.out.println(tanuj.rollno);
        System.out.println(tanuj.names);
        System.out.println(tanuj.marks);
        tanuj.changename("harish");
    }


}

class Student  // created class names --> Student
{
    int rollno  = 45;
    String names = "mike";
    double marks = 34.3445;

    void greetings()
    {
        System.out.println("NAme is "+this.names);
    }

    void changename(String changname)
    {
        names = changname;
    }

    Student()
    {
        this.rollno = 234;
        this.names = "hike";
        this.marks = 43.5;
    }

    Student(int rollno,String names,double marks)
    {
        this.rollno = rollno;
        this.names = names;
        this.marks = marks;
    }
}
