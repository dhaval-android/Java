package SubFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TopMenu extends JMenuBar{
	
	private JMenu menu1;
	private JMenuItem menu1_item1,menu1_item2,menu1_item3,menu1_item4;
	private JMenu menu2;
	private JMenuItem menu2_item1,menu2_item2,menu2_item3,menu2_item4;
	private JMenu menu3;
	private JMenuItem menu3_item1,menu3_item2,menu3_item3,menu3_item4;
	private JMenu menu4;
	private JMenuItem menu4_item1,menu4_item2,menu4_item3,menu4_item4;
	
	public TopMenu()
	{
		menu1 = new JMenu("����");
		menu1_item1 = new JMenuItem("�޴�1-1");
		menu1_item2 = new JMenuItem("�޴�1-2");
		menu1_item3 = new JMenuItem("�޴�1-3");
		menu1_item4 = new JMenuItem("�޴�1-4");
		menu1.add(menu1_item1);
		menu1.add(menu1_item2);
		menu1.add(menu1_item3);
		menu1.add(menu1_item4);
		this.add(menu1);
		
		menu2 = new JMenu("����");
		menu2_item1 = new JMenuItem("�޴�2-1");
		menu2_item2 = new JMenuItem("�޴�2-2");
		menu2_item3 = new JMenuItem("�޴�2-3");
		menu2_item4 = new JMenuItem("�޴�2-4");
		menu2.add(menu2_item1);
		menu2.add(menu2_item2);
		menu2.add(menu2_item3);
		menu2.add(menu2_item4);
		this.add(menu2);
		
		menu3 = new JMenu("����"
				+ "");
		menu3_item1 = new JMenuItem("�޴�3-1");
		menu3_item2 = new JMenuItem("�޴�3-2");
		menu3_item3 = new JMenuItem("�޴�3-3");
		menu3_item4 = new JMenuItem("�޴�3-4");
		menu3.add(menu3_item1);
		menu3.add(menu3_item2);
		menu3.add(menu3_item3);
		menu3.add(menu3_item4);
		this.add(menu3);
		
	}

}
