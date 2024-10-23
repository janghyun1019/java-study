package study.practice;

import java.util.Scanner;

public class Prac09_241022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1.
			+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
			몇번째 수인가요? : 그에 해당하는 수를 출력
			ex) 10 20 30 50 90
			몇번째 수인가요? 5
			결과 : 90
		*/
		
		Scanner scanner = new Scanner(System.in);
        
		System.out.print("자연수 5개의 수를 차례대로 입력하세요 :");
		
		int[] numArr = new int[5];
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		}
		scanner.nextLine();
		System.out.print("몇번째 수인가요?");
		int findNum = scanner.nextInt();
		System.out.println("결과 : " + numArr[findNum-1]);
		
		/*
			2.
			+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
			받은후에 순서를 거꾸로 출력하세요.
			ex) 1 2 3 4 5
			결과 : 5 4 3 2 1
		*/
		
		System.out.print("자연수 5개의 수를 차례대로 입력하세요 :");
		
		int[] numArr1 = new int[5];
		for(int i=0; i<numArr1.length; i++) {
			numArr1[i] = scanner.nextInt();
		}
		
		System.out.print("결과 : ");
		for(int i=numArr1.length-1; i>=0; i--) {
			System.out.print(numArr1[i] + " ");
		}

		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		/*	
			3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
			(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
			1 2 3 4
			5 6 7 8
			9 10 11 12
			13 14 15 16
		 */
		
		int [][] intArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; //배열 생성
        
        for(int i=0; i<intArray.length; i++) { //column에 대한 반복
            for(int j=0; j<intArray[i].length; j++) { //low에 대한 반복

//                System.out.print(intArray[i][j] + " ");  // 자리정렬 안되어있음
                System.out.printf("%5d",intArray[i][j]); // 5자리 차지하게 정렬
            }
            System.out.println();
        }
		
		

	}

}
