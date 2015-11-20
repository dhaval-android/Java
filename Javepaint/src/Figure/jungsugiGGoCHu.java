package Figure;

import java.awt.Graphics;
import java.util.Stack;

public class jungsugiGGoCHu extends Figure{

	private int width,height;
	
	
	public jungsugiGGoCHu(int width, int height)
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
		g.drawLine(0, 0, 1, 1);
	}

}
