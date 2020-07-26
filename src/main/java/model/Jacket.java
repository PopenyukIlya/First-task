package model;

public class Jacket extends Ammunition {

    private String levelOfProtection;

    public Jacket(String name, double price, int weight,String levelOfProtection)  {
        super(name, price, weight);
        this.levelOfProtection = levelOfProtection;
    }

    public Jacket()  {   }

    @Override
    public String toString() {
        return "Jacket{" +
                "levelOfProtection='" + levelOfProtection + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}