package study.practice;

import java.util.Scanner;

public class Prac13_241023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*/
		
		int i =0;
		int j =0;
		for (i=1; i<=5; i++) {  // 라인기준 5번 반복
			for (j=i; j<=5; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------------------");
		/*
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
		*/
		
		i =0;
		j =0;
		for (i=1; i<=4; i++) {
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		
		System.out.println();
		System.out.println("---------------------------");
		/*
		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input=scanner.nextInt();
		for (i=1; i<=input; i++) {
			if(input%i==0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		System.out.println("---------------------------");
		/*
		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*
		**
		***
		****
		*****
		****
		***
		**
		*

		입력 : 3

		*
		**
		***
		**
		*
		*/
		
		System.out.print("숫자를 입력하세요 : ");
		int input1 = scanner.nextInt();
		for (i=1; i<=input1; i++) {
			for (j=1; j<=i; j++) {
				System.out.print("*"); 
			}
				System.out.println();
		}
		for (i=1; i<=input1; i++) {
			for (j=i; j<input1; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		
		System.out.println();
		System.out.println("---------------------------");
		/*
		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		*/
		
		int sum = 0;
		for(i=1; i<=10; i++) {
			for(j=1; j<=i; j++) {
			sum = sum+j;
			}
		}
		System.out.println("최종결과 : " + sum);
		
		
		System.out.println();
		System.out.println("---------------------------");
		/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		*/
		
		int n = 1;
		sum = 0;
		while(true) {
			if(n%2==0) {
				sum = sum-n;
			}else {
				sum = sum+n;
			}
			if(sum >=100) {
			break;
			}
			n++;
		}
		System.out.println("누적합 : "+ sum);
		System.out.println("마지막으로 더한 값 : "+ n);
		
		
		
		
	}

}
