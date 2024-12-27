package study.practice.prac30.teacher;

public class FoodTruckMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FoodTruck ft = new FoodTruck();

        ft.addMenu("김밥", 3000);
        ft.addMenu("짜장면", 6000);
        ft.addMenu("핫도그", 2000);
        // ft.addMenu("악플", 5000);

        ft.startSales(); // 영업시작
    }
}