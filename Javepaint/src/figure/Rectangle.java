package figure;

import java.awt.Graphics;

public class Rectangle extends Figure{

	private int width,height;
	
	
	public Rectangle(int width, int height)
	{
		super(width, height);
		this.width=width;
		this.height=height;
		
	}
	
	
	@Override
	public void getSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFigure(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(0, 0, width, height);
	}

}
