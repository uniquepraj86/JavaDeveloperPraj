//package jdbc;
//import java.sql.*;
//   import java.sql.*;
//
//public class MysqlProcedureDemo {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        String url = "jdbc:mysql://localhost:3306/emp";
//        String username = "root";
//        String password = "Prajkta86@";
//        final String PROCEDURE = "call getAllEmployee()";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection(url,username,password);
//        CallableStatement callableStatement = con.prepareCall(PROCEDURE);
//        ResultSet rs = callableStatement.executeQuery();
//        while (rs.next()){
//            System.out.println(rs.getInt(1));
//        }
//    }
//}
//
