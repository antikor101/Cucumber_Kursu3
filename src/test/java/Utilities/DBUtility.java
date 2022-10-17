package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {

    protected static Connection connection;
    protected static Statement statement;


    public static void DBConnectionOpen() {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public static void DBConnectionClose() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<List<String>> tablo = getListData("select * from actor");

        for (List<String> satir : tablo)
            System.out.println("Satir = " + satir);
    }


    public static List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>();

        DBConnectionOpen();
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
        DBConnectionClose();
        return tablo;
    }

}
