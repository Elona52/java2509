package ch15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExam {

	public MapExam() {
		
		System.out.println("<---------------Map--------------->");
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("사과", 1000);
		hashMap.put("바나나", 500);
		hashMap.put("오렌지", 800);
		hashMap.put("사과", 1200);
		
		System.out.println("HashMap: " + hashMap);
		System.out.println("사과 가격: " + hashMap.get("사과") );
		
		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("서울", "Seoul");
		treeMap.put("부산", "Busan");
		treeMap.put("대구", "Deagu");
		treeMap.put("인천", "Incheon");
		
		System.out.println("TreeMap(키 정렬): " + treeMap);
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(3, "셋");
		linkedHashMap.put(1, "하나");
		linkedHashMap.put(2, "둘");
		
		System.out.println("LinkedHashMap(순서 유지): " + linkedHashMap);
		
		
	}
}
