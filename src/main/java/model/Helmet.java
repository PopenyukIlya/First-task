package model;

import controller.DAO.ReadHelmetsFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class Helmet extends Ammunition {

    public List<Helmet> listOfHelmets =new ArrayList<>(4);
    private String color;
    private String path="src\\main\\resources\\Helmet.txt";
    final Logger logger = LogManager.getLogger(Helmet.class);
    public Helmet(String name, double price, int weight, String color)  {
        super(name, price, weight);
        this.color = color;
    }

    public Helmet()  {         }

    public List<Helmet> readHelmet()  {
        logger.trace("readHelmet");
        ReadHelmetsFromFile readHelmetsFromFile =new ReadHelmetsFromFile();
        List<Helmet> listOfHelmets = readHelmetsFromFile.readAmmunitionFromFile(path);
        logger.debug("List of helmets from file"+listOfHelmets);
        return listOfHelmets;
    }
    public List<Helmet> readHelmet(String path)  {
        logger.trace("readHelmet for test");
        ReadHelmetsFromFile readHelmetsFromFile =new ReadHelmetsFromFile();
        List<Helmet> listOfHelmets = readHelmetsFromFile.readAmmunitionFromFile(path);
        logger.debug("List of helmets from file"+listOfHelmets);
        return listOfHelmets;
    }

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