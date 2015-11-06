package Airline_v1;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Airline_v1.ConnectionManager;

public class dataController {
	public static Connection connection = (Connection) ConnectionManager.getMySQLConnection();
	public static ResultSet login(String username,String password){
		String query = "SELECT * FROM users WHERE username =lower('"+username+"')"
				+" AND password = '"+password+"'";
		ResultSet rs;
		try {
			rs = dataController.execute(query);
			if (!rs.next()){
				return null;
	    	}
	    	else {
	    		return rs;
	    	}
	    		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	private static ResultSet execute(String query) throws SQLException{
			Statement statement = (Statement) connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			return rs;
	}

}


