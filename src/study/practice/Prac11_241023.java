package study.practice;

import java.util.Scanner;

public class Prac11_241023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기
		
		/* 내꺼
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		if (num%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		} 
		*/
		
		
		// 선생님 풀이
		/*				
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt(); // 입력받기
		// num % 2 == 0  // 0 1
		if(num%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		*/
		

//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		
		/* 내꺼
		System.out.println(); // 열 
		
		System.out.print("정수를 입력하세요 : ");
		int numSeven = scanner.nextInt();
		
		if (numSeven%7==0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("아닙니다");
		}
		*/
		
		// 선생님 풀이
		// 7 14 21 ....
		// 나랑 똑같
		
				
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.	
		
		/* 내꺼
		System.out.println(); // 열 

		int sum = 0;
        
        for(int i=5; i<1000; i++) {
            if(i%5 == 0) {
            sum+=i;
            }
        }
        System.out.println("5의 배수의 합 : " + sum);
        */
		/*
		// 선생님풀이
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1~1000까지 5의 배수의 합 : " + sum);
		
		 sum = 0;
		 for(int i=5; i<=1000; i=i+5) {
			 sum = sum +i;
		 }
		 System.out.println("1~1000까지 5의 배수의 합 : " + sum);
		 
		 sum = 0;
		 int i1 = 1;
		 while(i1<=1000) {
			 if(i1%5 == 0 )
				 sum = sum +i1;
			 
			 i1++;
		 }
		 System.out.println("1~1000까지 5의 배수의 합 : " + sum);
		 
		*/
		
//      4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//      ex) 입력 : 10
//      결과 : **********
		 
        /*내꺼
        System.out.println(); // 열 
        
        System.out.println("1~50 까지의 숫자를 입력해 주세요");
        Scanner re=new Scanner(System.in);
        
        String star = "*";
        
        int n=re.nextInt();
        
        System.out.print("결과 : ");
        for(int i=1;i<=n;i++) {
        System.out.print(star);
            }
        */
		 /*
		 // 선생님풀이 
		 System.out.println("1~50 까지의 숫자를 입력해 주세요");
	     int num =  scanner.nextInt();
	     // num 5
	     // num 10
	     
	     System.out.print("결과 : ");
	     for(int i=1; i<=num; i++) {
	    	 System.out.print("*");
	     }
		 */
        
//      5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//      ex) 1 - 2 + 3 - 4 .....
        /*
        System.out.println(); // 열 
        
        // 선생님 풀이
        // int result = 1-2+3-4+5-6+7-8+10;
        
        
        
        int result = 0;
        for(int i=1; i<=10; i++) {
        	
        	if(i%2 == 0) { //짝수
        		result = result - 1;
        	} else { //홀수
        		result = result + 1;
        	}
        	
        }
        System.out.println(result);
        */
        
//      6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//      1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
        /*
        int total = 0;
        
        int i=1;
        while(total<100) {
        	total = total +1; //1 + 2 + 3
        	i++; // 4
        }
        System.out.println("누적값 : " + total);
		
        total = 0;
        i = 1;
        while(true) {
        	total = total + i;
        	i++;
        	
        	if(total >= 1000)
        		break;
        }
        System.out.println("누적값 : " + total);
        */
        /*
        7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
        ex) 입력 3
        3 * 1 = 3
        3 * 2 = 6
        3 * 3 = 9
        ...
        3 * 9 = 27
        */
        
        System.out.println("몇단 출력할래? (1~9) : ");
	    int num =  scanner.nextInt();
	    //num = 3;
	    
	    for(int i=1; i<=9; i++) {
	    	System.out.printf("%2d * %2d = %3d\n", num, i, num*i);
	    }
        
        
		
	}

}
