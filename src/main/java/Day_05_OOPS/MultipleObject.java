package Day_05_OOPS;

class Dog
{
    String name;
    void bark()
    {
        System.out.println(name+" is barking!");

    }
}
public class MultipleObject
{
    public static void main(String []args)
    {
        Dog d =new Dog();
        d.name = "doberman";
        d.bark();

        Dog d2=new Dog();
        d2.name = "labrador";
        d2.bark();

        Dog d3=new Dog();
        d3.name = "rotwiller";
        d3.bark();
    }
}
