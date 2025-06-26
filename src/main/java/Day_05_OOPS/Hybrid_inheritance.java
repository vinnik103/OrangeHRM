package Day_05_OOPS;
interface Animalclass
{
    void eat();

}
class MammalClass
{
    void walk()
    {
        System.out.println("mammal is walking");
    }
}

class Doggy extends MammalClass implements Animalclass
{
    @Override
    public void eat()
    {
        System.out.println("dog is eating");
    }
}


public class Hybrid_inheritance
{
    public static void main(String []args)
    {
        Doggy d=new Doggy();
        d.eat();
        d.walk();

    }

}
