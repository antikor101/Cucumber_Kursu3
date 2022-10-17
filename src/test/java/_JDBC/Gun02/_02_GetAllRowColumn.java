package _JDBC.Gun02;

import _JDBC.JDBCParent;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            String colmnType = rsmd.getColumnTypeName(i);

            System.out.println(colmnType + " " + columnName);

        }
    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            System.out.print(" " + columnName);
        }
        System.out.println();
        while (rs.next()) {
            System.out.println("     " + rs.getString(1) + "     " + rs.getString(2) + "     " + rs.getString(3));

        }

    }

    @Test
    public void test3() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

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
    @Test
    public void test4() throws SQLException{

        getTable("select * from actor");

    }
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