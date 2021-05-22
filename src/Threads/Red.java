package Threads;

public class Red {
	public final static String ESC   = "\u001b[";
	public final static String RED_BACKGROUND = "\u001b[41m";
	private final static String DELIMIT ="\u001b[0m"; //delimits the range of a color

	private int red_maxWidth;
	private int length;
	
	public Red(int red_maxWidth, int length) {
		this.red_maxWidth = red_maxWidth;
		this.length = length;
	}

	public void red() throws InterruptedException {
		for (int i = 0; i < length; i++) {
		
			for (int j = 30; j < red_maxWidth; j++) {
				System.out.print(ESC + i + "G" + ESC + j + "d");
				System.out.print(RED_BACKGROUND + ' ' + DELIMIT);
			
				Thread.sleep(10);
			}
		}
	}
}
