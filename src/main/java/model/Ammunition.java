package model;

import controller.Choose;
import controller.SortAmmunition;
import controller.SortAmmunitionByDiapasonOfPrice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Ammunition  {
    public String name;
    public double price;
    public int weight;
    public String atribute;

    private List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);
    final Logger logger = LogManager.getLogger(Ammunition.class);

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


    private List<Ammunition> initListOfAmmunition() throws FileNotFoundException {
logger.trace("Initing list of Ammunition");
        Boots boots=new Boots();
        Jacket jacket=new Jacket();
        Helmet helmet =new Helmet();
        listOfAmmunition.addAll(boots.readBoots());
        listOfAmmunition.addAll(helmet.readHelmet());
        listOfAmmunition.addAll(jacket.readJacket());
        logger.debug("list Of Ammun" + listOfAmmunition);
if(listOfAmmunition.size()==0){logger.error("Clear list of all Ammun");}
        return listOfAmmunition;
    }
    public void chooseAmmunition(List<Ammunition> listOfAmmunition) throws FileNotFoundException {
        logger.trace("Choose Ammun by list");
        logger.debug("Choose by list Of Ammun" + listOfAmmunition);
        Choose choose=new Choose();
        choose.chooseAmmunition(listOfAmmunition);
    }
    public void sortAmmunition() throws FileNotFoundException {
        logger.trace("sortAmmunition");
        SortAmmunition sort=new SortAmmunition();
        chooseAmmunition(sort.sortAmmunation(initListOfAmmunition()));
    }
    public  void chooseAmmunition() throws FileNotFoundException {
        logger.trace("Choose Boots by list of all Ammun");
        chooseAmmunition(initListOfAmmunition());
    }
    public void chooseBoots() throws FileNotFoundException {
        logger.trace("Choose Boots by list from file");
        Boots boots=new Boots();
        listOfAmmunition.addAll(boots.readBoots());
        logger.debug("Choose by list Of Boots from file" + listOfAmmunition);
        chooseAmmunition(listOfAmmunition);
    }
    public void chooseJacket() throws FileNotFoundException {
        logger.trace("Choose Jacket by list from file");
      Jacket jacket=new Jacket();
        listOfAmmunition.addAll(jacket.readJacket());
        logger.debug("Choose by list Of Jacket from file" + listOfAmmunition);
        chooseAmmunition(listOfAmmunition);
    }
    public void chooseHelmet() throws FileNotFoundException {
        logger.trace("Choose Hemlet by list from file");
        Helmet helmet = new Helmet();
        listOfAmmunition.addAll(helmet.readHelmet());
        logger.debug("Choose by list Of Helmet from file" + listOfAmmunition);
        chooseAmmunition(listOfAmmunition);
    }
    public void sortBoots() throws FileNotFoundException {
        logger.trace("sort By weight Boots");
        Boots boots=new Boots();
        SortAmmunition sortAmmunition =new SortAmmunition();
        listOfAmmunition.addAll(boots.readBoots());
        logger.debug("Sort by weight by list Of Boots from file" + listOfAmmunition);
        chooseAmmunition(sortAmmunition.sortAmmunation(listOfAmmunition));
    }
    public void sortJacket() throws FileNotFoundException {
        logger.trace("sort By weight jackets");
        Jacket jacket=new Jacket();
        SortAmmunition sortAmmunition =new SortAmmunition();
        listOfAmmunition.addAll(jacket.readJacket());
        chooseAmmunition(sortAmmunition.sortAmmunation(listOfAmmunition));
    }
    public void sortHelmet() throws FileNotFoundException {
        logger.trace("sort By weight hemlets");
        Helmet helmet = new Helmet();
        SortAmmunition sortAmmunition =new SortAmmunition();
        listOfAmmunition.addAll(helmet.readHelmet());
        logger.debug("Sort by weight by list Of Helmets from file" + listOfAmmunition);
        chooseAmmunition(sortAmmunition.sortAmmunation(listOfAmmunition));
    }
    public void sortByPriceAmmunition() throws FileNotFoundException {
        logger.trace("sort By diapasone of Price all ammun");
        SortAmmunitionByDiapasonOfPrice sortAmmunation=new SortAmmunitionByDiapasonOfPrice();
        logger.debug("Sort by diapason of price by list all Ammun from file" + listOfAmmunition);
       chooseAmmunition(sortAmmunation.sortAmmunitionByDiapasonOfPrice(initListOfAmmunition()));
    }
    public void sortByPriceHelmet() throws FileNotFoundException {
        logger.trace("sort By diapasone of Price Hemlets");
        SortAmmunitionByDiapasonOfPrice sortAmmunation=new SortAmmunitionByDiapasonOfPrice();
        Helmet helmet = new Helmet();
        listOfAmmunition.addAll(helmet.readHelmet());
        logger.debug("Sort by diapason of price by list Of Helmet from file" + listOfAmmunition);
        chooseAmmunition(sortAmmunation.sortAmmunitionByDiapasonOfPrice(listOfAmmunition));
    }
    public void sortByPriceJacket() throws FileNotFoundException {
        logger.trace("sort By diapasone of Price Jackets");
        SortAmmunitionByDiapasonOfPrice sortAmmunation=new SortAmmunitionByDiapasonOfPrice();
        Jacket jacket=new Jacket();
        listOfAmmunition.addAll(jacket.readJacket());
        logger.debug("Sort by diapason of price by list Of Jackets from file" + listOfAmmunition);
        chooseAmmunition(sortAmmunation.sortAmmunitionByDiapasonOfPrice(listOfAmmunition));
    }
    public void sortByPriceBoots() throws FileNotFoundException {
        logger.trace("sort By diapasone of Price Boots");
        Boots boots=new Boots();
        SortAmmunitionByDiapasonOfPrice sortAmmunation=new SortAmmunitionByDiapasonOfPrice();
        listOfAmmunition.addAll(boots.readBoots());
        logger.debug("Sort by diapason of price by list Of Boots from file" + listOfAmmunition);
        chooseAmmunition(sortAmmunation.sortAmmunitionByDiapasonOfPrice(listOfAmmunition));
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
