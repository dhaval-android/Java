package SubFrame;
import SubFrame.DrawPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;	//flowLayout배치(한줄로 쭉배치하기위함)
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Button;
import java.util.EventListener;	//AWT의 event를 담고있는 헤더
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;


public class BottomPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	public BottomPanel()	//아래 패널 생성.
	{
		this.setBackground(Color.BLUE);
		super.setPreferredSize(new Dimension(550,50)); //패널 사이즈를 설정!
		
		DrawPanel DP = new DrawPanel();
		JLabel statusBar = new JLabel( "Mouse outside JPanel" );
		statusBar.setBackground(Color.GREEN);
		add( statusBar, BorderLayout.NORTH ); // add label to JFrame

	
		class MouseHandler implements MouseListener,MouseMotionListener 
		{
			public void mouseClicked( MouseEvent event )
			{
				statusBar.setText( String.format( "Clicked at [%d, %d]", 
				event.getX(), event.getY() ) );
			} // end method mouseClicked

			public void mousePressed( MouseEvent event )
			{
				statusBar.setText( String.format( "Pressed at [%d, %d]", 
						event.getX(), event.getY() ) );
			} // end method mousePressed

			public void mouseReleased( MouseEvent event )
			{
				statusBar.setText( String.format( "Released at [%d, %d]", 
						event.getX(), event.getY() ) );
			} // end method mouseReleased

			public void mouseEntered( MouseEvent event )
			{
				statusBar.setText( String.format( "Mouse entered at [%d, %d]", 
				event.getX(), event.getY() ) );
			} // end method mouseEntered
			
			public void mouseExited( MouseEvent event )
			{
				statusBar.setText( "Mouse outside JPanel" );
			} // end method mouseExited

			public void mouseDragged( MouseEvent event )
			{
				statusBar.setText( String.format( "Dragged at [%d, %d]", 
				event.getX(), event.getY() ) );
			} // end method mouseDragged

			public void mouseMoved( MouseEvent event )
			{
				statusBar.setText( String.format( "Moved at [%d, %d]", 
				event.getX(), event.getY() ) );
			} // end method mouseMoved
			
		}	 
	    MouseHandler handler = new MouseHandler(); 
	    DP.addMouseListener( handler );		//import한 DrawPanel의에 이번트핸들러 추가하기. 
	    DP.addMouseMotionListener( handler ); 
	}	
}//bottompanel