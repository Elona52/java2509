package comb;

public class MyMain {

    public static void main(String[] args) {
        CRUDClass crud = new CRUDClass();

        // 테이블 생성 -> 목록 조회 예시
        crud.createTable();
        crud.selectTable();

        // 예시: 추가/수정/삭제 메서드는 필요 시 구현하여 호출
        // crud.updateUser("someId", "newName");
        // crud.deleteUser("someId");
    }
}
