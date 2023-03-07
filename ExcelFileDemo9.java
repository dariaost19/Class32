package class32;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>>excelData= ExcelReader.read();
      //  var excelData=ExcelReader.read();
       Map<String,String> firstRow=excelData.get(1);
        System.out.println(firstRow.get("salary"));

    }
}
