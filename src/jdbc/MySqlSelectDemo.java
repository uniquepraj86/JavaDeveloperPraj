package jdbc;
import java.sql.*;

public class MySqlSelectDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "Prajkta86@";
        final String SELECT_QUERY = "select * from employee;";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery(SELECT_QUERY);
        System.out.println("Id "+ " Name "+" Job "+ " MGR ");
        while (rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getString(3)+" ");
            System.out.print(rs.getString("mgr")+" ");
            System.out.print(rs.getString("hiredate")+" ");
            System.out.println(rs.getString("sal")+" ");
        }
    }

}

