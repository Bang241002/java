package java.baihoc;

import java.sql.*;

public class jdbcCommitCatchTest {
    public static void main(String[]args){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop",
                        "myuser" , "xxxx");
                    Statement stmt = conn.createStatement();
                ){
            try {
                conn.setAutoCommit(false);

                stmt.executeUpdate("insert into books values (4001, 'Paul chan', 'Mahjong 101', 4.4,4)");

                stmt.executeUpdate("insert into books values (4001, 'Peter chan', 'Mahjong 102', 4.4,4)");
                conn.commit();

            }catch (SQLException ex ){
                System.out.println("--Rooling back changes--");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
