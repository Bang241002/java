package java.baitap1;

import java.sql.*;

public class ebook {

        public static void  main(String[]args){
            try(
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                            "myuser","xxx"
                    );
                    Statement stmt = conn.createStatement();
            ){
                String sqlDelete = "delete from books where id >8000";
                System.out.println("the SQL statement is:" + sqlDelete + "\n");
                int countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + "records deleted.\n");

                String sqlInsert = "insert into books values (8001,'Java Core' ,'Dang Kim Thi',15.55,55)";
                System.out.println("the SQL statement is:" + sqlInsert + "\n" );
                int countInserted = stmt.executeUpdate(sqlInsert);
                System.out.println(countInserted + "records inserted.\n");

                sqlInsert = "insert into books values (8002, 'Java Advaned', 'james Gosling',25.55,55)";
                System.out.println("the SQL statement is:" + sqlInsert + "\n" );
                countInserted = stmt.executeUpdate(sqlInsert);
                System.out.println(countInserted + "records inserted.\n");

                sqlInsert = "insert into books (id, title, author) values (2001,'javaJDBC MySQL ','thi DK')";
                System.out.println("the SQl statement is:" + sqlInsert + "\n");
                countInserted = stmt.executeUpdate(sqlInsert);
                System.out.println(countInserted + "records inserted.\n");

                sqlDelete = "delete from books where id =2001";
                System.out.println("the SQL statement is:" + sqlDelete + "\n");
                countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + "records deleted.\n");

                String strSelect = "select *from books";
                System.out.println("the SQL statement is:" + strSelect +"\n");
                ResultSet rset =stmt.executeQuery(strSelect);
                while (rset.next()){
                    System.out.println(rset.getInt("id") + ","
                            + rset.getString("author") + ","
                            + rset.getString("title") + ","
                            + rset.getDouble("price") + ","
                            + rset.getInt("qty")
                    );
                }
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

