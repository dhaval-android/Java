package Frame;

import java.awt.Color;

import javax.swing.JDesktopPane;

import SubFrame.DrawInternalFrame;
import SubFrame.RightDownInternalFrame;
import SubFrame.RightUpInternalFrame;

public class MainDesktopPane extends JDesktopPane{
	
	private DrawInternalFrame drawInternalFrame;
	private RightUpInternalFrame rightUpInternalFrame;
	private RightDownInternalFrame rightDownInternalFrame;
	
	public MainDesktopPane()
	{
		this.setVisible(true);
		this.setBackground(Color.DARK_GRAY);
		this.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		
		
		
		drawInternalFrame = new DrawInternalFrame();
		rightUpInternalFrame = new RightUpInternalFrame();
		rightDownInternalFrame = new RightDownInternalFrame();
		
		
		
		rightUpInternalFrame.setLocation(1190, 0);
		rightDownInternalFrame.setLocation(1190,400);
		
		
		this.add(drawInternalFrame);
		this.add(rightUpInternalFrame);
		this.add(rightDownInternalFrame);

	}

}
