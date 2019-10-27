package controller.DAO;

import model.Ammunition;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class ReadAmmunicionFromCheckListTest {

    List<Ammunition> listOfAmmunition1 = new ArrayList<Ammunition>(4);
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);
    ReadAmmunicionFromCheckList fromCheckList=new ReadAmmunicionFromCheckList();
    Ammunition ammunition=new Ammunition( "hcvwq23",520.0, 2250, "green");
    Ammunition ammunition1=new Ammunition("jvwber1r23",750.0,1200,"3+" );
    String path="src\\test\\resources\\Checklist.txt";
    @Test
    public void readAmmunitionFromFile() {
        listOfAmmunition1.add(ammunition);
        listOfAmmunition1.add(ammunition1);
        listOfAmmunition=fromCheckList.readAmmunitionFromFile(path);
        String actual= String.valueOf(listOfAmmunition);
        String expected=String.valueOf(listOfAmmunition1);
        Assert.assertEquals(expected,actual);
    }
}