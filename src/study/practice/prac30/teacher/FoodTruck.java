package study.practice.prac30.teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	
	//필드
	String truckName; // 트럭이름(매장이름)
	int totalSales; // 총매출액
	boolean isOpened; //영업 중 여부
	List<Food> foodList; //판매하는 메뉴 음식 리스트
	
	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	
	public void addMenu(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	
	public void addMenu(String name, int price) {
		foodList.add( new Food(name, price));
	}
	
	public void startSales() {
		Scanner scanner = new Scanner(System.in);
		
		isOpened = true;
	    System.out.println("=====[ 푸드트럭 영업시작 ]=====");
		
		while(isOpened ) {
						
			System.out.println();
		    System.out.println("***[ 메뉴선택 ]***");
		    System.out.println("1.메뉴보기  2.주문하기  3.재고관리  4.마감하기");
		    System.out.print(">>> 입력: ");

//		    String input = scanner.nextLine();
		    int menu;
		    try {
		    	menu = scanner.nextInt();
		    } catch (Exception e) {
		        menu = 0;
		    }
			    
		    
//		    try {
//		        Integer.parseInt(input);
//		    } catch (Exception e) {
//		        // TODO: handle exception
//		    }
		    
		    switch(menu) {
		    case 1:  // 메뉴보기
		    	//List
		    	//index: 0 1 2
		    	//사용자 번호 :  1 2 3
//		    	for(Food f : foodList) {
//		    		System.out.println(f.getFoodInfo());
//		    	}
		    	for(int i=0; i<foodList.size(); i++) {
		    		System.out.printf("[%d] %s\n", i+1, foodList.get(i).getFoodInfo());
		    	}
		    	break;
		    case 2:  // 주문
		    	for(int i=0; i<foodList.size(); i++) {
		    		System.out.printf("[%d] %s\n", i+1, foodList.get(i).getFoodInfo());
		    	}
		    	System.out.println(">>주문 메뉴를 선택하세요 :");
		    	int orderMenu = scanner.nextInt();
		    	break;
		    case 3:  // 재고관리
		    break;
		    case 4:  //마감하기
		    	// 매출 / 원가차감 -> 최종 수익?
		    	isOpened = false;
		    	System.out.println("===푸드트럭 영업마감===");
		    	break;
		    default:  
		    	System.out.println(">>잘못입력하셨습니다.<<");
		    }
			
		}

	    
	}
}
