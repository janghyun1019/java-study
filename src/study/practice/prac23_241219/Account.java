package study.practice.prac23_241219;

public class Account {
	
	/*
	 //2. 
		다음을 만족하는 클래스 Account를 작성하시오.
		· 다음의 2 개의 필드를 선언
		private String owner;
		private long balance;
		· 위 모든 필드에 대한 getter와 setter의 구현
		· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
		다음 기능을 추가하여 작성하시오.
		· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소
		드
		public long deposit(long amount)
		· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메
		소드
		public long withdraw(long amount)
		· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한
		저축과 인출을 수행한 후 잔금을 출력
		메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
		· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
		· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
		출하려는 메소드를 호출하여 출력
	*/

	private String owner;   //계좌 소유주
	private long balance;  //잔액
	
	public Account() {
		owner = null;
		balance = 0;
	}
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long amount) {  //저축 입금
		balance += amount;
		
		// 기존 : 30000 입금:10000
		// return 1)입금액   2)입금 후 최종잔액
		return amount;
	}
	
	public long withdraw(long amount) {  //출금
		
		//5000  9000원 출금 시도
		//1) 잔액 부족 -> 출금 실패
		//2) 잔액 부족 -> 최대 잔액만큼 출금
		if(amount > balance) {  //출금 불가
			System.out.println("잔액이 부족합니다.");
			return 0;
			
			/*
			 * 
			 * 2)
			 System.out.println("잔액이 부족합니다. 남은 모든 잔액을 출금합니다.");
			amount = balance;
			balance = 0;
			return amount;
			 */
			
		}
		
		balance -= amount;
		
		return amount;
	}
	
	
	
	
	/*
	//-----------------------------------------------------
	
    // 필드 선언
    private String owner;
    private long balance;

    // 기본 생성자
    public Account() {}

    // 모든 필드를 사용하는 생성자
    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getter와 Setter 메서드
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // 저축 메서드
    public long deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    // 인출 메서드
    public long withdraw(long amount) {
        if (amount > balance) {
            System.out.println("인출 금액이 잔액을 초과합니다. 현재 잔액: " + balance);
            return balance;
        } else {
            balance -= amount;
        }
        return balance;
    }

    public static void main(String[] args) {
        // Account 객체 생성
        Account account = new Account("John Doe", 5000);

        // 저축 수행
        account.deposit(2000);
        System.out.println("저축 후 잔액: " + account.getBalance());

        // 인출 수행
        account.withdraw(4000);
        System.out.println("인출 후 잔액: " + account.getBalance());

        // 인출 상한 금액 테스트
        account.withdraw(5000);
    }
    */
}
