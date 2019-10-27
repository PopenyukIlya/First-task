package model;

import controller.DAO.ReadBootsFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Boots extends Ammunition {

    public   List<Boots> listOfBoots=new ArrayList<>(4);
    private   String size;
    private String path="src\\main\\resources\\Boots.txt";
    final Logger logger = LogManager.getLogger(Boots.class);
    public Boots(String name, double price, int weight, String size ) throws FileNotFoundException {
        super(name, price, weight);
        this.size = size;
    }

    public Boots() {    }

    public List<Boots> readBoots() throws FileNotFoundException {
        logger.trace("readBoots");
        ReadBootsFromFile readBootsFromFile=new ReadBootsFromFile();
         List<Boots> listOfBoots = readBootsFromFile.readAmmunitionFromFile(path);
         logger.debug("List of boots from file"+listOfBoots);
         return listOfBoots;
    }

    public List<Boots> readBoots(String path) throws FileNotFoundException {
        logger.trace("readBoots fo test");
        ReadBootsFromFile readBootsFromFile=new ReadBootsFromFile();
        List<Boots> listOfBoots = readBootsFromFile.readAmmunitionFromFile(path);
        logger.debug("List of boots from file"+listOfBoots);
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