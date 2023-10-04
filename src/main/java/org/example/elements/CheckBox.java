package org.example.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends WebElementPage implements Fillable,Validatable{

    public CheckBox(String xpath){
        super(xpath);
    }

    @Override
    public void fillField(String value, Boolean validated) {
     element.findElement(By.xpath(".//*[text()='"+value+"']")).click();

    }


    @Override
    public void validate(String expected) {
    }
}
