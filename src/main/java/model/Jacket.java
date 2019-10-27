package model;

import controller.DAO.ReadJacketFromFile;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Jacket extends Ammunition {

    public List<Jacket>listOfJackets =new ArrayList<>(4);
    private String levelOfProtection;
    private String path="src\\main\\resources\\Jacket.txt";
    private ArrayList<String> listLevelOfProtection = new ArrayList<String>();

    public Jacket(String name, double price, int weight,String levelOfProtection) throws FileNotFoundException {
        super(name, price, weight);
        this.levelOfProtection = levelOfProtection;
    }

    public Jacket() throws FileNotFoundException {
    }


    public String getLevelOfProtection() {
        return levelOfProtection;
    }

    public ArrayList<String> initListLevelOfProtection()
    {
        listLevelOfProtection.add("1+");
        listLevelOfProtection.add("2");
        listLevelOfProtection.add("2+");
        listLevelOfProtection.add("3");
        return listLevelOfProtection;
    }


    public List<Jacket> readJacket() throws FileNotFoundException {
        ReadJacketFromFile readJacketFromFile=new ReadJacketFromFile();
         List<Jacket> listOfJackets = readJacketFromFile.readAmmunitionFromFile(path);
         return listOfJackets;
    }


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


