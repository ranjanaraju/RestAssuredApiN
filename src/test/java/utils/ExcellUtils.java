package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.zip.DataFormatException;

public class ExcellUtils
{
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    public ExcellUtils(String excelpath, String sheetName)
    {

        try
        {
             workbook=new XSSFWorkbook(excelpath);
             sheet=workbook.getSheet(sheetName);

        } catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }

    public static void getRowCount()
    {
        String projDir=System.getProperty("user.dir");
        System.out.println(projDir);
        int rowCount=sheet.getPhysicalNumberOfRows();
        System.out.println(rowCount);

    }
    public static void getcelldata(int rowNum, int colNum)
    {
        DataFormatter formatter=new DataFormatter();
        Object value=formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
        System.out.println(value);

    }

}
