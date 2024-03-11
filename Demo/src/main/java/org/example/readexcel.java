package org.example;



public class readexcel {

    public static void main (String [] args){

        String projectPath = System.getProperty("user.dir");
        Main exl = new Main(projectPath + "/Datafiles/excel.xlsx", "Sheet1");
        exl.getRowCount();
        exl. getCellDataString(1,0);
        exl.getCellDataNumber(1,1);



    }


}
