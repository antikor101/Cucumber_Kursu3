package ApachePOI;
/*  Soru 1:
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
 */

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

/*  Soru 2:
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
 */
public class _10_Soru {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("dosya1");

        int sayi = 1;
        String x = "x";
        String esittir = "=";

        for (int i = 0; i < 10; i++) {
            Row yeniSatir = sheet.createRow(i);
            for (int j = 0; j < 2;) {
                Cell cell = yeniSatir.createCell(j);
                cell.setCellValue(sayi);
            }

        }
        String yeniExcelPath = "src/test/java/ApachePOI/resource/CarpimTablosu.xlsx";

        FileOutputStream outputStream = new FileOutputStream(yeniExcelPath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem bitti");

    }
}
