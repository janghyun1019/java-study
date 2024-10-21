package study.practice;

public class Prac08_241021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println();
		System.out.println("◆ 반복문 1개로 결과 만들기");
		
		for (int i=1; i<=5; i++) {					
			System.out.println("12345");	
		}

		System.out.println();
		System.out.println();
		System.out.println("◆ 반복문 2개 중첩해서 결과만들기");
		
		
		// 11111 한줄이 나와야하고
		// 각 1씩 되야하는데..
		
		for(int i=0; i<1; i++) {
			
			int j=1;
			while(j<=1) {
				System.out.println("11111");
				j++;
			}
			for (int k=1; k<=1; k++) {
				System.out.println("22222");
			}
			for (int k=1; k<=1; k++) {
				System.out.println("33333");
			}
			for (int k=1; k<=1; k++) {
				System.out.println("44444");
			}
			for (int k=1; k<=1; k++) {
				System.out.println("55555");
			}
		}
		
		// 다른법
		System.out.println("◆ 반복문 2개 중첩해서 결과만들기");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();	
		}
		

	}

}
