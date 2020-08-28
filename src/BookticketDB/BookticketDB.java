package BookticketDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookticketDB {
	 String driver;
	 String dbName;
	 String connectionURL;

	 String username;
	 String password;
	 public  BookticketDB ()
	 {
		 driver = "com.mysql.jdbc.Driver";
		 connectionURL = "jdbc:mysql://localhost/";
		 dbName = "movie_database";
		 username = "root";
		 password = "root";
	 }
	 public Connection getConnection() throws Exception {

	      Class.forName(driver);
		  Connection connection = DriverManager.getConnection(connectionURL+dbName,username,password);

		  return connection;
	 }
	 public static void main(String[] args) {
		 BookticketDB db = new BookticketDB();
			try {
				Connection conn = db.getConnection();
				System.out.println("Database successfully connected!");
				conn.close();
			} catch (Exception e) {
			
				e.printStackTrace();
			}

	 }
}
		 
	


