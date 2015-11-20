package SubFrame;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JInternalFrame;

import Frame.main;
import Infomation.Infomation;
import SubPanel.DrawPanel;

public class DrawInternalFrame extends JInternalFrame implements MouseListener, MouseMotionListener{
	
	private DrawPanel draw;
	private String mName;
	
	
	public DrawInternalFrame(String name)
	{
		super(name,true,true,true,true);
		
	
		this.mName=name;
		setSize(500,500);
		setBackground(Color.WHITE);
		
		draw = new DrawPanel();
		add(draw);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		
		setVisible(true);
	
	}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
			main.mainframe.setBottomLabel("X : "+e.getX()+" Y : "+e.getY());
		}


		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			main.mainframe.setBottomLabel("Out of Frame ");
		}


		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

}
