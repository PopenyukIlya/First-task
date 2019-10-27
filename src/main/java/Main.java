import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import view.View;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       View view=new View();
        view.preMainMenu();
    }
}
