package utils;

public class ExcellUtilsTest
{
    public static void main(String[] args)
    {
        String excelpath = "C:\\Users\\Windows\\IdeaProjects\\RestAssuredApi\\target\\Excell\\TestData.xlsx";
        String sheetName="Sheet1";
        ExcellUtils excel = new ExcellUtils(excelpath, sheetName);
        excel.getRowCount();
        excel.getcelldata(1,0);
        excel.getcelldata(1,1);
        excel.getcelldata(1,2);

    }
}
