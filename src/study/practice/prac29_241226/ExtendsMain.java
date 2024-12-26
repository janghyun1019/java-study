package study.practice.prac29_241226;

public class ExtendsMain {

    public static void main(String[] args) {
        // 객체 생성
        KRW krw = new KRW(1500, "원");
        USD usd = new USD(100.50, "달러");
        EUR eur = new EUR(260.87, "유로");
        JPY jpy = new JPY(1400, "엔");

        // 부모 클래스를 통한 그룹화
        Currency[] currencies = { krw, usd, eur, jpy };

        // 모든 화폐정보를 출력
        for (Currency c : currencies) {
            System.out.println(c.toString());
        }
    }
}

// 1. 부모 클래스 Currency를 만듦
class Currency {
    protected double amount; // 수량
    protected String notation; // 표기법

    // 생성자
    public Currency(double amount, String notation) {
        this.amount = amount;
        this.notation = notation;
    }

    // toString() 메서드
    @Override
    public String toString() {
        return String.format("%.2f %s", amount, notation);
    }
}

// 2. 상속을 통해 중복 코드를 제거
class KRW extends Currency {
    public KRW(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("KRW: %.0f %s", amount, notation); // 소수점 제거 출력
    }
}

class USD extends Currency {
    public USD(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("USD: %.2f %s", amount, notation); // 소수점 2자리 출력
    }
}

class EUR extends Currency {
    public EUR(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("EUR: %.2f %s", amount, notation); // 소수점 2자리 출력
    }
}

class JPY extends Currency {
    public JPY(double amount, String notation) {
        super(amount, notation);
    }

    @Override
    public String toString() {
        return String.format("JPY: %.0f %s", amount, notation); // 소수점 제거 출력
    }
}
