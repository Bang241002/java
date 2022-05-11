package java.buoi5.buoi05;

import java.sql.*;
import java.util.Scanner;
public class buoi05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
//  Issue a SELECT to check the changes
            String strSelect3 = "select * from books";
            System.out.println("The SQL statement is: " + strSelect3 + "\n");
            ResultSet resultSet3 = stmt.executeQuery(strSelect3);
            while (resultSet3.next()) {
                System.out.println(resultSet3.getInt("id") + ", "
                        + resultSet3.getString("author") + ", "
                        + resultSet3.getString("title") + ", "
                        + resultSet3.getDouble("price") + ", "
                        + resultSet3.getInt("qty")
                );
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}