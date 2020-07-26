package model;

public class Boots extends Ammunition {

    private   String size;

    public Boots(String name, double price, int weight, String size )  {
        super(name, price, weight);
        this.size = size;
    }

    public Boots() {    }

    @Override
    public String toString() {
        return "Boots{" +
                "size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}