package Frame;

import java.awt.Color;

import javax.swing.JFrame;

import Information.Information;

public class main {
	
	public static MainFrame mainframe ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mainframe = new MainFrame(Information.PROGRAM_NAME);
		mainframe.setBackground(Color.DARK_GRAY);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setSize(Information.PROGRAM_WIDTH,Information.PROGRAM_HEIGHT);
		mainframe.setVisible(true);
	
	}

}
