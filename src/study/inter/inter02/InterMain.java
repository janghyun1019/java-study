package study.inter.inter02;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		p.callPhone = new IPhone();
		
		p.call("1211231142");
		
		p.callPhone = new GalaxyPhone();
		p.call("1231231241234");

	}

}
