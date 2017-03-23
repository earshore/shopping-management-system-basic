package db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * 连接mysql数据库
 * 
 * @author lyons(zhanglei)
 */
public final class DbConn {
	public static Connection getconn() {
		Connection conn = null;

		String user = "root";
		String passwd = "12345";
		String url = "jdbc:mysql://localhost:3306/marketdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";// orcl为oracle数据库实例名字

		// 已加载完驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
