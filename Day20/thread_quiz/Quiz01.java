package thread_quiz;

public class Quiz01 {

	public static void main(String[] args) throws InterruptedException {
		Zoo animal1 = new Zoo("¾îÈï");
		Zoo animal2 = new Zoo("À½¸Þ~");
		Zoo animal3 = new Zoo("È÷À×");
		
		Thread an1 = new Thread(animal1);
		Thread an2 = new Thread(animal2);
		Thread an3 = new Thread(animal3);
		
		an1.start();
		an2.start();
		an1.join();
		an2.join();
		an3.start();
		
	}

}
