package _JDBC.Gun02;

import _JDBC.JDBCParent;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//Soru :  Actor tablsosundaki tüm verileri yeni excel e yazdırınız.
public class _04_Soru extends JDBCParent {
    @Test
    public void test1() throws IOException {
        List<List<String>> list=getListData("select * from language");

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sayfa1");

        // HAFIZADA oluşturma ve yazma işlemelri yapılıyor
        Row yeniSatir= sheet.createRow(0); // satır oluşturuldu 0.yerde
        Cell yeniHucre= yeniSatir.createCell(0); // yeni satırda ilk hucre oluşturuldu
        //yeniHucre.setCellValue("Merhaba Dünya"); // bilgi yazıldı.

        for (int i = 1; i < list.size() ; i++) {
            sheet.createRow(i).createCell(i).setCellValue(i);
        }

        // Yazma işlemini YAZMA modunda açıp öyle yapacağız.
        String yeniExcelPath="src/test/java/ApachePOI/resource/YeniExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(yeniExcelPath);
        workbook.write(outputStream);
        workbook.close();  // hafıza boşaltıldı
        outputStream.close();
        System.out.println("işlem tamamlandı");
    }
    public static List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>();

        try {
            ResultSet rs = statement.executeQuery(sorgu);
            int columnSayisi = rs.getMetaData().getColumnCount();




            while (rs.next()) {
                List<String> satir = new ArrayList<>();
                for (int i = 1; i <=columnSayisi; i++) {
                    satir.add(rs.getString(i));
                }
                tablo.add(satir);
            }


        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        return tablo;
    }
}
