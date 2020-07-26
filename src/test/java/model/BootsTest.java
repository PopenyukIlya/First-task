package model;

import controller.DAO.ReadAmmunicionFromCheckList;
import controller.Service.BootsService;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BootsTest {
    List<Boots> listOfBoots1 = new ArrayList<Boots>(4);
    List<Boots> listOfBoots = new ArrayList<Boots>(4);

    ReadAmmunicionFromCheckList fromCheckList=new ReadAmmunicionFromCheckList();
    Boots ammunition=new Boots( "hcvwq23",520.0, 2250, "green");
    Boots ammunition1=new Boots("jvwber1r23",750.0,1200,"3+");
    String path="src\\test\\resources\\Checklist.txt";
    List<Ammunition> listOfAmmunition1 = new ArrayList<Ammunition>(4);
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);

    public BootsTest() throws FileNotFoundException {
    }

    @Test
    public void readBoots() throws FileNotFoundException {
BootsService boots=new BootsService();

        listOfBoots1.add(ammunition);
        listOfBoots1.add(ammunition1);
        listOfAmmunition.addAll(listOfBoots1);
        String actual= String.valueOf(listOfAmmunition);
        String expected=String.valueOf(boots.readBoots(path));
        Assert.assertEquals(actual,expected);
    }
}