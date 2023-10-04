package org.example.elements;

import org.openqa.selenium.WebElement;

public class DateSelect extends WebElementPage implements Fillable,Validatable{

    public DateSelect(String xpath){
        super(xpath);
    }

    @Override
    public void fillField(String value, Boolean validated) {

    }



    @Override
    public void validate(String expected) {
    }
}