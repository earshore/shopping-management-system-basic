package db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 * ����mysql���ݿ�
 * 
 * @author lyons(zhanglei)
 */
public final class DbConn {
	public static Connection getconn() {
		Connection conn = null;

		String user = "root";
		String passwd = "12345";
		String url = "jdbc:mysql://localhost:3306/marketdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";// orclΪoracle���ݿ�ʵ������

		// �Ѽ���������
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
