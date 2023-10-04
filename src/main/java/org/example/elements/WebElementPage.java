package org.example.elements;

import org.example.driver.SingleDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementPage {
    WebElement element;
    String xpath;

    public WebElementPage(String xpath){
        this.xpath=xpath;
    }

    public void findElement(){
        element = SingleDriver.getDriver().findElement(By.xpath(xpath));
    }
}
