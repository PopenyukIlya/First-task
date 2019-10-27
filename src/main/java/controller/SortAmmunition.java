package controller;

import model.Ammunition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortAmmunition extends Ammunition {
    final Logger logger = LogManager.getLogger(SortAmmunition.class);
    public SortAmmunition() {
    }

    public List<Ammunition> sortAmmunation(List<Ammunition> listOfAmmunition)  {
        logger.trace("Sorting Ammunition");
        if(listOfAmmunition.size()==0){logger.error("Clean list of all Ammun");}
        Collections.sort(listOfAmmunition, new Comparator<Ammunition>() {
                    public int compare(Ammunition o1, Ammunition o2) {
                        if (o1.getWeight() == o2.getWeight())
                            return 0;
                        return o1.getWeight() < o2.getWeight() ? -1 : 1;
                    }
                }
        );
        logger.debug("Sorted list= "+listOfAmmunition);
        return listOfAmmunition;
    }
}
