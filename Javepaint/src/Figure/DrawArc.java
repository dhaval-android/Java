package Figure;

import java.awt.Graphics;

public class DrawArc extends Figure{

	private int x,y,width,height,startAngle,rotateAngle;
	
	public DrawArc(int x,int y,int width, int height,int startAngle,int rotateAngle)
	{
		super(x, y, width, height);
		this.x = x;
		this.y = y;
		this.width=width;
		this.height=height;
		
	}
	
	
	@Override
	public void getSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFigure(Graphics g) {
		
	}

}
