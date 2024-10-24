package study.refer;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 30, 40 ,50};
		
		System.out.println(arr);
		
		for(int i=0; i<5; i++) { // index : i: 0 1 2 3 4
			System.out.print( "arr[" + i + "]" + arr[i] + " ");
		}
		System.out.println();
		
		
	
		// 아래 i는 변수명 우리가 아무렇게나 바꿔도 됨
		for(int value : arr) { // 10 20 30 40 50 
			
			// 전체 갯수만큼 처음부터 끝까지 다 반복
			// 값만 주어지고, 인덱스는 모른다.
			
			System.out.print( value + " " );
		} // 무조건 끝날때까지 돔
		
		System.out.println();
		
		int index=0;
		for(int value : arr) { // 10 20 30 40 50 
			
			// 전체 갯수만큼 처음부터 끝까지 다 반복
			// 값만 주어지고, 인덱스는 모른다.
			
			System.out.print( value + " " );
			index++;
		} // 무조건 끝날때까지 돔
		
		System.out.println();
		
		//
		int[] scores = {90, 95, 100, 80, 75};
		int sum = 0;
		
		for(int i=0; i>scores.length; i++) {
			// sum = sum+i; 0+1+2+3+4
			sum = sum + scores[i]; //90+95+100+80+75
		}
		System.out.println(sum);
		
		sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println(sum);
		
		// 점수 채점 잘못되서, 모든 점수를 -5점씩 감점
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i] - 5;
			//scores[0] = scores[0] - 5;      // 90 - 5 = 85
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		for(int score : scores) {
			score = score -5;
		}
		
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		
		
	}

}
