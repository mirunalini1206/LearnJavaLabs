package com.learn.labs.ColletionsExample;

/**
 * Created by santoshdandey on 3/7/17.
 */
public class ArrayListClass {

    private String label;
    private String value;

    public ArrayListClass(String label, String value) {
        this.label = label;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayListClass that = (ArrayListClass) o;

        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return getValue().hashCode();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ArrayListClass{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                '}';
    }


}
