package java.baithi;

import java.sql.*;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            // Issue a SELECT to check the changes
            String strSelect = "SELECT * FROM `student`";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet resultSet = stmt.executeQuery(strSelect);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ", "
                        + resultSet.getString("name") + ", "
                        + resultSet.getString("address") + ", "
                        + resultSet.getString("Phone")
                );
            }
            {

                //SEARCH
                System.out.println("\n\nEnter the student id want to SEARCH");
                Integer enterID = sc.nextInt();
                String strSelect2 = "select *from student where is:" + enterID;
                System.out.println("The SQL Statement is: " + strSelect2 + "\n");
                ResultSet resultSet2 = stmt.executeQuery(strSelect2);
                System.out.println("the records selected are:");
                while (resultSet2.next()) {
                    System.out.println(resultSet2.getInt("id") + ","
                            + resultSet2.getString("name") + ","
                            + resultSet2.getString("address") + ","
                            + resultSet2.getString("Phone")
                    );
                }
            }
            //DELETE
            int countRecord = stmt.executeUpdate("DELETE From student where id = 1001");
            System.out.println(countRecord + " records deleted.\n");

            // Update
            countRecord = stmt.executeUpdate("UPDATE student SET `name` = 'Dinh Cong Bang' WHERE `student`.`id` = 1001;");
            System.out.println(countRecord + " records updated.\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
