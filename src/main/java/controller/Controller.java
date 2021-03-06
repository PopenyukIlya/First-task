package controller;

import controller.DAO.ReadAmmunicionFromCheckList;
import controller.Service.AmmunitionService;
import model.Ammunition;
import view.View;
import java.io.FileNotFoundException;

public class Controller extends AmmunitionService {

    public Controller() {
    }

    public void mainMenuController(int choice) throws FileNotFoundException {
        SumAmmunition sumAmmunition=new SumAmmunition();
        ReadAmmunicionFromCheckList checkList=new ReadAmmunicionFromCheckList();
        View view=new View();
        if (choice>=0&&choice<=4){
        switch (choice) {
            case 1:
                view.chooseMenuAmmunition();
                view.mainMenu();
                break;
            case 2:
                System.out.println("Sum="+sumAmmunition.sumAmmunition());
                view.mainMenu();
                break;
            case 3:
                view.sortMenuAmmunition();
                view.mainMenu();
                break;

            case 4:
                view.sortAmmunitionByDiapasonOfPrice();
                view.mainMenu();
                break;
            case 0:
               sumAmmunition.clearCheckList();
                System.exit(0);
                break;
        } }else {
            System.out.println("Incorrect choose, try it again!");
            view.mainMenu();
        }
    }


    public void chooseMenuAmmunitionController(int choice) throws FileNotFoundException {
        View view=new View();
        if (choice>=0&&choice<=4){
        switch (choice) {
            case 1:
                chooseHelmet();
                break;
            case 2:
                chooseJacket();
                break;
            case 3:
                chooseBoots();
                break;
            case 4:
                chooseAmmunition();
                break;
            case 0:
                view.mainMenu();
                break;
        }}else {
            System.out.println("Incorrect choose, try it again!");
                view.mainMenu();
            }
    }

    public void sortMenuAmmunitionController(int choice) throws FileNotFoundException {
        View view=new View();
        if (choice>=0&&choice<=4){
        switch (choice) {
            case 1:
                sortHelmet();
                break;
            case 2:
                sortJacket();
                break;
            case 3:
                sortBoots();
                break;
            case 4:
         sortAmmunition();
                break;
            case 0:
                view.mainMenu();
                break;
        }}else {
            System.out.println("Incorrect choose, try it again!");
            view.mainMenu();
        }
    }
    public void sortAmmunitionByDiapasonOfPriceController(int choice) throws FileNotFoundException {
        View view=new View();
        if (choice>=0&&choice<=4){
        switch (choice) {
            case 1:
                sortByPriceHelmet();
                break;
            case 2:
                sortByPriceJacket();
                break;
            case 3:
                sortByPriceBoots();
                break;
            case 4:
                sortByPriceAmmunition();
                break;
            case 0:
                view.mainMenu();
                break;
        }}else {
            System.out.println("Incorrect choose, try it again!");
            view.mainMenu();
        }
    }
}