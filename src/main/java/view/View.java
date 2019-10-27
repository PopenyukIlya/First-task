package view;

import controller.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class View extends Controller {
    public Scanner scanner = new Scanner(System.in);
    private int choice;
    Logger logger = LogManager.getLogger(View.class);


    public View() throws FileNotFoundException {
    }

    public void preMainMenu() throws FileNotFoundException {
        logger.debug("Start app");
        System.out.println("Hi.Can i help you?");
        mainMenu();
    }

    public void mainMenu() throws FileNotFoundException {
        System.out.println("1. Choose ammunition");
        System.out.println("2. Sum");
        System.out.println("3. Sort by weight");
        System.out.println("4. Find ammunition by price");
        System.out.println("0. Quit");
        choice=scanner.nextInt();
        mainMenuController(choice);
    }

    public void chooseMenuAmmunition() throws FileNotFoundException {
        System.out.println("1. Helmet");
        System.out.println("2. Jacket");
        System.out.println("3. Boots");
        System.out.println("4. All ammunition");
        System.out.println("0. Quit");
        choice=scanner.nextInt();
        chooseMenuAmmunitionController(choice);
    }

    public  void sortMenuAmmunition() throws FileNotFoundException {
        System.out.println("1. Helmet");
        System.out.println("2. Jacket");
        System.out.println("3. Boots");
        System.out.println("4. All ammunition");
        System.out.println("0. Quit");
        choice=scanner.nextInt();
        sortMenuAmmunitionController(choice);
    }

    public void sortAmmunitionByDiapasonOfPrice() throws FileNotFoundException {
        System.out.println("1. Helmet");
        System.out.println("2. Jacket");
        System.out.println("3. Boots");
        System.out.println("4. All ammunition");
        System.out.println("0. Quit");
        choice=scanner.nextInt();
       sortAmmunitionByDiapasonOfPriceController(choice);
    }
}