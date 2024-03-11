package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeExcel {
    public static void main(String[] args) throws IOException {
        String projectPath = System.getProperty("user.dir");

        FileInputStream fileRead = new FileInputStream(projectPath + "/Datafiles/input.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileRead);
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Get the first row  creating it if it does not exist
        Cell write = sheet.getRow(0) != null ? sheet.getRow(0).getCell(0) : null;
        if (write == null) {
            write = sheet.createRow(0).createCell(0);
        }

        //Writing string value to xlsx sheet /cell
        write.setCellValue("Hello");
        String data = sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println(data);

        FileOutputStream fileWrite = new FileOutputStream((projectPath + "/Datafiles/output.xlsx"));

        try {
            workbook.write(fileWrite);
        } finally {
            fileRead.close();
            fileWrite.close();
            workbook.close();
        }
    }

}
