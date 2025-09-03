package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = new int[3];
//	        intArray = 10; // null이기 때문에 주석 처리 유지 (실행 시 예외 발생)

	        String hobby = "여행";
	        hobby = null;

	        // null 상태이기 때문에 null 체크 후 length() 호출
	        if (hobby != null) {
	            System.out.println("총 문자 수: " + hobby.length());
	        } else {
	            System.out.println("hobby가 null입니다.");
	        }
	    }
	}