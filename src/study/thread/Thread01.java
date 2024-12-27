package study.thread;

public class Thread01 extends Thread {
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //일하는 사이에 1초마다 쉬어라 //예외처리도 같이해준다
		}
	}

}
