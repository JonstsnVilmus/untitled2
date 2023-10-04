package org.example.fields;

import org.example.elements.Fillable;
import org.example.elements.WebElementPage;

import java.util.Map;

public class FieldUtils {
    public static <T extends WebElementPage> void fillFields(final Map<Object, String> data, final Boolean validated) {
        for (final Map.Entry<Object, String> dataEntry : data.entrySet())
            FieldUtils.fillField(dataEntry.getKey(), dataEntry.getValue(), validated);
    }

    public static <T extends WebElementPage> void fillField(Object element, final String value, final Boolean validated)
    {
        if (element instanceof Fillable) {
            ((WebElementPage)element).findElement();
            ((Fillable) element).fillField(value, validated);
        } else {
            throw new RuntimeException(String.format("Field %s is not of type Fillable", element));
        }
    }
}
