package ch05.sec09;

public class ArrayCopyByFOrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이전 배열길이 - 3
		int[] oldIntArray = { 1, 2, 3 };

		//새로운 배열길이 - 5 : 배열길이를 늘릴 수 없기떄문에 새로 만들어줘야함. 
		int[] newIntArray = new int[5];

		//배열순서에 맞게 값을 복사: [0]-[0]...
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		//첫번째 배열에 값은 3개, 새로만든 배열길이는 5개이므로 빈 두자리에는 0으로 대체 
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
	}

}
