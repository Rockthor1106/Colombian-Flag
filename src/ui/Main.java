package ui;

import model.ColombianFlag;

public class Main {
	
	public final static String ESC   = "\u001b[";

	public static void main(String[] args) throws InterruptedException {
		System.out.println(ESC + "2J"); //clear console
		new ColombianFlag();

	}
}