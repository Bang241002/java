package java.ebook;

import java.sql.*;


public class jdbcSectTest {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", ""
                );
                Statement stmt = conn.createStatement();
        ) {

            String StrSelect = "select title , price, qty frin books";
            System.out.println("the SQL statement is:" + StrSelect + "\n");

            ResultSet rest = stmt.executeQuery(StrSelect);

            System.out.println("the records selected are:");

            int rowCount = 0;
            while (rset.next()) {
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + "," + price + "," + qty);
                ++rowCount;

            }
            System.out.println("total number of records = " + rowCount);
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}


