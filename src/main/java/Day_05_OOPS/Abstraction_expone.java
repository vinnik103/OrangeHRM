package Day_05_OOPS;

abstract class Bank //super class
{
    abstract int getInterest(); //abstract method
    void welcomeMsg()
    {
        System.out.println("welcome to bank ");
    }
}

class SBIBank extends Bank //subclass
{
    int getInterest()
    {
        return 7; //Sbi provide 7% interest
    }
}

class HDFC extends Bank
{
    @Override
    int getInterest() {
        return 10;  //hdfc provides 10 percent interest
    }
}


public class Abstraction_expone
{
    public static void main(String []args)
    {
        Bank b;

        b=new SBIBank();
        b.welcomeMsg();
        System.out.println("Sbi interest Rate: "+b.getInterest() +"%");


        b=new HDFC();
        b.welcomeMsg();
        System.out.println("HDFC interest Rate: "+b.getInterest() +"%");

    }
}

