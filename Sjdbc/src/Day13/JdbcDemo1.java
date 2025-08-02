package Day13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemo1 {
	public static void main(String[]args) {
		String url = "jdbc:mysql://localhost:3306/Student1";
		String userName ="root";
		String pwd = "root";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println("my sql driver not found");
			e.printStackTrace();
			return ;
		}
		try(Connection con = DriverManager.getConnection(url,userName,pwd);
				Statement st = con.createStatement()){
				String user = "create table user1(id int Auto_increment primary key,name varchar(100),number int)";
				st.executeUpdate(user);
				System.out.println("Table user1 is created at mysql");
				String val = "insert into user1(name,number) values(?,?)";
				try(PreparedStatement ps=con.prepareStatement(val)){
//					prepared statement is a inbuilt statement in a interface class
					ps.setString(1,"varun");
					ps.setInt(2, 7671);
					ps.addBatch();
					int[] arr=ps.executeBatch();
//					All the rows inserted into the database at a single batch
					System.out.printf("inserted rows %d",(int)java.util.stream.IntStream.of(arr).filter(c-> c>0).count());	
				}
				String query="select * from user1";
				try(ResultSet rs=st.executeQuery(query)){
					while (rs.next()) {
//						int id=rs.getInt(1);
						String name=rs.getString(2);
						int number=rs.getInt(3);
						System.out.println(" Name is "+name+" number is :"+number);
				}
					
				}
				
			}
			catch (SQLException e) {
				// TODO: handle exception
				System.out.println("Data operation failed");
				e.printStackTrace();
			}			
}
}