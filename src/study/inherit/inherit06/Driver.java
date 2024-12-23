package study.inherit.inherit06;

public class Driver {
//	public void drive(Bus bus) {
//		//버스도 운전할수 있고 택시도 운전할수 있다
//		bus.run();
//	}
//	
//	public void drive(Taxi taxi) {
//		//버스도 운전할수 있고 택시도 운전할수 있다
//		taxi.run();
//	}
	
	public void drive(Vehicle vehicle) {  //부모니까 다 담을 수 있다
		vehicle.run();
	}
}
