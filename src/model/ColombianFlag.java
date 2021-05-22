package model;

import Threads.Blue;
import Threads.Red;
import Threads.Yellow;

public class ColombianFlag {
	private final static int yellow_maxWidth = 20; //width-yellow
	private final static int blue_maxWidth = 30;//width-blue, it is 30 because it must start after yellow
	   							               //the real blue width is 10
	private final static int red_maxWidth = 40;//width-red, this is the same blue's situation
	private final static int  length = 100;
	
	public ColombianFlag() throws InterruptedException {
		new Yellow(yellow_maxWidth, length).yellow();
		new Blue(blue_maxWidth, length).blue();
		new Red(red_maxWidth, length).red();
	}
	
}

