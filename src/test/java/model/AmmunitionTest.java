package model;

import controller.Choose;
import controller.SortAmmunition;
import controller.SortAmmunitionByDiapasonOfPrice;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class AmmunitionTest {

    SortAmmunitionByDiapasonOfPrice sortAmmunation=new SortAmmunitionByDiapasonOfPrice();
    List<Ammunition> listOfAmmunition1 = new ArrayList<Ammunition>(4);
    List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);

    Ammunition ammunition=new Ammunition("vasav",120,270,"what ");
    Ammunition ammunition1=new Ammunition("koasflya",10,100,"what ");
    Ammunition ammunition2=new Ammunition("wora",170,170,"what ");

    public AmmunitionTest() throws FileNotFoundException {

    }


    @Test
    public void sortAmmunitionByDiapasonOfPrice() throws IOException {
        listOfAmmunition1.add(ammunition);
        listOfAmmunition1.add(ammunition2);

        listOfAmmunition.add(ammunition);
        listOfAmmunition.add(ammunition1);
        listOfAmmunition.add(ammunition2);

        List<Ammunition> actual= sortAmmunation.sortAmmunitionByDiapasonOfPrice(listOfAmmunition,100,200);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);

    }
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



    @Test
    public void testChooseAmmunition() {
    }

    @Test
    public void chooseBoots() {
    }

    @Test
    public void chooseJacket() {
    }

    @Test
    public void chooseHemlet() {
    }

    @Test
    public void sortBoots() throws FileNotFoundException {
        Boots boots=new Boots("vasav",120,270,"what ");
        Boots boots1=new Boots("koasflya",10,100,"what ");
        Boots boots2=new Boots("wora",170,170,"what ");
        List<Boots> listOfBoots=new ArrayList<>(4);
        SortAmmunition sortAmmunition =new SortAmmunition();
        listOfAmmunition1.add(boots1);
        listOfAmmunition1.add(boots2);
        listOfAmmunition1.add(boots);

        listOfBoots.add(boots);
        listOfBoots.add(boots1);
        listOfBoots.add(boots2);
        listOfAmmunition.addAll(listOfBoots);

        List<Ammunition> actual= sortAmmunition.sortAmmunation(listOfAmmunition);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortJacket() throws FileNotFoundException {
        SortAmmunition sortAmmunition =new SortAmmunition();
        Jacket jacket=new Jacket("vasav",120,270,"what ");
        Jacket jacket1=new Jacket("koasflya",10,100,"what ");
        Jacket jacket2=new Jacket("wora",170,170,"what ");
        List<Jacket> listOfJackets=new ArrayList<>(4);
        SortAmmunitionByDiapasonOfPrice sortAmmunitionByDiapasonOfPrice=new SortAmmunitionByDiapasonOfPrice();
        listOfJackets.add(jacket);
        listOfJackets.add(jacket1);
        listOfJackets.add(jacket2);
        listOfAmmunition.addAll(listOfJackets);

        listOfAmmunition1.add(jacket1);
        listOfAmmunition1.add(jacket2);
        listOfAmmunition1.add(jacket);
        List<Ammunition> actual= sortAmmunition.sortAmmunation(listOfAmmunition);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortHemlet() throws FileNotFoundException {
        Helmet helmet =new Helmet("vasav",120,270,"what ");
        Helmet helmet1 =new Helmet("koasflya",10,100,"what ");
        Helmet helmet2 =new Helmet("wora",170,170,"what ");
        List<Helmet> hemletOfHelmet =new ArrayList<>(4);
        SortAmmunition sortAmmunition =new SortAmmunition();
        listOfAmmunition1.add(helmet1);
        listOfAmmunition1.add(helmet2);
        listOfAmmunition1.add(helmet);

        hemletOfHelmet.add(helmet);
        hemletOfHelmet.add(helmet1);
        hemletOfHelmet.add(helmet2);
        listOfAmmunition.addAll(hemletOfHelmet);

        List<Ammunition> actual= sortAmmunition.sortAmmunation(listOfAmmunition);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortByPriceAmmunition() throws FileNotFoundException {
        listOfAmmunition1.add(ammunition);
        listOfAmmunition1.add(ammunition2);

        listOfAmmunition.add(ammunition);
        listOfAmmunition.add(ammunition1);
        listOfAmmunition.add(ammunition2);

        List<Ammunition> actual= sortAmmunation.sortAmmunitionByDiapasonOfPrice(listOfAmmunition,100,200);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortByPriceHemlet() throws FileNotFoundException {
        Helmet helmet =new Helmet("vasav",120,270,"what ");
        Helmet helmet1 =new Helmet("koasflya",10,100,"what ");
        Helmet helmet2 =new Helmet("wora",170,170,"what ");
        List<Helmet> listOfHelmets =new ArrayList<>(4);
        SortAmmunitionByDiapasonOfPrice sortAmmunitionByDiapasonOfPrice=new SortAmmunitionByDiapasonOfPrice();

        listOfHelmets.add(helmet);
        listOfHelmets.add(helmet1);
        listOfHelmets.add(helmet2);
        listOfAmmunition.addAll(listOfHelmets);

        listOfAmmunition1.add(helmet);
        listOfAmmunition1.add(helmet2);


        List<Ammunition> actual= sortAmmunitionByDiapasonOfPrice.sortAmmunitionByDiapasonOfPrice(listOfAmmunition,100,200);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortByPriceJacket() throws FileNotFoundException {
        Jacket jacket=new Jacket("vasav",120,270,"what ");
        Jacket jacket1=new Jacket("koasflya",10,100,"what ");
        Jacket jacket2=new Jacket("wora",170,170,"what ");
        List<Jacket> listOfJackets=new ArrayList<>(4);
        SortAmmunitionByDiapasonOfPrice sortAmmunitionByDiapasonOfPrice=new SortAmmunitionByDiapasonOfPrice();
        listOfJackets.add(jacket);
        listOfJackets.add(jacket1);
        listOfJackets.add(jacket2);
        listOfAmmunition.addAll(listOfJackets);

        listOfAmmunition1.add(jacket);
        listOfAmmunition1.add(jacket2);


        List<Ammunition> actual= sortAmmunitionByDiapasonOfPrice.sortAmmunitionByDiapasonOfPrice(listOfAmmunition,100,200);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortByPriceBoots() throws FileNotFoundException {
        Boots boots=new Boots("vasav",120,270,"what ");
        Boots boots1=new Boots("koasflya",10,100,"what ");
        Boots boots2=new Boots("wora",170,170,"what ");
        List<Boots> listOfBoots=new ArrayList<>(4);
        SortAmmunitionByDiapasonOfPrice sortAmmunitionByDiapasonOfPrice=new SortAmmunitionByDiapasonOfPrice();
        listOfBoots.add(boots1);
        listOfBoots.add(boots2);
        listOfBoots.add(boots);
        listOfAmmunition.addAll(listOfBoots);

        listOfAmmunition1.add(boots2);
        listOfAmmunition1.add(boots);


        List<Ammunition> actual= sortAmmunitionByDiapasonOfPrice.sortAmmunitionByDiapasonOfPrice(listOfAmmunition,100,200);
        List<Ammunition> expected=listOfAmmunition1;
        Assert.assertEquals(expected,actual);
    }
}