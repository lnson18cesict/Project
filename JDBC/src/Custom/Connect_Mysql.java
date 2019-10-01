package Custom;

import java.sql.*;

public class Connect_Mysql {
	public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";
		String dbName = "text";
		String userName = "root";
		String password = "root";

		String connectionURL = "jdbc:mysql://" + hostName + ":81/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		
		return conn;
	}

	public static void main(String args[]) {
		try {
			
			Connection conn = getMyConnection();
			
			System.out.println(conn);
		} catch (SQLException e) {
			System.out.println("SQL exception: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class Not Found Exception: " + e.getMessage());
		}
	}

}