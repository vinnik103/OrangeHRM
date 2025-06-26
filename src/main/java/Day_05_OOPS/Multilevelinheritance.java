package Day_05_OOPS;
class Birds //parent class
{
    public void eat()
    {
        System.out.println("Birds are eating");
    }
}

class Mammal extends Birds //child class
{
    public void walk()
    {
        System.out.println("Mammal is walking");
    }
}

class  Tiger extends Mammal //child class
{
    public void Roar()
    {
        System.out.println("Tiger is hunting");
    }
}

class Rat extends Tiger //child class
{
    public void jump()
    {
        System.out.println("Rat is jumping");
    }
}


public class Multilevelinheritance
{
    public static void main(String []args)
    {
        Rat r=new Rat();
        r.eat();
        r.walk();
        r.Roar();
        r.jump();
    }
}


