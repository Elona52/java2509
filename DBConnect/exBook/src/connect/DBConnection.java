package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static String URL = "jdbc:mariadb://localhost:3306/hrdtest";
	static String USER = "root";
	static String PASSWORD = "1234";
	
	static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("=================== MariaDB 드라이버 로드 성공 ====================");
        } catch (ClassNotFoundException e) {
            System.err.println("MariaDB JDBC 드라이버 로드 실패");
            e.printStackTrace();
        }
    }
	

	public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("===================== MariaDB 연결 성공 ======================");
            return conn;
        } catch (SQLException e) {
            System.err.println("=========== DB 연결 실패 ================");
            e.printStackTrace();
            return null;
        }
    }

}