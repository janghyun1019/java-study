package study.practice.prac30.me;

import java.util.ArrayList;

public class FoodTruck {
    private ArrayList<Food> menu;
    private int sales;

    public FoodTruck() {
        this.menu = new ArrayList<>();
        this.sales = 0;
    }

    public void addMenuItem(String name, int price) {
        menu.add(new Food(name, price));
    }

    public void addStock(String name, int amount) {
        for (Food item : menu) {
            if (item.getName().equals(name)) {
                item.addStock(amount);
                return;
            }
        }
        System.out.println("메뉴를 찾을 수 없습니다.");
    }

    public void showMenu() {
        System.out.println("\n==== 메뉴 ====");
        for (Food item : menu) {
            System.out.printf("%s - %d원 (재고: %d)%n", item.getName(), item.getPrice(), item.getStock());
        }
    }

    public void order(String name, int quantity) {
        for (Food item : menu) {
            if (item.getName().equals(name)) {
                if (item.getStock() >= quantity) {
                    item.reduceStock(quantity);
                    sales += item.getPrice() * quantity;
                    System.out.printf("%s %d개 주문 완료. %d원 결제되었습니다.%n", name, quantity, item.getPrice() * quantity);
                } else {
                    System.out.println("재고가 부족합니다.");
                }
                return;
            }
        }
        System.out.println("메뉴를 찾을 수 없습니다.");
    }

    public void close() {
        int wasteCost = 0;
        System.out.println("\n==== 마감 ====");
        for (Food item : menu) {
            int itemWasteCost = item.calculateWasteCost();
            wasteCost += itemWasteCost;
            System.out.printf("%s - 남은 재고: %d, 폐기 손해: %d원%n", item.getName(), item.getStock(), itemWasteCost);
        }
        int finalProfit = sales - wasteCost;
        System.out.printf("총 매출: %d원, 폐기 손해: %d원, 최종 수익: %d원%n", sales, wasteCost, finalProfit);
    }
}