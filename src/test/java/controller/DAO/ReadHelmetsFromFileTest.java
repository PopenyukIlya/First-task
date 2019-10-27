package controller.DAO;

import model.Ammunition;
import model.Boots;
import model.Helmet;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReadHelmetsFromFileTest {
    List<Helmet> listOfHelmets1 = new ArrayList<Helmet>(4);
    List<Helmet> listOfHelmets = new ArrayList<Helmet>(4);

    ReadAmmunicionFromCheckList fromCheckList=new ReadAmmunicionFromCheckList();
    Helmet ammunition=new Helmet( "hcvwq23",520.0, 2250, "green");
    Helmet ammunition1=new Helmet("jvwber1r23",750.0,1200,"3+");
    String path="src\\test\\resources\\Checklist.txt";
    List<Ammunition> listOfAmmunition1 = new ArrayList<Ammunition>(4);
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);

    public ReadHelmetsFromFileTest() throws FileNotFoundException {
    }

    @Test
    public void readAmmunitionFromFile() throws FileNotFoundException {
        ReadHelmetsFromFile file=new ReadHelmetsFromFile();
        listOfHelmets1.add(ammunition);
        listOfHelmets1.add(ammunition1);
        listOfAmmunition.addAll(listOfHelmets1);
        listOfHelmets=file.readAmmunitionFromFile(path);
        listOfAmmunition1.addAll(listOfHelmets);
        String actual= String.valueOf(listOfAmmunition);
        String expected=String.valueOf(listOfAmmunition1);

        Assert.assertEquals(actual,expected);
    }
}