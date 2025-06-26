package Day_05_OOPS;
class Animal // parent class(Super class) //single inheritance
{
    void eat()
    {
        System.out.println("This animal eat food ");

    }
}

class Cat extends Animal //child class (sub class)
{
    void Bark()
    {
        System.out.println("The Cat meow");

    }
}

public class SingleInheritance
{
    public static void main(String []args)
    {
        Cat c=new Cat(); //object creation
        c.eat();
        c.Bark();

    }
}





