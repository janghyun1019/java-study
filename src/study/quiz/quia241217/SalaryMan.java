package study.quiz.quia241217;

public class SalaryMan {
	
	// 필드: 월 급여액 (초기값 1,000,000)
    private int salary = 1000000;

    // 기본 생성자
    public SalaryMan() {
        // salary 필드는 초기값 1,000,000으로 설정
    }

    // 매개변수 있는 생성자
    public SalaryMan(int salary) {
        this.salary = salary;
    }
    
    // 연봉 : 월급 1년치 + 상여금(보너스 월급 500%) 로 계산
    // 연봉 계산 메서드: 월급 * 12 + 보너스 (월급 * 5)
    public int getAnnualGross() {
        return salary * 12 + salary * 5;
    }

	public static void main(String[] args) {

        System.out.println(new SalaryMan().getAnnualGross()); // 기본 월급: 1,000,000

        System.out.println(new SalaryMan(2000000).getAnnualGross()); // 월급: 2,000,000
		

	}

}
