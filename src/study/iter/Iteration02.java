package study.iter;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		for (초기화; 조건; 증감) {
		 	실행문;
		}
		
		while (조건) {
			실행문
		}
		 		 
		 */
		
		//5번만 출력
		
			// I :1 2 3 4 5
		for(int i=1; i<=5; i++) {
			System.out.println("안피곤하다");
		}
		
		int j = 1;
		while(j<=5) {
			System.out.println("안졸리다");
			j++; // J++이 없을경우 무한루프 ㄷㄷ
		}

//		무한루프 주의
//		while(true) {
//			System.out.println("무한");
//		}
		
		int k = 10;
		do {
			System.out.println("k do while");
		} while(k<5);
		
		k = 1;
		while (true) {
			//무한루프
			
			// k++; 이게 여기있으면 k는 2로 시작
			System.out.println(k);
			k++;
			
			if(k == 10) { // k가 10이 되는순간 (참)
				break; //멈추기
			}
			
			//System.out.println(k); 이게 여기 있으면 1 2 3 3 4 5 6 7 8 9
		}
		
		//
		System.out.println("===========================");
		
		for (int i=1; i<=10; i++) {
			
			
			System.out.println(i);
			if (i == 5)
				// break; // 멈춤
				
				
				continue; // 5를 만나는 순간 잠시 멈추고 나머지 실행
			
			
		}
		
		// 둘이 같이 쓰면 의도 하지 않았는데 실행이 안될 수 있음
		
		
		

	}

}
