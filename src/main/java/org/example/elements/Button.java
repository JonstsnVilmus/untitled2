package org.example.elements;

public class Button extends WebElementPage implements Clickable {
    public Button(String xpath) {
        super(xpath);
    }

    @Override
    public void click() {
        findElement();
        element.click();
    }
}
