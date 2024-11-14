package ch15;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	// TreeMep
	// - 이진 트리 기반으로 한 map 컬렉션
	// - 부모의 키를 기반으로 낮은 것은 왼쪽, 높은 오른쪽
		
	public static void main(String[] args) {
		// TreeMap 컬렉션 생성
		TreeMap<String, Integer> treeMep = new TreeMap<String, Integer>();
		
		// 값 저장
		treeMep.put("apple",10);
		treeMep.put("forever",60);
		treeMep.put("description",40);
		treeMep.put("ever",50);
		treeMep.put("zoo",80);
		treeMep.put("base",200);
		treeMep.put("guess",70);
		treeMep.put("cherry",70);
		
		// 정렬된 값을 하나씩 불러오기
		Set<Entry<String,Integer>> entrySet = treeMep.entrySet();
		for(Entry<String,Integer> entry: entrySet) {
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}

		 // 특정 키에 대한 값 가져오기
	      Entry<String, Integer> entry = null;
	      // firstEntry()
	      entry = treeMep.firstEntry();
	      System.out.println("제일 앞 단어 : " + entry.getKey() + "-" + entry.getValue());
	      // lastEntry()
	      entry = treeMep.lastEntry();
	      System.out.println("제일 뒤 단어 : " + entry.getKey() + "-" + entry.getValue());
	      // lowerEntry(key)
	      entry = treeMep.lowerEntry("ever");
	      System.out.println("ever 앞 단어 : " + entry.getKey() + "-" + entry.getValue());

	      // 내림차순으로 정렬
	      NavigableMap<String, Integer> descendingMap = treeMep.descendingMap();
	      Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
	      for (Entry<String, Integer> e: descendingEntrySet) {
	         System.out.println(e.getKey() + "-" + e.getValue());
	      }
	      System.out.println();
	      
	      // 범위 검색 subMap(시작값, 포함여부(boolean), 끝값, 포함여부(boolean)
	      // c <= x < h
	      NavigableMap<String, Integer> rangeMap = treeMep.subMap("c", true, "h", false);
	      for (Entry<String, Integer> e: rangeMap.entrySet()) {
	         System.out.println(e.getKey() + "-" + e.getValue());
	      }
	      System.out.println();

	}

}
