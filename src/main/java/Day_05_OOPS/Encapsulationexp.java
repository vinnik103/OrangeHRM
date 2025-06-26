package Day_05_OOPS;

 class StudentD
{
      private String name;

  public  void setName(String newName)
  {
     name="john";
  }

  public String getName()
  {
      return name;
  }
}

public class Encapsulationexp
{
    public static void main(String []args)
    {
            StudentD st=new StudentD();

            st.setName("john");
            st.getName();
            System.out.println(st.getName());
    }
}
