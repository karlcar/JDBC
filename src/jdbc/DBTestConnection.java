package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestConnection {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //动态引入数据库驱动类
//			String url = "jdbc:mysql://localhost:3306/sys";
//			String username = "root";
//			String userPassword = "123456";
//			conn = DriverManager.getConnection(
//                    url, username, userPassword);
//			--------------------------------------------------------------------
			String databaseName = "demo";
			String url = "jdbc:mysql://localhost:3306/" + databaseName + "?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
			String username = "root";
			String password = "123456";
			conn=DriverManager.getConnection(url,username,password);
			System.out.println("成功连接数据库" + databaseName);
		}catch ( Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
