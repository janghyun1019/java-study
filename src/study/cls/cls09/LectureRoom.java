package study.cls.cls09;

import java.util.ArrayList;

public class LectureRoom {
	
	
	
	int floor;			// 7층
	int roomNumber;		// 강의실번호 3교육실
	double pyeong;		// 몇평 공간 30평
	
	boolean hasWhiteBoard;
	// String whiteBoard;
	
	WhiteBoard board;
	AirCon airCon;
	
	// Desk desk; 그냥 타입으로 들어가면 안된다 여러개가 있기 때문에
	// Desk[] deskArr; 배열로 쓰이긴 하지만
	ArrayList<Desk> deskList;  // 여러개의 데스크를 보유하고 있구나
	
	// 생성자 초기에 작업들을 모아서 작업
	// 기본생성자 
	// 비워 두는게 아니라 초기셋팅을 하는것도 좋다
	
	public LectureRoom() {
		// 초기값으로 뭐가 들어갈껍니다
		floor = 0;
		roomNumber = 0;
		pyeong = 0;
		hasWhiteBoard = false;
		board = null;
		
		/*
		board = new WhiteBoard();
		board.sizeX = 1200;
		board.sizeY = 800;
		board.price = 120000;
		board.isMag = true;
		//이렇게 하면 내가 원하는대로 조합이 불가능하다
		*/
		
		// 내부에서 직접 쓰는거와 불러와서 사용하는 것과의 차이점
		// 조합의 형태
		// 내부에서 사용되면 그냥 고정되어버린다 (정해진것 들이 고정되어버린다)
		// 다른 것이 들어오지 않으면 기본값이다
		
				
		airCon = null;
		// deskList = null;
		deskList = new ArrayList<Desk>(); //NullPointerException
		// 여기에 해놓으면 가장 좋다
		
	}
	
	// 이렇게 하면 내가 원하는대로 조합이 가능하다
	public LectureRoom(WhiteBoard board, AirCon airCon) {
		this.board = board;
		this.airCon = airCon;
	}
	
	
	public void setDeskLisk(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public void addDesk(Desk desk) {
		
		if(this.deskList == null) {  //null 이라면 추가하고 처리하라 (미리 예외처리)
			this.deskList = new ArrayList<Desk>();
		}
		
		this.deskList.add(desk);
	}

}
