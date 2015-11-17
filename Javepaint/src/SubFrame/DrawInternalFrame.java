package SubFrame;

import java.awt.Color;

import javax.swing.JInternalFrame;

public class DrawInternalFrame extends JInternalFrame{
	
	public DrawInternalFrame()
	{
		super("Draw Frame",true,true,true,true);
		setSize(500,500);
		setBackground(Color.WHITE);
		setVisible(true);
	}

}
