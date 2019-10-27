package controller.DAO;

import model.Boots;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.List;

public class ReadBootsFromFile extends Boots {

    public ReadBootsFromFile() throws FileNotFoundException {
    }
    final Logger logger = LogManager.getLogger(ReadBootsFromFile.class);

    public List<Boots> readAmmunitionFromFile(String path) throws FileNotFoundException {
        listOfBoots.clear();
        logger.trace("Read boots From File");
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
                listOfBoots.add(new Boots(tokens[0], Double.parseDouble(tokens[1]),
                        Integer.parseInt(tokens[2]), tokens[3]));
            }
            br = null;
            fstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(listOfBoots.size()==0){logger.error("Clean list of boots");}
        logger.debug("List from file"+listOfBoots);
        return listOfBoots;
    }
}