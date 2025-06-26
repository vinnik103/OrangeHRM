package Day_05_OOPS;
class RedCar
{
    String colour;
    int speed;

    void carProp()
    {
        System.out.println("car is starting");
    }
}

public class DemoCar
{
    public static void main(String []args)
    {

        RedCar rc =new RedCar();
        rc.carProp();

        rc.colour="red";
        rc.speed= 120;

        System.out.println("colour or car is:"+rc.colour);
        System.out.println("speed of car is:"+rc.speed);

    }
}
