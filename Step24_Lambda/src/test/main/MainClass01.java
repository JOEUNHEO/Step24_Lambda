package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드에서 A 작업수행~");
			}
		}).start();
		
		//Runnable run() 메소드를 줄여서 표현!
		new Thread(()->{
			System.out.println("스레드에서 B 작업 수행");
		}).start();
	}
}
