package SubFrame;

import java.awt.Color;

import javax.swing.JInternalFrame;

import DrawPanel.DrawPanel;

public class DrawInternalFrame extends JInternalFrame{
	
	private DrawPanel draw;
	private String mName;
	
	
	public DrawInternalFrame(String name)
	{
		super(name,true,true,true,true);
		this.mName=name;
		setSize(500,500);
		setBackground(Color.WHITE);
		
		draw = new DrawPanel();
		add(draw);
		
		
		setVisible(true);
	}

}
