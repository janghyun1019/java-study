package study.cls.cls08;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[4];
		
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		arr[2] = null;
		
		for(String item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>(); //인포트를 해줘야한다
		list.add("ㄱ");
		list.add("ㄴ");
		list.add("ㄷ");
		list.add(0, "ㄹ");  // 0인덱스 지정
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// list.set(2, null);
		list.remove(2);  //지워주고
		
		for(String item : list) {
			System.out.print(item + " "); // ㄴ이 지워지
		}
		System.out.println();  
		
	}

}
