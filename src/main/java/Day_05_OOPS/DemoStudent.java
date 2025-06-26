package Day_05_OOPS;
class StudentInfo
{
    String name;
    int age;

    void  displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("age: "+age);

    }
}

public class DemoStudent
{
    public static void main(String []args)
    {
        StudentInfo si = new StudentInfo(); // creating objects f
        si.name="Vinayak";
        si.age=22;

        si.displayInfo(); // calling method
    }
}
