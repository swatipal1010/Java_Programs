package JDBC;
import java.sql.*;

public class RandomClass {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","LostPassword#100");
		Statement stmt = con.createStatement();
		System.out.println("Inserting records");
		String sql = "Insert into first values(85)";
		stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
