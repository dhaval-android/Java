package Frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import SubFrame.BottomLabel;
import SubFrame.LeftPanel;
import SubFrame.TopMenu;



public class MainFrame extends JFrame{

	private LeftPanel leftPanel;
	private BottomLabel bottomLabel;
	private TopMenu menuBar;




	
	public MainFrame()
	{
	
		//�г� ��ü ����
		leftPanel = new LeftPanel();
		bottomLabel = new BottomLabel("�ٴ�");
		
		
		
		//�г� ��ġ�� ����
		this.add(leftPanel, BorderLayout.WEST);
		this.add(bottomLabel, BorderLayout.SOUTH);
		

		//�޴� ����
		menuBar = new TopMenu();
		this.setJMenuBar(menuBar);

		
		
		MainDesktopPane mainDesktopPane= new MainDesktopPane();
		this.add(mainDesktopPane);
	}
	
}
