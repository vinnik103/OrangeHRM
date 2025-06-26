package Day_05_OOPS;

import java.awt.*;

abstract class shape
{
    abstract void draw(); // Abstract method
}

class Rectangle extends shape
{

    @Override
    void draw() { //non abstract method
        System.out.println("Drawing rectangle ");
    }
}

class circle extends shape
{
    @Override
    void draw() { // non abstract method
        System.out.println("drawing circle");
    }
}



public class Demo_abstraction
{
    public static void main(String []args)
    {
        shape s =new Rectangle();
        s.draw();

        shape s1=new circle();
        s1.draw();
    }
}
