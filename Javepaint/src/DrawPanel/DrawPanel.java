package DrawPanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	
	public DrawPanel()
	{
		setBackground(Color.red);
		setVisible(true);
	}
	
	
	
	@Override
	public void paintComponent(Graphics g)
	{
		
		int width = getWidth();
		int height = getHeight();
		
	}

}
