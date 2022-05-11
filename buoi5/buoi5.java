package java.buoi5;

import java.sql.*;
import java.util.Scanner;
public class buoi5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            // Issue a SELECT to check the changes
            String strSelect = "select * from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet resultSet = stmt.executeQuery(strSelect);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ", "
                        + resultSet.getString("author") + ", "
                        + resultSet.getString("title") + ", "
                        + resultSet.getDouble("price") + ", "
                        + resultSet.getInt("qty")
                );
            }
        }
    }