package pl.coderslab.mvcjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static String DB_URL = "jdbc:mysql://localhost:3306/1workshop?useSSL=false&useUnicode=yes&characterEncoding=UTF-8";
	private static String DB_USER = "root";
	private static String DB_PASS = "root";

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {

		}
		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	}
}
