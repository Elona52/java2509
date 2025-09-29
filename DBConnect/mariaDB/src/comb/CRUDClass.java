package comb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDClass {

    public CRUDClass() {
        // 생성자에서는 DB 작업을 바로 실행하지 않는 것이 좋습니다.
        // 필요한 작업은 MyMain 등에서 메서드로 호출하세요.
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users ("
                   + "id VARCHAR(50) PRIMARY KEY, "
                   + "name VARCHAR(100)"
                   + ")";
        try (Connection conn = DBconnection.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("users 테이블 생성 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectTable() {
        String sql = "SHOW TABLES";
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("데이터베이스 테이블 확인");
            while (rs.next()) {
                // SHOW TABLES의 결과 컬럼명은 DB마다 다르므로 인덱스(1)로 가져오는게 안전
                String tableName = rs.getString(1);
                System.out.println("[" + tableName + "]");
            }
            System.out.println("------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(String id, String newName) {
        String sql = "UPDATE users SET name = ? WHERE id = ?";
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, id);
            int updated = pstmt.executeUpdate();
            System.out.println("업데이트된 행 수: " + updated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            int deleted = pstmt.executeUpdate();
            System.out.println("삭제된 행 수: " + deleted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

