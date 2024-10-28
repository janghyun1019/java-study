package study.quiz;

public class Quiz241028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("== 1번 ================");
		
//		1.
//		1 2 3 4
//		5 6 7 8
//		9 10 11 12
//		13 14 15 16
		
//		int [][] arr1 = new int [4][4];
//		int num1 = 1;
//		for(int i=0; i<arr1.length; i++) {
//			for(int j=0; j<arr1[i].length; j++) {
//				arr1[i][j]=num1;
//				num1++;
//			}
//		}
//		for(int i=0; i<arr1.length; i++) {
//			for(int j=0; j<arr1[i].length; j++) {
//				System.out.print(arr1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		// 선생님 풀이
		
		int [][] arr = new int [4][4];
		int num = 1;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				//4*4
				//i:0~3 0	1	2	3
				//j:0~3 0123012301230123
				arr[i][j] = num;
				num++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("== 2번 ================");
		
//		2.
//		1 5 9 13
//		2 6 10 14
//		3 7 11 15
//		4 8 12 16
		
		int [][] arr2 = new int [4][4];
		int num2 =1;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[j][i]=num2;
				num2++;
			}
		}
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		System.out.println("== 3번 ================");
		
//		3.
//		16 15 14 13
//		12 11 10 9
//		8 7 6 5
//		4 3 2 1

		int [][] arr3 = new int [4][4];
		int num3 = 1;
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				arr3[i][j]=num3;
				num3++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
			
		System.out.println();
		System.out.println("== 4번 ================");
		
//		4.
//		16 12 8 4
//		15 11 7 3
//		14 10 6 2
//		13 9 5 1
		
		int [][] arr4 = new int[4][4];
		int num4 = 16;
		for(int i=0; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				arr4[j][i]=num4;
				num4--;
		    }
		}
		for(int i=0; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
