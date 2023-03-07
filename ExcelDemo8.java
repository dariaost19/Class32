package class32;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo8 {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> excelData= ExcelReader.read();
        //  var excelData=ExcelReader.read();
        for (Map<String,String>row:excelData){ //outer loop
         //   for(var entry:row.entrySet()){
            // System.out.println(entry);
            //another way to print the complete file

            for(Map.Entry<String,String >entry:row.entrySet()){ //inner loop
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println();
        }
    }
}
