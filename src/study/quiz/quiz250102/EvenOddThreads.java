package study.quiz.quiz250102;

public class EvenOddThreads {
    public static void main(String[] args) {
        // 홀수를 출력하는 스레드 생성
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i += 2) {
                    System.out.println("Odd: " + i); // 홀수 출력
                    try {
                        Thread.sleep(100); // 출력 간의 간격을 위해 일시 정지
                    } catch (InterruptedException e) {
                        e.printStackTrace(); // 예외 처리
                    }
                }
            }
        });

        // 짝수를 출력하는 스레드 생성
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i <= 100; i += 2) {
                    System.out.println("Even: " + i); // 짝수 출력
                    try {
                        Thread.sleep(100); // 출력 간의 간격을 위해 일시 정지
                    } catch (InterruptedException e) {
                        e.printStackTrace(); // 예외 처리
                    }
                }
            }
        });

        // 두 스레드 시작
        oddThread.start();
        evenThread.start();
    }
}
