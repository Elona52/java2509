package ch15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {

		
	public SetExam() {

		System.out.println("<------------Set------------>");
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Java");
		hashSet.add("Python");
		hashSet.add("JavaScript");
		hashSet.add("Java");
		System.out.println(hashSet);
		System.out.println("-------------");
		
		Set<Integer>treeSet = new TreeSet<Integer>();
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(20);
		
		System.out.println("TreeSet (정렬됨): " + treeSet);
		
		Set<String>linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("첫째");
		linkedHashSet.add("둘째");
		linkedHashSet.add("셋째");
		linkedHashSet.add("넷째");

	
		System.out.println("LinkedHashSet(순서 유지): " + linkedHashSet);
		
	}
}
