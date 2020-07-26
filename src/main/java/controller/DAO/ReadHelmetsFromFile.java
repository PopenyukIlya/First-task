package controller.DAO;

import model.Boots;
import model.Helmet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadHelmetsFromFile extends Helmet {

    public ReadHelmetsFromFile()  {
    }
    final Logger logger = LogManager.getLogger(ReadHelmetsFromFile.class);
    public List<Helmet> readAmmunitionFromFile(String path) {
        List<Helmet> listOfHelmets=new ArrayList<>(4);
        listOfHelmets.clear();
        logger.trace("read Helmets From File");
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
                listOfHelmets.add(new Helmet(tokens[0], Double.parseDouble(tokens[1]),
                        Integer.parseInt(tokens[2]), tokens[3]));
            }
            br=null;
            fstream.close();
        }        catch (IOException e) {
            e.printStackTrace();
        }
        if(listOfHelmets.size()==0){logger.error("Clean list of hemlets");}
        logger.debug("List from file"+ listOfHelmets);
        return listOfHelmets;
    }
}
