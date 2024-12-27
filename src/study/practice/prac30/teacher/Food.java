package study.practice.prac30.teacher;

public class Food {
    String name; // 이름
    int price; // 가격
    int stock; // 재고

    // 생성자
    Food(String name, int price) {
        this.name = name; // 음식 이름 매개변수로 입력받아서 초기화
        this.price = price; // 가격 매개변수로 입력받아서 초기화
        this.stock = 10; // 재고 초기값 (현재 10으로 초기화 -> 추후 수정 예정)
    }

    // 재고변경 +10
    // 한개 팔리면 -1
    
    // 1번안. 재고를 음수로 만들지 않도록 사용
	// 2번안. 재고 변경 함수 호출할때 매개변수 (+10) (-5)
    void modifyStock(int q) {
        if (stock + q < 0) {
            stock = 0;
        } else {
            stock += q;
        }
    }

    // 음식의 현재 정보 반환
    String getFoodInfo() {
        // String str = name + ": " + price + "원" + " 재고: " + stock;
    	String str = String.format("%5s:%5d원 재고:%d", name, price, stock);
        return str;
    }
}