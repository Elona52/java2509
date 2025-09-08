package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		
//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		
		// 배열항목복사:첫번째배열,첫번째배열 시작위치,두번째배열,두번쨰배열 시작위치, 첫번째 배열길이만큼 값복사:모두 복사하 것.
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		//배열항목출력:[0]-[0]...
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}

}
