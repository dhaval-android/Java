package SubFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	

	private int pointCount =0;
	private ArrayList<Point> points = new ArrayList<Point>();

	public DrawPanel()
	{
		this.setBackground(Color.WHITE);		

		addMouseMotionListener(new MouseMotionAdapter(){
				
				public void mouseDragged(MouseEvent event)
				{
						points.add(event.getPoint());
						pointCount++;
						repaint();
					
				}
			});
		
	}
	
	

	
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(Point pointss : points)
		{
			g.fillOval(pointss.x, pointss.y, 5, 5);
		}
	
	}
}
