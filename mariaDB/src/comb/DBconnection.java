package comb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/employees";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    // 드라이버 로드 (있으면 좋음)
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MariaDB JDBC driver not found. Make sure the driver is on the classpath.");
        }
    }

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("연결성공");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("연결실패");
            // 실패 시 null 반환보다 런타임 예외로 알리는 편이 디버깅에 유리합니다
            throw new RuntimeException("DB connection failed", e);
        }
    }

    // 편의 close 메서드들
    public static void close(Statement stmt, Connection conn) {
        try {
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close(stmt, conn);
    }

    public static void close(PreparedStatement pstmt, Connection conn) {
        try {
            if (pstmt != null) pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
