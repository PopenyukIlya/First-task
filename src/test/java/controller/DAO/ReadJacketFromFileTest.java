package controller.DAO;

import model.Ammunition;
import model.Helmet;
import model.Jacket;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReadJacketFromFileTest {
    List<Jacket> listOfJackets1 = new ArrayList<Jacket>(4);
    List<Jacket> listOfJackets = new ArrayList<Jacket>(4);

    ReadAmmunicionFromCheckList fromCheckList=new ReadAmmunicionFromCheckList();
    Jacket ammunition=new Jacket( "hcvwq23",520.0, 2250, "green");
    Jacket ammunition1=new Jacket("jvwber1r23",750.0,1200,"3+");
    String path="src\\test\\resources\\Checklist.txt";
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);
    List<Ammunition> listOfAmmunition1 = new ArrayList<Ammunition>(4);

    public ReadJacketFromFileTest() throws FileNotFoundException {
    }

    @Test
    public void readAmmunitionFromFile() throws FileNotFoundException {
        ReadJacketFromFile file=new ReadJacketFromFile();
        listOfJackets1.add(ammunition);
        listOfJackets1.add(ammunition1);
        listOfAmmunition.addAll(listOfJackets1);
        listOfJackets=file.readAmmunitionFromFile(path);
        listOfAmmunition1.addAll(listOfJackets);
        String actual= String.valueOf(listOfAmmunition);
        String expected=String.valueOf(listOfAmmunition1);
        Assert.assertEquals(actual,expected);
    }
}