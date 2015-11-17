package Frame;

import java.awt.Color;
import Infomation.Infomation;
import javax.swing.JFrame;

public class main {
	
	public static MainFrame mainframe ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mainframe = new MainFrame(Infomation.PROGRAM_NAME);
		mainframe.setBackground(Color.DARK_GRAY);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setSize(Infomation.PROGRAM_WIDTH,Infomation.PROGRAM_HEIGHT);
		mainframe.setVisible(true);
		
	}

}
