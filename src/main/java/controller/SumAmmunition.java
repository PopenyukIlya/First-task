package controller;

import controller.DAO.ReadAmmunicionFromCheckList;
import model.Ammunition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;


public  class SumAmmunition extends ReadAmmunicionFromCheckList {
    private String path="src\\main\\resources\\Checklist.txt";
    private double sum=0;

    final Logger logger = LogManager.getLogger(SumAmmunition.class);

    public SumAmmunition()  {
        super();
    }

    public double sumAmmunition() throws FileNotFoundException {
        logger.trace("Read Ammun from checkList");
       return sumAmmunation(readAmmunitionFromFile(path));
    }

    public double sumAmmunation(List<Ammunition> listOfAmmunition) throws FileNotFoundException {
        logger.debug("Check list"+listOfAmmunition);
         sum=0;
        System.out.println("NAME|PRICE");
        for (int i=0;i<listOfAmmunition.size();i++){
            System.out.println(listOfAmmunition.get(i).getName()+"|"+listOfAmmunition.get(i).getPrice());
           sum=sum+listOfAmmunition.get(i).getPrice();
        }
        logger.debug("Sum"+sum);
        System.out.println("______________");
        return sum;
    }

    public void clearCheckList() throws FileNotFoundException {
        logger.debug("clear Check List");
        PrintWriter pw = new PrintWriter(path);
        pw.close();
    }

    public void clearCheckList(String path) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(path);
        pw.close();
    }
}
