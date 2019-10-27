package model;

import controller.DAO.ReadJacketFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Jacket extends Ammunition {

    public List<Jacket>listOfJackets =new ArrayList<>(4);
    private String levelOfProtection;
    private String path="src\\main\\resources\\Jacket.txt";
    final Logger logger = LogManager.getLogger(Jacket.class);
    public Jacket(String name, double price, int weight,String levelOfProtection) throws FileNotFoundException {
        super(name, price, weight);
        this.levelOfProtection = levelOfProtection;
    }

    public Jacket()  {   }

    public List<Jacket> readJacket() throws FileNotFoundException {
        logger.trace("readJacket");
        ReadJacketFromFile readJacketFromFile=new ReadJacketFromFile();
         List<Jacket> listOfJackets = readJacketFromFile.readAmmunitionFromFile(path);
         logger.debug("List of boots from file"+listOfJackets);
         return listOfJackets;
    }
    public List<Jacket> readJacket(String path) throws FileNotFoundException {
        logger.trace("readJacket for test");
        ReadJacketFromFile readJacketFromFile=new ReadJacketFromFile();
        List<Jacket> listOfJackets = readJacketFromFile.readAmmunitionFromFile(path);
        logger.debug("List of boots from file"+listOfJackets);
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