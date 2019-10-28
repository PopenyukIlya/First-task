package model;

import controller.DAO.ReadAmmunicionFromCheckList;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HelmetTest {
    List<Helmet> listOfHelmets1 = new ArrayList<Helmet>(4);

    Helmet helmet2=new Helmet( "hcvwq23",520.0, 2250, "green");
    Helmet helmet1=new Helmet("jvwber1r23",750.0,1200,"3+");
    String path="src\\test\\resources\\Checklist.txt";
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);

    public HelmetTest() throws FileNotFoundException {
    }

    @Test
    public void readHelmet() throws FileNotFoundException {
        Helmet helmet=new Helmet();
        listOfHelmets1.add(helmet2);
        listOfHelmets1.add(helmet1);
        listOfAmmunition.addAll(listOfHelmets1);
        String actual= String.valueOf(listOfAmmunition);
        String expected=String.valueOf(helmet.readHelmet(path));
        Assert.assertEquals(actual,expected);
    }
}