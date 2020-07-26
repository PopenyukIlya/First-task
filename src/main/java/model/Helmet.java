package model;

public class Helmet extends Ammunition {

    private String color;

    public Helmet(String name, double price, int weight, String color)  {
        super(name, price, weight);
        this.color = color;
    }

    public Helmet()  {    }

    @Override
    public String toString() {
        return "Helmet{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}