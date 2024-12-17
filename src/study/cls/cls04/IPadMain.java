package study.cls.cls04;

import java.util.Scanner;

//import java.util.Scanner;

public class IPadMain {
	
	//java

    public static void main(String[] args) {
    	
        IPad p1 = new IPad(); // 인스턴스 객체 생성
        
        p1.owner = "내꺼";
        p1.powerOn(); // "내꺼의 iPad 전원을 켰습니다." 출력

        IPad p2 = new IPad();
        p2.owner = "니꺼";

        // 인스턴스 필드
        System.out.println(p1.owner); // "내꺼" 출력

        // 클래스 필드
        System.out.println(IPad.madeBy); // "Apple" 출력
        
        IPad.check(); // "iPad를 점검합니다." 출력

        // 정적 필드는 모든 인스턴스에서 동일
        System.out.println(p1.madeBy); // "Apple" 출력 IPad.madeBy
        System.out.println(p2.madeBy); // "Apple" 출력
        System.out.println(IPad.madeBy);
        
        Math.random();
        Integer.parseInt("134");
        
        // RADIANS_TO_DEGREES;
        
        //java.util.Scanner scanner = new Scanner(System.in);
        java.util.Scanner scanner = new Scanner(System.in);
        
        
    }
}
