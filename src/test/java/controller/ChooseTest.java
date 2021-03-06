package controller;

import controller.DAO.ReadAmmunicionFromCheckList;
import model.Ammunition;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ChooseTest {
    List<Ammunition> listOfAmmunition1 = new ArrayList<Ammunition>(4);
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);
    ReadAmmunicionFromCheckList fromCheckList=new ReadAmmunicionFromCheckList();
    Ammunition ammunition=new Ammunition( "hcvwq23",520.0, 2250, "green");
    Ammunition ammunition1=new Ammunition("jvwber1r23",750.0,1200,"3+" );
    String path="src\\test\\resources\\CheckList.txt";

    public ChooseTest() throws FileNotFoundException {
    }

    @Test
    public void chooseAmmunition() throws FileNotFoundException {
        Choose choose=new Choose();
        listOfAmmunition=fromCheckList.readAmmunitionFromFile(path);
        String actual= String.valueOf(choose.chooseAmmunition(listOfAmmunition,1,"src\\test\\resources\\clear.txt"));
        String expected=String.valueOf(ammunition);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void chooseAmmunitionWithRead() throws FileNotFoundException {
        listOfAmmunition1.add(ammunition);
        listOfAmmunition=fromCheckList.readAmmunitionFromFile("src\\test\\resources\\clear.txt");
        String actual= String.valueOf(listOfAmmunition);
        String expected=String.valueOf(listOfAmmunition1);
        Assert.assertEquals(expected,actual);
    }
}
