package controller;

import model.Ammunition;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class SortAmmunitionTest {

    List<Ammunition>  listOfAmmunition1 = new ArrayList<Ammunition>(4);
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);
    Ammunition ammunition=new Ammunition("vasav",120,270,"what ");
    Ammunition ammunition1=new Ammunition("koasflya",10,100,"what ");
    Ammunition ammunition2=new Ammunition("wora",170,170,"what ");

    public SortAmmunitionTest() throws FileNotFoundException { }

    @Test
    public void sortAmmunation() throws FileNotFoundException {
        SortAmmunition sortAmmunition =new SortAmmunition();
        listOfAmmunition1.add(ammunition1);
        listOfAmmunition1.add(ammunition2);
        listOfAmmunition1.add(ammunition);

        listOfAmmunition.add(ammunition);
        listOfAmmunition.add(ammunition1);
        listOfAmmunition.add(ammunition2);

        List<Ammunition> actual= sortAmmunition.sortAmmunation(listOfAmmunition);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }

}