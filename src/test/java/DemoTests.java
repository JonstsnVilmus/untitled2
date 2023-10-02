import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTests {
@Test()

public void isEven(){
    int number = 10;
    Assert.assertTrue(number%2==0);
}
}
