package 스레드;

public class ImgThread extends Thread {
	@Override
	public void run() {
		String[] img = {"1.png","2.png","3.png","4.png","5.png"};
		
		for (int i = 0; i < img.length; i++) {
			System.out.println("이미지 : " + img[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}