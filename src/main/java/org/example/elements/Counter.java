package org.example.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.function.BooleanSupplier;

public class Counter extends WebElementPage implements Fillable,Validatable{

    public Counter(String xpath){
        super(xpath);
    }

    @Override//..//div[last()]
    public void fillField(String value, Boolean validated) {
        BooleanSupplier waitSendKeyDown = () -> {
            findElement();
         if(Integer.parseInt(element.getText())>Integer.parseInt(value)){
             element.findElement(By.xpath(".//..//div[1]"));
             return false;
         } else if (Integer.parseInt(element.getText())<Integer.parseInt(value)){
             element.findElement(By.xpath(".//..//div[last()]")).click();
             return false;
         }
            return true;
        };
        for (int i = 0; i < 20; i++) {
            if(waitSendKeyDown.getAsBoolean()){
                return;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


    @Override
    public void validate(String expected) {

    }
}