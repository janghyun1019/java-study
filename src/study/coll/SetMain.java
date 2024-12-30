package study.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {

		// 숫자들을 set 로 사용하고 싶으면?
		// Wrapper Class
		// int -> Integer
		// double -> Double
		
		// 12313435353452342325345 //몇종류의 숫자가 들어있는가?
		
		Set<String> set1 = new HashSet<String>();
		Set<Integer>set2 = new HashSet<Integer>();
		
		System.out.println(set1.size());
		System.out.println(set1.isEmpty());
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		System.out.println(set1.size());
		set1.add("C");
		set1.add("C");
		set1.add("C");
		set1.add("C");
		set1.add("E");
		
		set1.add("F");
		set1.add("H");
		set1.add("A");
		set1.add("B");
		
		System.out.println(set1.size());
		
		Iterator<String> i1 = set1.iterator();
		
		//i1.hasNext() 다음값이 존재하는지 확인
		// i1.next() 다음값 읽어오기
		while(i1.hasNext()) {
			String n = i1.next();
			System.out.println(n);
		}
		
		
	}

}
