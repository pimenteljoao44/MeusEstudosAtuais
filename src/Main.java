import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        JdbcConnection jdbcConnection = new JdbcConnection();
          Connection con = jdbcConnection.getConnection();
       /*
          String sql = "insert into agenda (nome,idade,email) values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1,"João");
         ps.setInt(2,18);
         ps.setString(3,"Joaovitordasilvapimentel0@gmail.com");

         ps.execute();
          ps.close();
          */
          String sqlUpdate = "update agenda set nome = 'Murilo'";
        Statement s = con.createStatement();
         s.executeUpdate(sqlUpdate);
    }
}