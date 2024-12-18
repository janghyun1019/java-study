package study.practice.prac20_241216;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Prac20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		1.
		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		*/
		
		System.out.println("두 주사위의 합이 6이 되는 모든 경우:");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
		
		/*
		2.
		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		1) Math.random() 활용
		2) int[] lotto = new int[6]; 활용
		*/
        
        int[] lotto = new int[6]; // 로또 번호를 저장할 배열
        
        for (int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1; // 1~45 랜덤 숫자 생성
            
            // 중복 확인
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) { // 중복 발생
                    i--; // 다시 값을 생성하기 위해 i를 감소
                    break; // 내부 반복문 종료
                }
            }
        }
        
        // 결과 출력
        System.out.print("생성된 로또 번호: ");
        for (int num : lotto) {
            System.out.print(num + " ");
        }
		
		/*
		3.
		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.

		ex)
		1반 : 10 10 10 10 10
		2반 : 20 20 20 20 20
		3반 : 30 30 30 30 30

		1반 평균 : 10
		2반 평균 : 20
		3반 평균 : 30
		전체 평균 : 20

		*/
        
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[3][5]; // 3반, 각 반 5명 점수
        int totalSum = 0; // 전체 합

        // 반별 점수 입력
        for (int i = 0; i < 3; i++) { // 3반 반복
            System.out.println((i + 1) + "반 점수 입력:");
            int classSum = 0; // 각 반의 합 초기화

            for (int j = 0; j < 5; j++) { // 각 반의 5명 점수 입력
                scores[i][j] = scanner.nextInt(); // 점수 입력
                classSum += scores[i][j]; // 반 점수 합계 누적
            }

            totalSum += classSum; // 전체 합에 더하기
            System.out.println((i + 1) + "반 평균: " + (classSum / 5.0)); // 각 반 평균 출력
        }

        // 전체 평균 계산 및 출력
        System.out.println("전체 평균: " + (totalSum / 15.0));

        scanner.close();
        
		/*

		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.

		ex)
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		이 주어지는 경우 최종 결과는
		10 20 30 60
		20 30 40 90
		30 40 50 120
		60 90 120 270
		*/
		
        int[][] arr = {
                {10, 20, 30},
                {20, 30, 40},
                {30, 40, 50}
            };

            int rows = arr.length;
            int cols = arr[0].length;

            int[][] result = new int[rows + 1][cols + 1]; // 행과 열의 합을 추가한 배열 생성

            // 행, 열, 전체 합 계산
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = arr[i][j];      // 원본 값 복사
                    result[i][cols] += arr[i][j];  // 행 합
                    result[rows][j] += arr[i][j];  // 열 합
                    result[rows][cols] += arr[i][j]; // 전체 합
                }
            }

            // 결과 출력
            System.out.println("결과 출력:");
            for (int i = 0; i <= rows; i++) {
                for (int j = 0; j <= cols; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
		
		
		

	}

}
