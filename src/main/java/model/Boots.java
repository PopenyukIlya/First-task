package model;

import controller.DAO.ReadBootsFromFile;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Boots extends Ammunition {

    public   List<Boots> listOfBoots=new ArrayList<>(4);
    public    String size;
    private String path="src\\main\\resources\\Boots.txt";
    private ArrayList<String> listSyze = new ArrayList<String>();

    public Boots(String name, double price, int weight, String size ) throws FileNotFoundException {
        super(name, price, weight);
        this.size = size;
    }

    public Boots() throws FileNotFoundException {
        super();

    }

    public List<Boots> readBoots() throws FileNotFoundException {
        ReadBootsFromFile readBootsFromFile=new ReadBootsFromFile();
         List<Boots> listOfBoots = readBootsFromFile.readAmmunitionFromFile(path);
         return listOfBoots;
    }

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
