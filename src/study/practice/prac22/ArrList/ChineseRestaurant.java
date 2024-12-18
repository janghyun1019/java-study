package study.practice.prac22.ArrList;

import java.util.ArrayList;	

public class ChineseRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주문을 위한 메뉴 선정
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu tangsook = new Menu("탕수육", 13900);
        
        // 메뉴를 ArrayList에 담아 주문 생성
        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(jjajang);
        menuList.add(jjambbong);
        menuList.add(tangsook);

        Order order = new Order(123, menuList);
        
        // 주문 결과 출력
        System.out.printf("주문 합계: %d원\n", order.totalPrice());

	}

}
