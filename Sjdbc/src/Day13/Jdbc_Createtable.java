package Day13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Createtable {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/Student1";
		String userName = "root";
		String pwd = "root";
		String query = "create table details(id Int, Name varchar(100))";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,pwd);
		Statement st = con.createStatement();
		int rs = st.executeUpdate(query);
		System.out.println(rs);
		System.out.println("Table created succcessfully");
		st.close();
		con.close();
	}
}
