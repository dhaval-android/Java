package Figure;

import java.awt.Graphics;

public abstract class Figure {
	
	private int x,y,width,height;
	
	public Figure(int x,int y,int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width=width;
		this.height=height;
	}
	
	
	public abstract void getSize();
	public abstract void drawFigure(Graphics g);
	
}
