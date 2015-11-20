package SubFrame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
import Frame.main;
import Infomation.Infomation;

public class TopMenu extends JMenuBar{
	
	private JMenu fileMenu;
	private JMenuItem mkDrawPanel,open,save,exit;
	private JMenu menu2;
	private JMenuItem menu2_item1,menu2_item2,menu2_item3,menu2_item4,save_another_name;
	private JMenu menu3;
	private JMenuItem inform,menu3_item2,menu3_item3,menu3_item4;

	
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
				int DrawFrameCnt = Infomation.getInstance().getDrawFrame_Count();	
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
		
		save_another_name = new JMenuItem("Save another name");
		save_another_name.setMnemonic('A');
		save_another_name.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				final JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(getParent());
				// TODO Auto-generated method stub
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
		fileMenu.add(save_another_name);
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
		inform = new JMenuItem("Information");
		inform.setMnemonic('I');
		
		inform.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
		
				JOptionPane.showMessageDialog(null,"Make by _ 구한모, 정수영, 전창익, 원도연","Information_Message"
						,JOptionPane.INFORMATION_MESSAGE);	//마지막 파라미터는 icon 		
			}
		});
		
		menu3_item2 = new JMenuItem("메뉴3-2");
		menu3_item3 = new JMenuItem("메뉴3-3");
		menu3_item4 = new JMenuItem("메뉴3-4");
		menu3.add(inform);
		menu3.add(menu3_item2);
		menu3.add(menu3_item3);
		menu3.add(menu3_item4);
		this.add(menu3);
		
		
		
		
	}

}
