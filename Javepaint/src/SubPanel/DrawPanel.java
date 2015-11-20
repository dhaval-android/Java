package SubPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

import Figure.Figure;

public class DrawPanel extends JPanel{
	
	ArrayList<Figure> fifi = new ArrayList<Figure>();
	
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
		
		for(Figure current:fifi)
		{
			current.drawFigure(g);
		}
	}
	
}
