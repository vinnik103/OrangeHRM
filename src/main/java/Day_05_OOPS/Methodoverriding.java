package Day_05_OOPS;
class DemoAnimal
{
    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class  DemoDog extends DemoAnimal
{
    @Override
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

class DemoCat extends DemoAnimal
{
    @Override
    public void sound()
    {
        System.out.println("cat is meows");
    }
}



public class Methodoverriding
{
    public static void main(String []args)
    {
        DemoAnimal daCat =new DemoCat(); //reference variable
        DemoAnimal daDog =new DemoDog(); //reference variable

        daDog.sound();
        daCat.sound();

    }
}
