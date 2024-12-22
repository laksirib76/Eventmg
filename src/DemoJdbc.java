import java.sql.*;
//import static java.lang.Class.forName;

import static java.lang.Class.forName;
public class DemoJdbc {
    public static void main(String[] args) throws SQLException {
      String url = "jdbc:postgresql://localhost:5432/demo";
      String uname;
      //String uname = "postgres";
      //String pass = "oracle";
      //String sql = "select *from student";
        String uname = "postgres";
        String pass = "oracle";
      String sql = "select *from student";
      Connection con = DriverManager.getConnection(url,uname,pass);
     // System.out.println("Connection Established");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(sql);
    //rs.next();
    //System.out.println(rs.next());
    //String name = rs.getString("student_name");
      while (rs.next()){
        System.out.print(rs.getInt(1)+"-");
        System.out.print(rs.getString(2)+"-");
        System.out.println(rs.getInt(3));
      }


      // System.out.println("Name of a student is" + name);
      con.close();
     // System.out.print("connection closed");
    }
}
