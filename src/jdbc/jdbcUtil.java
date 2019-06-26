package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcUtil {
	public static Connection getConn() {
		Connection conn = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String username = "root";
		String password = "123456";
		String databaseName = "demo";
		String url = "jdbc:mysql://localhost:3306/" + databaseName
				+ "?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";

		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
