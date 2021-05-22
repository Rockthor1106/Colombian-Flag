package Threads;

public class Yellow {
	public final static String ESC   = "\u001b[";
	public final static String YELLOW_BACKGROUND = "\u001b[43m";
	private final static String DELIMIT ="\u001b[0m"; //delimits the range of a color
	
	private int yellow_maxWidth;
	private int length;
	
	public Yellow(int yellow_maxWidth, int length) {
		this.yellow_maxWidth = yellow_maxWidth;
		this.length = length;
		
	}

	public void yellow() throws InterruptedException {
		for (int i = 0; i < length; i++) {
			
			for (int j = 0; j < yellow_maxWidth; j++) {
				
				System.out.print(ESC + i + "G" + ESC + j + "d");
				System.out.print(YELLOW_BACKGROUND + ' ' + DELIMIT);
				
				Thread.sleep(5);
			}
		}
	}
}
