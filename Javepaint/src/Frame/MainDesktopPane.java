package Frame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

import SubFrame.DrawInternalFrame;
import SubFrame.RightDownInternalFrame;
import SubFrame.RightUpInternalFrame;

public class MainDesktopPane extends JDesktopPane{
	
	private DrawInternalFrame drawInternalFrame;
	private RightUpInternalFrame rightUpInternalFrame;
	private RightDownInternalFrame rightDownInternalFrame;
	private ImageIcon backgrountIcon;

	
	public MainDesktopPane()
	{
	
	
		this.setVisible(true);
		this.setBackground(Color.DARK_GRAY);
		this.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		
		backgrountIcon = new ImageIcon("resource/ui_1_01.png");
		
		

		drawInternalFrame = new DrawInternalFrame();
		rightUpInternalFrame = new RightUpInternalFrame();
		rightDownInternalFrame = new RightDownInternalFrame();
		
		
		
		rightUpInternalFrame.setLocation(1190, 0);
		rightDownInternalFrame.setLocation(1190,400);

		

		this.add(drawInternalFrame);
		this.add(rightUpInternalFrame);
		this.add(rightDownInternalFrame);

	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		g.drawImage(backgrountIcon.getImage(), 300, 50, null);
	}

}
