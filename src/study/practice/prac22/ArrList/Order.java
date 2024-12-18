package study.practice.prac22.ArrList;

import java.util.ArrayList;	

public class Order {
	
	// 필드(인스턴스 필드)
    int orderNum;
    ArrayList<Menu> menus;

    // 생성자
    public Order(int i, ArrayList<Menu> list) {
        orderNum = i;
        menus = list;
    }

    // 메소드(인스턴스 메소드)
    public int totalPrice() {
        int sum = 0; // 총합 초기화
        for (Menu menu : menus) { // 메뉴 리스트를 순회하면서
            sum += menu.price; // 각 메뉴의 가격을 누적합산
        }
        return sum; // 총합 반환
    }
	
	
}
