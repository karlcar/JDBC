package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
	//执行数据库的函数
	public static void select() {
		Connection conn = (Connection) jdbcUtil.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select username from user ";
		List<Person> inforList = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			inforList = resultSetToEmployees(rs);
					
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static List<Person> resultSetToEmployees(ResultSet rs){
		List<Person> inforList = new ArrayList<>();
		try {
			while(rs.next()) {
				int index = 1;
				Person infor = new Person();
				infor.setId(rs.getString(index++) + ",");
				infor.setUsername(rs.getString(index++) + ",");
				infor.setSex(rs.getString(index++) + ",");
				infor.setAddress(rs.getString(index++) + ",");
				infor.setPhone(rs.getString(index++) + ",");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return inforList;
	}
	
	

	public static void main(String[] args) {
		select();
	}

	
	
}
