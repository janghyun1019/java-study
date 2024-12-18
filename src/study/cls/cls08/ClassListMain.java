package study.cls.cls08;

import java.util.ArrayList;

import study.cls.cls07.Temp;

public class ClassListMain {

    public static void main(String[] args) {
    	
    	Temp t = new Temp();
    	
    	Temp[] arr = new Temp[3];
    	arr[0] = new Temp();
    	arr[1] = new Temp();
    	arr[2] = t;
    	
    	// Integer 는 int 타입의 Wrapper Class
    	// Double 는 double 타입의 Wrapper 클래스
    	
    	// ArrayList를 사용할때는 선언부분이 꼭 필요하다 new ArrayList<Temp>();
    	ArrayList<Temp> list2 = null; //new ArrayList<Temp>(); 초기화처리가 잘되어있는지 확인
    	// list2.add(new Temp());
    	
    	
    	ArrayList<Temp> list = new ArrayList<Temp>();
    	list.add(t);
    	list.add(new Temp());
    	list.add(new Temp());
    	list.add(new Temp());
    	list.add(new Temp());
    	
    	for(int i=0; i<list.size(); i++) {
    		list.get(i).print();
    	}
    	
    	for(Temp item : list) {
    		item.print();
    	}
       
    	ArrayList<Temp> returnList = methodList(list);
    	System.out.println("method  호출 후");
    	for(Temp item : returnList) {
    		item.print();
    	}    	
    	
    }
    
    public static ArrayList<Temp> methodList(ArrayList<Temp> list){
    	System.out.println("method 안에서");
    	list.add(new Temp());
    	list.get(1).print();
    	
    	return list;
    }
}

