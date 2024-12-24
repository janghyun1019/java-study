package study.inherit.inherit04.v4;

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
			
			if( c instanceof DustCleaner ) {  // 형변환을 하고 진행
				DustCleaner d = (DustCleaner)c;
				d.arrangeItem();				
			}		
			
		}
		
		Cleaner c1 = new DustCleaner();
		c1.doClean();
		DustCleaner d1 = (DustCleaner)c1;
		d1.doClean();
		d1.arrangeItem();
		
	}

}


//타입변환하고 메소드 재정의로 인해 이루어진다