package estudo.selenium.pog;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadGuru99ExcelFile {

    public void readExcel(String filePath,String fileName,String sheetName, String data) throws IOException{

    //Create an object of File class to open xlsx file

    File file = new File(filePath+"\\"+fileName);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook guru99Workbook = null;

    //Find the file extension by splitting file name in substring  and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    guru99Workbook = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of HSSFWorkbook class

        guru99Workbook = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name

    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

    //Find number of rows in excel file

    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = guru99Sheet.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console

            System.out.print(row.getCell(j).getStringCellValue());
            data = row.getCell(j).getStringCellValue();

        }

        System.out.println();
    } 

    }  

    //Main function is calling readExcel function to read data from excel file

    public static void main(String...strings) throws IOException{

    //Create an object of ReadGuru99ExcelFile class

    ReadGuru99ExcelFile objExcelFile = new ReadGuru99ExcelFile();

    //Prepare the path of excel file

    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
    String data = "";

    //Call read file method of the class to read data

    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelGuru99Demo", data);

    }

}

//try {
//FileInputStream fis = new FileInputStream(filePath);
//
//XSSFWorkbook workbook = null;
//try {
//	workbook = new XSSFWorkbook(fis);
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
// XSSFSheet sheet = workbook.getSheetAt(0);
//                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
//                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
// Row row = sheet.getRow(0);
// Cell cell = row.getCell(0);
// 
// data = sheet.getRow(0).getCell(0).toString();
// 
//System.out.println(data);
// 
//} catch (FileNotFoundException e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}