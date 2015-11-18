package SubFrame;

import java.awt.Color;

import javax.swing.JInternalFrame;

import SubPanel.ColorPanel;

public class RightUpInternalFrame extends JInternalFrame{
	
	public RightUpInternalFrame()
	{
		super("RightUp",true,false,false,true);
		setSize(300,350);
		setBackground(Color.WHITE);
		
		
		ColorPanel colorPanel = new ColorPanel();
		this.add(colorPanel);
		
		setVisible(true);
	}

}
