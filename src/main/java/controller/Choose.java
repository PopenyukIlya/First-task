package controller;

import model.Ammunition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import view.View;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Choose extends Ammunition {
    private int q;
    final Logger logger = LogManager.getLogger(Choose.class);

    public Choose() throws FileNotFoundException {
    }

    View view=new View();

    public void chooseAmmunition(List<Ammunition> listOfAmmunition) throws FileNotFoundException {
        logger.trace("Choosing Ammunition");
        logger.debug("List in choose"+listOfAmmunition);
        if(listOfAmmunition.size()==0){logger.error("Clean list of all Ammun");}
        for (int i=0;i<listOfAmmunition.size();i++){
            System.out.println("("+(i+1)+")"+listOfAmmunition.get(i));
        }
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();

        if (index==0||index-1>=listOfAmmunition.size()){
            logger.error( "wrong choice Ammun");
            System.out.println("Wrong choice,try choose again");
            view.mainMenu();
        }
        else {
            q=index-1;
            System.out.println(listOfAmmunition.get(q));
            logger.debug("Choose" +q +"Choosed amun"+listOfAmmunition.get(q));
            try(FileWriter writer = new FileWriter("src\\main\\resources\\Checklist.txt", true))
            {
                // запись всей строки
                String text = (listOfAmmunition.get(q).getName()+" "
                        +listOfAmmunition.get(q).getPrice()+" "+listOfAmmunition.get(q).getWeight()+" "+listOfAmmunition.get(q).getAtribute());
                writer.write(String.valueOf(text));
                // запись по символам
                writer.append(' ');
                writer.append('\n');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public Ammunition chooseAmmunition(List<Ammunition> listOfAmmunition,int q) throws FileNotFoundException {
        return listOfAmmunition.get(q-1);
    }
}