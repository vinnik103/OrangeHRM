package Day_05_OOPS;


class Demoshape
{
    void area(int side)
    {
        System.out.println("calculating area in shape class");
    }

}

class square extends Demoshape

{
    @Override
    void area(int side)
    {
        int result =side * side;
        System.out.println("Area of square: "+result);
    }
}


public class Methodoverexp
{
    public static void main(String []args)
    {
            Demoshape ds=new square();
            ds.area(7);
    }
}
