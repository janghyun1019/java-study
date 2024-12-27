package study.practice.prac30.me;

import java.util.Scanner;

public class FoodTruckMain {
    public static void main(String[] args) {
        FoodTruck truck = new FoodTruck();
        truck.addMenuItem("김밥", 1000);

        truck.addStock("김밥", 50);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== 푸드트럭 관리 시스템 ====");
            System.out.println("1. 메뉴 보기");
            System.out.println("2. 주문하기");
            System.out.println("3. 재고관리(메뉴 재고 추가)");
            System.out.println("4. 마감하기");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    truck.showMenu();
                    break;
                case 2:
                    System.out.print("주문할 메뉴 이름: ");
                    String orderName = scanner.next();
                    System.out.print("주문 수량: ");
                    int quantity = scanner.nextInt();
                    truck.order(orderName, quantity);
                    break;
                case 3:
                    System.out.print("재고 추가할 메뉴 이름: ");
                    String stockName = scanner.next();
                    System.out.print("추가 수량: ");
                    int stockAmount = scanner.nextInt();
                    truck.addStock(stockName, stockAmount);
                    break;
                case 4:
                    truck.close();
                    return;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
