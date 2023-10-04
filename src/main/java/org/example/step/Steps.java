package org.example.step;

import org.example.elements.Clickable;
import org.example.elements.WebElementPage;
import org.example.fields.FieldUtils;

import java.util.Map;

public class Steps {
    public static <T extends WebElementPage> void fillFields(final Map<Object, String> data) {
        FieldUtils.fillFields(data, true);
    }
    public static <T extends WebElementPage> void click(final T element) {
        ((Clickable)element).click();
    }
}
