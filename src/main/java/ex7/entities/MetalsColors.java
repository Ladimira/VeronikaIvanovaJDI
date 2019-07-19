package ex7.entities;

import java.util.List;

public class MetalsColors {
    List<String> elements, vegetables;
    String metal,color,radioEven,radioOdd;

    public MetalsColors(List<String> elements, List<String> vegetables, String metal, String color, String radioEven, String radioOdd) {
        this.elements = elements;
        this.vegetables = vegetables;
        this.metal = metal;
        this.color = color;
        this.radioEven = radioEven;
        this.radioOdd = radioOdd;
    }

    public List<String> getElements() {
        return elements;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public String getMetal() {
        return metal;
    }

    public String getColor() {
        return color;
    }

    public String getRadioEven() {
        return radioEven;
    }

    public String getRadioOdd() {
        return radioOdd;
    }
}
