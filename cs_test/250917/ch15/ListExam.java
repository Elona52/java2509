package ch15;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public ListExam() {

		System.out.println("<---------------List--------------->");
		// 데이터 추가
		List<String> arrList = new ArrayList<>();
		arrList.add("사과");
		arrList.add("바나나");
		arrList.add("오렌지");
		System.out.println(arrList);
		System.out.print(arrList.get(0));
		System.out.print(arrList.get(1));
		System.out.println(arrList.get(2));
		System.out.println("--------------");

		// 데이터 특정 위치에 값 추가
		arrList.add(1, "포도");
		// 데이터 값의 중복허용
		arrList.add("사과");

		System.out.println(arrList);
		System.out.print(arrList.get(0));
		System.out.print(arrList.get(1));
		System.out.print(arrList.get(2));
		System.out.print(arrList.get(3));
		System.out.println(arrList.get(4));
		System.out.println("--------------");

		// 데이터 특정 위치값의 수정
		arrList.add(3, "포도2");

		System.out.println(arrList);
		System.out.println("--------------");

		// 데이터 특정 위치값의 삭제
		arrList.remove(0);
		System.out.println(arrList);
		System.out.println("--------------");

		// 리스트 내부의 요소값을 전부 비우기(clear)
		arrList.clear();
		System.out.println(arrList);
		System.out.println("--------------");

		System.out.println("for~(index)");
		List<String> arrList3 = new ArrayList<>();
		arrList3.add("사과");
		arrList3.add("바나나");
		arrList3.add("오렌지");

		for (int i = 0; i < arrList3.size(); i++) {
			System.out.print(arrList3.get(i));
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(arrList3.get(i));
		}

//		for (String ) {
//			System.out.print(arrList3.get(i));
//		}

		System.out.println("--------------");

		List<Integer> arrList2 = new ArrayList<Integer>();
		arrList2.add(10);
		arrList2.add(20);
		arrList2.add(30);
		arrList2.add(30);
		System.out.println(arrList2);
		System.out.print(arrList2.get(0));
		System.out.print(arrList2.get(1));
		System.out.println(arrList2.get(2));
	}

}
