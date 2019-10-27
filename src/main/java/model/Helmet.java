package model;

import controller.DAO.ReadHelmetsFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Helmet extends Ammunition {

    public List<Helmet> listOfHelmets =new ArrayList<>(4);
    private String color;
    private String path="src\\main\\resources\\Hemlet.txt";
    final Logger logger = LogManager.getLogger(Helmet.class);
    public Helmet(String name, double price, int weight, String color) throws FileNotFoundException {
        super(name, price, weight);
        this.color = color;
    }

    public Helmet()  {         }

    public List<Helmet> readHemlet() throws FileNotFoundException {
        logger.trace("readHemlet");
        ReadHelmetsFromFile readHelmetsFromFile =new ReadHelmetsFromFile();
        List<Helmet> listOfHelmets = readHelmetsFromFile.readAmmunitionFromFile(path);
        logger.debug("List of helmets from file"+listOfHelmets);
        return listOfHelmets;
    }
    public List<Helmet> readHemlet(String path) throws FileNotFoundException {
        logger.trace("readHemlet for test");
        ReadHelmetsFromFile readHelmetsFromFile =new ReadHelmetsFromFile();
        List<Helmet> listOfHelmets = readHelmetsFromFile.readAmmunitionFromFile(path);
        logger.debug("List of helmets from file"+listOfHelmets);
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