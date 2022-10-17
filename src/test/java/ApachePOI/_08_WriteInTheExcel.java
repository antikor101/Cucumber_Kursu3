package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        //Var Olan Exele Yazma
        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        FileInputStream inputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(inputStream);

        Sheet sheet = workbook.getSheet("Dosya1");

        Row yeniSatir=sheet.createRow(3);
        Cell yeniHucre=yeniSatir.createCell(0);

        yeniHucre.setCellValue("aliosman");

        for (int i = 1; i < 12; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }
        inputStream.close();

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem bitti");
    }
}
