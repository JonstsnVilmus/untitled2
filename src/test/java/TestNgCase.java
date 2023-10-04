import org.example.DataClass;
import org.example.DemoProvider;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgCase {
    private DataClass dataClass;
    public static int value;

    public TestNgCase() {
        this.value = 10;
    }

    @BeforeClass
    public void setupValue() {
        dataClass = new DataClass(value);
    }

    @AfterClass
    public void defaultValue() {
        dataClass.setNumber(0);
    }

    @Test(dataProvider = "randomNumber", groups = {"start"})
    public void isNotZero(Integer number) {
        Assert.assertTrue(dataClass.getNumber() != 0);
    }

    @Test(dependsOnMethods = {"isNotZero"}, dataProvider = "randomNumber")
    public void isCorrectValue(Integer number) {
        Assert.assertEquals(dataClass.getNumber(), value);
    }

    @Test(dependsOnMethods = {"isNotZero"}, dataProvider = "randomNumber")
    public void assertOpposite(Integer number) {
        Assert.assertEquals(dataClass.getOpposite(), 1. / value, 1e-12);
    }


    @DataProvider(name = "randomNumber")
    public Object[][] randomNumberFeed() {
        int tests = 10;
        Object[][] data = new Object[tests][1];
        DemoProvider rnd = new DemoProvider();
        for (int i = 0; i < tests; i++) {
            data[i][0] = rnd.getRandomNumber();
        }
        return data;
    }
}
