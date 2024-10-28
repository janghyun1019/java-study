package study.practice.prac17;

public class Person {
	
	//필드
	String name;
	String gender;
	int age;
	int height;
	int weight;
	String job;
	String bloodType;
	String tone;
	String sleep;
	
	//생성자
	Person (String name, String gender, int age, int height, int weight, String job, String bloodType, String tone, String sleep) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.tone = tone;
		this.sleep = sleep;
	}
	
	//메소드(동작/기능)
	void printInfo() {
		//제조사:삼성 모델명:더프레임 인치:65인치
		System.out.printf(" 이름:%s\n 성별:%s\n 나이:%d세\n 키:%dcm\n 몸무게:%dkg\n 직업:%s\n 혈액형:%s형\n 건강상태:%s\n 수면중여부:%s\n", name, gender, age, height, weight, job, bloodType, tone, sleep);
	}
		
	
}
