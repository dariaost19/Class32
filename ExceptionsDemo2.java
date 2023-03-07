package class32;

import utils.ExcelReader;

import java.io.IOException;

public class ExceptionsDemo2 {
    public static void main(String[] args)  throws IOException {
        //  int []arr={10,20,30};
        //  System.out.println(arr[5]);
        //  String name=null;
        //  System.out.println(name.length());
        // try {
        //    ExcelReader.read();
        //  }catch (Exception e){
        //     System.out.println(e);
        //  }
        test();
    }
//method for ExcelReader.read(); exception
   static void test(){

       try {
           ExcelReader.read();
       }catch (Exception e){
           System.out.println(e);
       }
        }
    }

