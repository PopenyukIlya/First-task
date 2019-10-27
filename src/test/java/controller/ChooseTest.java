package controller;

import model.Ammunition;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ChooseTest {
    List<Ammunition> listOfAmmunition1 = new ArrayList<Ammunition>(4);
    Ammunition ammunition=new Ammunition( "hcvwq23",50.0, 2250, null);
    Ammunition ammunition1=new Ammunition("jvwber1r23",750.0,1200,null );

    public ChooseTest() throws FileNotFoundException {
    }

    @Test
    public void chooseAmmunition() throws FileNotFoundException {
        Choose choose=new Choose();
        listOfAmmunition1.clear();
        listOfAmmunition1.add(ammunition);
        listOfAmmunition1.add(ammunition1);
        Ammunition actual= choose.chooseAmmunition(listOfAmmunition1,2);
        Ammunition expected=ammunition1;
        Assert.assertEquals(expected,actual);
    }
}