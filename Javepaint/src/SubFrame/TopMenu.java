package SubFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Frame.main;
import Infomation.Infomation;

public class TopMenu extends JMenuBar{
	
	private JMenu fileMenu;
	private JMenuItem mkDrawPanel,open,save,exit;
	private JMenu menu2;
	private JMenuItem menu2_item1,menu2_item2,menu2_item3,menu2_item4;
	private JMenu menu3;
	private JMenuItem menu3_item1,menu3_item2,menu3_item3,menu3_item4;

	
	public TopMenu()
	{
		this.setBackground(Color.WHITE);
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		mkDrawPanel = new JMenuItem("New DrawPanel");
		mkDrawPanel.setMnemonic('N');
		mkDrawPanel.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int DrawFrameCnt= Infomation.getInstance().getDrawFrame_Count();
				Infomation.getInstance().addDrawFrame_Count();
				main.mainframe.addDrawFrame(""+DrawFrameCnt+"번쨰 그림판");
				
			}
		});
		
		open = new JMenuItem("Open");
		open.setMnemonic('O');
		open.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Open Command");
			}
			
		});
		
		
		save = new JMenuItem("Save");
		save.setMnemonic('S');
		save.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Save Command");
			}
			
		});
		
		exit = new JMenuItem("Exit"); 
		exit.setMnemonic('E');
		exit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		fileMenu.add(open);
		fileMenu.add(mkDrawPanel);
		fileMenu.add(save);
		fileMenu.add(exit);
		this.add(fileMenu);
		
		menu2 = new JMenu("Edit");
		menu2_item1 = new JMenuItem("메뉴2-1");
		menu2_item2 = new JMenuItem("메뉴2-2");
		menu2_item3 = new JMenuItem("메뉴2-3");
		menu2_item4 = new JMenuItem("메뉴2-4");
		menu2.add(menu2_item1);
		menu2.add(menu2_item2);
		menu2.add(menu2_item3);
		menu2.add(menu2_item4);
		this.add(menu2);
		
		menu3 = new JMenu("Help");
		menu3_item1 = new JMenuItem("메뉴3-1");
		menu3_item2 = new JMenuItem("메뉴3-2");
		menu3_item3 = new JMenuItem("메뉴3-3");
		menu3_item4 = new JMenuItem("메뉴3-4");
		menu3.add(menu3_item1);
		menu3.add(menu3_item2);
		menu3.add(menu3_item3);
		menu3.add(menu3_item4);
		this.add(menu3);
		
	}

}
