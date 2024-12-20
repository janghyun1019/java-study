package study.inherit.inherit04.v3;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
	
	public static void main(String args) {
		
		List<Cleaner> list = new ArrayList<Cleaner>();
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		
		
		for(Cleaner c : list) {
			c.doClean();
		}
	}

}


//타입변환하고 메소드 재정의로 인해 이루어진다