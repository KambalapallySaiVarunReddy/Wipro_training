package Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Retriveelements {
	public static void main(String []args) {
		String url = "jdbc:mysql://localhost:3306/Student1";
		String userName = "root";
		String pwd = "root";
		String query = "select * from details";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try(Connection con = DriverManager.getConnection(url,userName,pwd);
					Statement st = con.createStatement()){
				ResultSet rs = st.executeQuery(query);
				while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					System.out.println(id+" "+name);
				}
				
				
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
