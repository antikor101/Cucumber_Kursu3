package _JDBC.Gun02;

import _JDBC.JDBCParent;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

//Soru : getTable için yaptığını örneğin aynısını,
//bir XML filedan sorguyu parametre olarak göndererek bir Test için yapınız.
public class _03_Soru extends JDBCParent {
    @Parameters("arananKelime")
    @Test
    public void getTable(String gelen) throws SQLException {
        ResultSet rs = statement.executeQuery(gelen);

        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.printf("%-15s",rsmd.getColumnName(i));

        System.out.println();
        while (rs.next())
        {
            for (int i = 1; i <=rsmd.getColumnCount() ; i++)
                System.out.printf("%-15s",rs.getString(i));

            System.out.println();
        }
    }
}
