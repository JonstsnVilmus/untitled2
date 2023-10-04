package selenium;

import org.example.driver.SingleDriver;
import org.example.elements.WebElementPage;
import org.example.page.Aviasales;
import org.example.step.Steps;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Selenium {
    static WebDriver driver;
    private Map<Object, String> data = new HashMap<>();

    @BeforeClass
    public static void  setUpClass() {
        driver = SingleDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        driver.get("https://www.aviasales.ru");
    }

    @AfterClass
    public static void tearDownClass() {
        driver.quit();
    }
    @Test
    public void loginAviasales() {
      Aviasales aviasales = new Aviasales();
      data.put(aviasales.formOriginInput,"Санкт-Петербург");
      data.put(aviasales.formDestinationInput,"Внуково");
      Steps.fillFields(data);
      data.clear();
      Steps.click(aviasales.passengersButton);
      data.put(aviasales.classCheckBox,"Комфорт");
      data.put(aviasales.adultsCounter,"4");
      data.put(aviasales.childrenCounter,"1");
      Steps.fillFields(data);
    }
}
