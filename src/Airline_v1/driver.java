package Airline_v1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class driver {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		try {
//			Connection conn = ConnectionManager.getMySQLConnection();
//			String query = "select * FROM users";
//			Statement statement = conn.createStatement();
//			ResultSet rs = statement.executeQuery(query);	
//	        while (rs.next())  {
//            	System.out.println(rs.getString("username"));
//	        }
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
		ResultSet user = dataController.login("ptran", "tranp6");
		System.out.println(user.getString("firstname"));

	}

}
