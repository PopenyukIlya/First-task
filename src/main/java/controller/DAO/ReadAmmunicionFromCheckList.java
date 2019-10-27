package controller.DAO;

import model.Ammunition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAmmunicionFromCheckList extends Ammunition {
    private List<Ammunition> listOfAmmunition = new ArrayList<Ammunition>(4);
    final Logger logger = LogManager.getLogger(ReadAmmunicionFromCheckList.class);

    public ReadAmmunicionFromCheckList() throws FileNotFoundException {
        super();
    }

    public List<Ammunition> readAmmunitionFromFile(String path) throws FileNotFoundException {
        listOfAmmunition.clear();
        logger.trace("read Ammunition From Check list");
        logger.debug("Path of file"+path);
        FileInputStream fstream = null;
        try
        {
            fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine = "";
            String[] tokens = strLine.split(" ");
            //Read file line by line
            while ((strLine = br.readLine()) != null) {
                tokens = strLine.split(" ");
                listOfAmmunition.add(new Ammunition(tokens[0], Double.parseDouble(tokens[1]),
                        Integer.parseInt(tokens[2]), tokens[3]));
            }
            br = null;
            fstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.debug("List from file"+listOfAmmunition);
        return listOfAmmunition;
    }

}
