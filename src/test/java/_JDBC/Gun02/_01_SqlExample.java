package _JDBC.Gun02;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends JDBCParent {
    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city");

        rs.last();

        String id = rs.getString(1);

        System.out.println(id);

        int idInt = rs.getInt(1);
        System.out.println("idInt = " + idInt);

        String name = rs.getString(2);
        System.out.println("name = " + name);

        //       int nameInt= rs.getInt(2);
        //       System.out.println("nameInt = " + nameInt);

        int kacinciSatir=rs.getRow();
        System.out.println("kacinciSatir = " + kacinciSatir);

        rs.first();






    }
}
