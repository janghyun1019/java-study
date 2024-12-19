package study.practice.prac23_241219;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
//		s1.dept = "컴공";
//		s1.stuNum = 1334;
//		
//		System.out.println("학과:" + s1.dept + "학번:" + s1.stuNum);  //실행을 위한 코드
		s1.setDept("컴공");
		s1.setStuNum(1334);
		System.out.println("학과:" + s1.getDept() + "학번:" + s1.getStuNum());

	}

}
