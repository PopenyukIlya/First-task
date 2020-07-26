package model;

public class Ammunition  {
    public String name;
    public double price;
    public int weight;
    public String atribute;

    public Ammunition(String name, double price, int weight, String atribute) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.atribute = atribute;
    }

    public Ammunition() { }

    public Ammunition(String name, double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public  String getName() {   return name; }
    public double getPrice() {  return price;   }
    public int getWeight() { return weight;  }
    public String getAtribute() {
        return atribute;
    }

    @Override
    public String toString() {
        return "Ammunition{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", atribute='" + atribute + '\'' +
                '}';
    }

   }
