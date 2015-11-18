package SubPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Infomation.Infomation;

public class ColorPanel extends JPanel{
	
	
	public ColorPanel()
	{
		this.setLayout(new GridLayout(6,11));

		for(int i=0;i<6;i++){
			for(int j=0;j<11;j++)
			{
				Button temp = new Button();
				Color tempColor = null;
				switch(i)
				{
				case 0: tempColor= new Color(255,255/10*(j%11),0); break;
				case 1: tempColor= new Color(255,0,255/10*(j%11)); break;
				case 2: tempColor= new Color(255/10*(j%11),255,0); break;
				case 3: tempColor= new Color(0,255,255/10*(j%11)); break;
				case 4: tempColor= new Color(0,255/10*(j%11),255); break;
				case 5: tempColor= new Color(255/10*(j%11),255/10*(j%11),255); break;
				}
				
				temp.setSize(10, 10);
				temp.setBackground(tempColor);
				temp.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Button current = (Button)e.getSource();
						Color curColor=current.getBackground();
						
						Infomation.getInstance().setCurrentColor
						(curColor.getRed(), curColor.getGreen(), curColor.getBlue());
					}
					
				});
				this.add(temp);
			}
		}
		
	}
	
	
	

}
