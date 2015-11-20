package Figure;

import java.awt.Graphics;

public abstract class Figure {
	
	private int width,height;
	
	public Figure(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
	
	
	public abstract void getSize();
	public abstract void drawFigure(Graphics g);
	
}
