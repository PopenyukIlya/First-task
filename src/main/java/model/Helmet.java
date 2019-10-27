package model;

import controller.DAO.ReadHelmetsFromFile;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Helmet extends Ammunition {

    public List<Helmet> listOfHelmets =new ArrayList<>(4);
    private ArrayList<String> listColor = new ArrayList<String>();
    private String color;
    private String path="src\\main\\resources\\Hemlet.txt";

    public Helmet(String name, double price, int weight, String color) throws FileNotFoundException {
        super(name, price, weight);
        this.color = color;
    }

    public Helmet() throws FileNotFoundException {    }

    public List<Helmet> readHemlet() throws FileNotFoundException {
        ReadHelmetsFromFile readHelmetsFromFile =new ReadHelmetsFromFile();
        List<Helmet> listOfHelmets = readHelmetsFromFile.readAmmunitionFromFile(path);
        return listOfHelmets;
    }

    @Override
    public String toString() {
        return "Hemlet{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}