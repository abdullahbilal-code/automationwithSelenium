package org.example;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.logging.Logger;

public class Main {
    //Making Global Variables to use in functions
    static String projectPath ;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;


    //call Constructor to Genaralize our Program
    public Main(String excelPath,String sheetName){

        try{

            workbook = new XSSFWorkbook (excelPath);
            sheet = workbook.getSheet(sheetName);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        System.out.println("Hello world!");


    }
    public static void getRowCount(){

        try{

            int rowCount=sheet.getPhysicalNumberOfRows();
            System.out.println("Row Count: "+rowCount);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            exp.getCause();
            System.out.println();
            exp.printStackTrace();
        }


    }
    public static void getCellDataString(int rowNum,int colNum){

        try {

            String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            exp.getCause();
            System.out.println();
            exp.printStackTrace();
        }
    }
    public static void getCellDataNumber(int rowNum, int colNum){

        try {

            double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            exp.getCause();
            System.out.println();
            exp.printStackTrace();
        }
    }
}