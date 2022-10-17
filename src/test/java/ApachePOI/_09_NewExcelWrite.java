package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("dosya1");

        Row yeniSatir=sheet.createRow(0);
        Cell yeniHucre=yeniSatir.createCell(0);

        yeniHucre.setCellValue("aliosman");

        for (int i = 1; i < 12; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }

        String yeniExcelPath="src/test/java/ApachePOI/resource/YeniExcel.xlsx";

        FileOutputStream outputStream=new FileOutputStream(yeniExcelPath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem bitti");




    }
}
