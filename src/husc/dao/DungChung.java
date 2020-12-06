package husc.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class DungChung {
	public Connection cn;
	
	public void KetNoi() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String url = "jdbc:sqlserver://localhost;databaseName=TranDucY;user=SA;password=tranducY99!";
		
		cn = DriverManager.getConnection(url);
	}
}
