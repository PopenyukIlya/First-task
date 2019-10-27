package controller;

import controller.DAO.ReadAmmunicionFromCheckList;
import model.Ammunition;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumAmmunitionTest {
    List<Ammunition> listOfAmmunition1 = new ArrayList<Ammunition>(4);
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);
    SumAmmunition sumAmmunition=new SumAmmunition();
    ReadAmmunicionFromCheckList fromCheckList=new ReadAmmunicionFromCheckList();
    Ammunition ammunition=new Ammunition( "hcvwq23",520.0, 2250, "green");
    Ammunition ammunition1=new Ammunition("jvwber1r23",750.0,1200,"3+" );
    String path="src\\test\\resources\\Checklist.txt";

    public SumAmmunitionTest() throws FileNotFoundException {
    }

    @Test
    public void sumAmmunition() throws FileNotFoundException {
        listOfAmmunition1.add(ammunition);
        listOfAmmunition1.add(ammunition1);
        listOfAmmunition=fromCheckList.readAmmunitionFromFile(path);
        List<Ammunition> actual= listOfAmmunition;
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void clearCheckList() throws FileNotFoundException {
        sumAmmunition.clearCheckList("src\\test\\resources\\Clear.txt");
        int actual=fromCheckList.readAmmunitionFromFile("src\\test\\resources\\Clear.txt").size();
        int expected=0;
        assertTrue(actual==expected);
    }

    @Test
    public void sumAmmunation() throws FileNotFoundException {
        listOfAmmunition1.clear();
        listOfAmmunition1.add(ammunition);
        listOfAmmunition1.add(ammunition1);
        double actual=sumAmmunition.sumAmmunation(listOfAmmunition1);
        double expected=1270.0;
        assertTrue(actual==expected);
    }
}