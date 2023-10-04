package org.example.elements;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.function.BooleanSupplier;

public class Input extends WebElementPage implements Fillable,Validatable{
    public Input(String xpath){
        super(xpath);
    }

    @Override
    public void fillField(String value, Boolean validated) {
        //для полей aviasales не c первого раза возможно очистить поле
        BooleanSupplier waitSendKeyDown = () -> {
            element.sendKeys("");
            element.sendKeys(value);
            return isExpected(value);
        };
        for (int i = 0; i < 5; i++) {
            if(waitSendKeyDown.getAsBoolean()){
                return;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(validated){
            validate(value);
        }
    }


    @Override
    public void validate(String expected) {
        Assert.assertTrue(isExpected(expected));
    }
    public boolean isExpected(String expected) {
        findElement();
       return element.getAttribute("value").equals(expected);
    }
}
