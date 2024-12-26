package study.practice.prac28.v1;

public class UnitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marine marine = new Marine();
        marine.move(5, 10);
        marine.stop();
        marine.stimPack();

        Tank tank = new Tank();
        tank.move(15, 20);
        tank.stop();
        tank.changeMode();

        Dropship dropship = new Dropship();
        dropship.move(25, 30);
        dropship.stop();
        dropship.load();
        dropship.unload();


    }
}
	