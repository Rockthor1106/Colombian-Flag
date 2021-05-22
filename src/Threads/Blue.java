package Threads;

public class Blue {
	public final static String ESC   = "\u001b[";
	public final static String BLUE_BACKGROUND = "\u001b[44m";
	private final static String DELIMIT ="\u001b[0m"; //delimits the range of a color
	private int blue_maxWidth;
	private int length;
	public Blue(int blue_maxWidth, int length) {
		this.blue_maxWidth = blue_maxWidth;
		this.length = length;
	}
	
	public void blue() throws InterruptedException {
		for (int i = 0; i < length; i++) {
		
			for (int j = 20; j < blue_maxWidth; j++) {
			
				System.out.print(ESC + i + "G" + ESC + j + "d");
				System.out.print(BLUE_BACKGROUND + ' ' + DELIMIT);
			
				Thread.sleep(7);
			}
		}
	}
	
	
}
