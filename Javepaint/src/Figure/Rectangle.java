package Figure;

import java.awt.Graphics;

public class Rectangle extends Figure{

	private int x,y,width,height;
	
	public Rectangle(int x,int y,int width, int height)
	{
		super(x,y,width, height);
		this.width=width;
		this.height=height;
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public void getSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFigure(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(x,y, width, height);
	}

}
