package controller.DAO;

import model.Ammunition;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReadBootsFromFileTest {
    Ammunition ammunition=new Ammunition( "hcvwq23",50.0, 2250, null);
    Ammunition ammunition1=new Ammunition("jvwber1r23",750.0,1200,null );
    String path="src\\test\\resources\\Checklist.txt";

    @Test
    public void readAmmunitionFromFile() {

    }
}