package study.cls.cls10;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 학생 생성
		Student s1 = new Student("나이름", "1234");
		s1.card = new Card(1, "신한", "체크", "나이름");
		
        // 출석 도구 생성
		AttendTool tool = new AttendTool();
		tool.isOn = true;
		tool.forOrg = "센터";
		
		// 학생 -> (카드)  ->  출결도구  (학생이 카드내면 나 출결로 체크해줘)
		// tool.checkAttend(s1.card);  // 도구야 나 출결체크해줘 끝~
		boolean result = tool.checkAttend(s1.card);
		if(result) {
			
		} else {
			//다시 시도
		}
		
		int r = tool.checkAttend2(s1.card);
		if(r == 1) {}
		else if( r==2) {}
		else {}
		
		// 학생 정보와 함께 출석 체크
		tool.checkAttend(s1.card, s1);
		
	}

}
