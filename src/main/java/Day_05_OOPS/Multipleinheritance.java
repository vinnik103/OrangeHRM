package Day_05_OOPS;

interface PetAnimal
{
    public void eat(); //empty method
}

interface Bird
{
    public void play();
}

class Cow implements PetAnimal,Bird
{

    public void eat()
    {
      System.out.println("pet animal is eating");
    }
    public void play()
    {
        System.out.println("Bird is playing");
    }
}


public class Multipleinheritance
{
    public static void main(String []args)
    {
        Cow c=new Cow();
        c.eat();
        c.play();
    }
}
