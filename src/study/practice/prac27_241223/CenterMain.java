package study.practice.prac27_241223;

import java.util.ArrayList;

public class CenterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Center center = new Center();
		center.staffList = new ArrayList<Staff>();
		center.roomList = new ArrayList<Room>();
		
		center.staffList.add(new Staff());
		center.staffList.add(new Staff());
		center.staffList.add(new Staff());
		
		//강의실 3개 휴개실 2개 사무실 1개
		center.roomList.add(new LectureRoom());
		center.roomList.add(new LectureRoom());
		center.roomList.add(new LectureRoom());
		
		center.roomList.add(new LoungeRoom());
		center.roomList.add(new LoungeRoom());
		
		center.roomList.add(new OfficeRoom());
		
	}

}
