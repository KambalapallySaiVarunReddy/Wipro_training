package Day13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_Insertdata {
	public static void main(String []args) {
	String url = "jdbc:mysql://localhost:3306/Student1";
	String userName = "root";
	String pwd = "root";
	String query = "insert into details(id,name) values(?,?)";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection con = DriverManager.getConnection(url,userName,pwd);
				PreparedStatement str = con.prepareStatement(query)){
			str.setInt(1,7472);
			str.setString(2, "Varun");
			str.executeUpdate();
			System.out.println("updated in table");
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}
}
}
