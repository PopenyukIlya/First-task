package controller.DAO;

import model.Helmet;
import model.Jacket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadJacketFromFile extends Jacket {

    public ReadJacketFromFile()  {
    }
    final Logger logger = LogManager.getLogger(ReadJacketFromFile.class);
    public List<Jacket> readAmmunitionFromFile(String path) {
        List<Jacket> listOfJackets=new ArrayList<>(4);
        listOfJackets.clear();
        logger.trace("Read jackets From File");
        logger.debug("Path of file"+path);
        FileInputStream fstream = null;
        try
        {
            fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine = "";
            String[] tokens = strLine.split(" ");
            //Read file line by line
            while ((strLine = br.readLine()) != null)   {
                tokens = strLine.split(" ");
                listOfJackets.add(new Jacket(tokens[0], Double.parseDouble(tokens[1]),
                        Integer.parseInt(tokens[2]), tokens[3]));
            }
            br=null;
            fstream.close();
        }        catch (IOException e) {
            e.printStackTrace();
        }
        if(listOfJackets.size()==0){logger.error("Clean list of jackets");}
        logger.debug("List from file"+listOfJackets);
        return listOfJackets;
    }
}
