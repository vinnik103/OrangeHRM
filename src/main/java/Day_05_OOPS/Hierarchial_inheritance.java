package Day_05_OOPS;


class Father
{
    public void fatherProp()
    {
        System.out.println("Home, car, farm");

    }
}
class john extends Father
{
    public void johnProp()
    {
        System.out.println("Extends fathers property");
    }
}

class Mice extends Father
{
    public void miceProp()
    {
        System.out.println("Extends remaining fathers property");

    }
}


public class Hierarchial_inheritance
{
    public static void main(String []args)
    {
        john j=new john();
        j.johnProp();

        Mice m=new Mice();
        m.miceProp();
    }
}
