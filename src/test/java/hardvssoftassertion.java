import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardvssoftassertion
{

    @Test
    void testHardAssertion()
    {
       /* System.out.println("testing..");


        System.out.println("automation testing...");


        Assert.assertEquals(1,2);

        System.out.println("automation testing..");


        System.out.println("testing...");
*/

    }

    @Test
    void testSoftAssertion()
    {
        System.out.println("testing..");

        System.out.println("automation testing...");

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(1,2);

        System.out.println("automation testing..");

        System.out.println("testing...");

        sa.assertAll(); //mandatory
    }

}
