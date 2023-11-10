package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadExcel {

    public ReadExcel(){
    }

    public void readExcel(String filepath, String SheetName) throws IOException {
        File file = new File(filepath);

        FileInputStream inputStream = new FileInputStream(file);
        

    }

}
