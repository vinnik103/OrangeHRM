import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demoassertion

{
    @Test
    void testTitile()
    {
        String exp_title = "opencart";
        String act_title = "openmart";

        /*if(exp_title.equals(act_title)) //use equals method to check
        {
            System.out.println("Test passed");

        }
        else
        {
            System.out.println("Test fail");
        } */


            // u can use the method


        if(exp_title.equals(act_title))
        {
            System.out.println("Test passed");
            Assert.assertTrue(true);
        }else
        {
            System.out.println("Test false");
            Assert.assertTrue(false);

        }

        Assert.assertEquals(act_title,exp_title);


    }


}
