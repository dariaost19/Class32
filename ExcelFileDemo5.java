package class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //a class that we can use to read and write the data from Excel files.
        XSSFSheet sheet2 = xssfWorkbook.getSheet("Sheet2");
        int noOfRows = sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        for (int i = 0; i < noOfRows; i++) {
            Row row = sheet2.getRow(i);
            System.out.println(row.getCell(0) + "  " + row.getCell(1));

        }
        System.out.println("*******************");
        for (int i = 0; i < noOfRows; i++) {
            Row row = sheet2.getRow(i);
            int noOfCells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");

            }
            System.out.println();
        }
    }
}

