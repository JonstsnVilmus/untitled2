package org.example.page;

import org.example.elements.Button;
import org.example.elements.CheckBox;
import org.example.elements.Counter;
import org.example.elements.DateSelect;
import org.example.elements.Input;
import org.openqa.selenium.support.FindBy;



public class Aviasales {


    public Input formOriginInput = new Input("//div[contains(@aria-labelledby,'origin')]//input");

    public Input formDestinationInput = new Input("//div[contains(@aria-labelledby,'destination')]//input");

    public Button passengersButton = new Button("//div[contains(@data-test-id,'passengers')] | //button[contains(@data-test-id,'passengers')]");
    public CheckBox classCheckBox = new CheckBox("//div[@data-test-id= 'ragio-group']");


    public Counter adultsCounter = new Counter("//div[node()='Взрослые']//..//*[contains(@data-test-id, 'passenger')] | //div[node()='Взрослые']//..//*[contains(@class, 'passenger')]");

    public Counter childrenCounter = new Counter("//div[node()='Дети']//..//*[contains(@data-test-id, 'passenger')] | //div[node()='Дети']//..//*[contains(@class, 'passenger')]");



    @FindBy(xpath = "//div[@data-test-id= 'form-submit']")
    public Button submitButton;
}
