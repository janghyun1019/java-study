package study.practice.prac22.Arr;

public class Order {
	
	// 필드(인스턴스 필드)
	int orderNum;
	Menu[] menus;
	// 생성자
	public Order(int i, Menu[] arr) {
	orderNum = i;
	menus = arr;
	}
	
//	// 메소드(인스턴스 메소드)
//	public int totalPrice() {
//	/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
//	return 0;
//	}
	
	// 메소드(인스턴스 메소드)
    public int totalPrice() {
        int sum = 0; // 총합 초기화
        for (int i = 0; i < menus.length; i++) { // 배열 길이만큼 반복
            sum += menus[i].price; // 메뉴 가격을 누적합
        }
        return sum; // 총합 반환
    }
	
	
	
}
