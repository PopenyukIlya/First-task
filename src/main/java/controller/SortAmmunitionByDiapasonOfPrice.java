package controller;

import model.Ammunition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import view.View;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortAmmunitionByDiapasonOfPrice extends Ammunition {
    final Logger logger = LogManager.getLogger(SortAmmunitionByDiapasonOfPrice.class);
    private int bottomLimit;
    private int topLimit;

    public SortAmmunitionByDiapasonOfPrice() throws FileNotFoundException {
    }

    public List<Ammunition> sortAmmunitionByDiapasonOfPrice(List<Ammunition> listOfAmmunition) throws FileNotFoundException {
        logger.trace("SortAmmunitionByDiapasonOfPrice");
        logger.debug("Sorted list by price= "+listOfAmmunition);
        if(listOfAmmunition.size()==0){logger.error("Clean list of all Ammun");}
        View view=new View();
        List<Ammunition> result = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("min");
         bottomLimit=scanner.nextInt();
        logger.debug("Min limit= "+bottomLimit);
        System.out.println("max");
         topLimit=scanner.nextInt();
        logger.debug("Max limit= "+topLimit);
        for (Ammunition ammunition : listOfAmmunition) {
            if (ammunition.getPrice() >= bottomLimit && ammunition.getPrice() <= topLimit) {
                result.add(ammunition);
            }
        }
        if (result.size()==0){
    System.out.println("No ammunition in this diapason of prices!");
    view.mainMenu();
}logger.debug("What in this diapasone= "+result);
        return result;
    }
    public List<Ammunition> sortAmmunitionByDiapasonOfPrice(List<Ammunition> listOfAmmunition,int bottomLimit,int topLimit ) throws FileNotFoundException {
        List<Ammunition> result = new ArrayList<>();
        for (Ammunition ammunition : listOfAmmunition) {
            if (ammunition.getPrice() >= bottomLimit && ammunition.getPrice() <= topLimit) {
                result.add(ammunition);
            }
        }

        if (result.size()==0){
            System.out.println("No ammunition in this diapason of prices!");
        }
        return result;
    }
}
