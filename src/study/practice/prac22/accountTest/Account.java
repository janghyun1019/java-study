package study.practice.prac22.accountTest;

public class Account {
	
	String num; // 계좌번호
	int balance; // 잔액

	public Account(String str, int i) {
		num = str;
		balance = i;
	}

	public String toString() {
		return String.format("Account { num: %s, balance: %d }", num, balance);
	}
	
	/* 1. 잔액이 부족한 경우 false를 반환하세요. */
	public boolean transfer(Account target, int amount) {
		if (this.balance < amount) {
        return false;
	}

	/* 2. 현재 잔액에서 송금액을 이체대상 계좌로 전달하세요. */
	// balance -= ??;
	// target.balance += ??;
		this.balance -= amount;        // 현재 계좌에서 차감
        target.balance += amount;      // 상대 계좌에 추가
        return true;
	}

}
