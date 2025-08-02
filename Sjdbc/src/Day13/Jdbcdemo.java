package Day13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Jdbcdemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/Student1";
		String userName ="root";
		String pwd = "root";
		String query = "select * from Student1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			String name = rs.getString(2);
			String email=rs.getString(3);
			System.out.println("Name is " + name +" email is :" +email);
		}
		rs.close();
		st.close();
		con.close();
	}
}