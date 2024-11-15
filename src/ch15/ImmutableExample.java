package ch15;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A","B","C");
//		immutableList1.add("D");
		
//		System.out.println(immutableList1); //  java.lang.UnsupportedOperationException
//		immutableList1.remove("C");			//  java.lang.UnsupportedOperationException
//		immutableList1.set(2, "D");			//  java.lang.UnsupportedOperationException
		
		// Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A","B","C");
//		immutableSet1.add("D");
		
		// Map 불변 컬렉션 생성
		
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
//		immutableMap1.put(4, "D");		// java.lang.UnsupportedOperationException
		
		// copyOf() 메서드
		// List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<String>();
		list.add("D");
		list.add("E");
		list.add("F");
		List<String> immutableList2 = List.copyOf(list); // 불변처리
		List<String> test = new ArrayList<String>(immutableList2); //블변값 인자로..
		test.add("A");
		System.out.println(test);
//		immutableList2.add("A");	// java.lang.UnsupportedOperationException
		
		// Set 컬렉션을 불변 컬렉션으로 복사
		
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		System.out.println(set);
		
		
		// Map 컬렉션을 불변 컬렉션으로 복사
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		System.out.println(map);
		
		// 배열로부터 List 불변 컬렉션 생성
		String[] arr = {"A","B","C"};
		List<String> immutablelist3 = Arrays.asList(arr);	// 불변 List 컬렉션 생성
		immutablelist3.add("D"); 					// // java.lang.UnsupportedOperationException
		System.out.println(immutablelist3);
		
//		System.out.println(immutableList1);
//		System.out.println(immutableSet1);
//		System.out.println(immutableMap1);
//		System.out.println(immutableList2);
	}

}
