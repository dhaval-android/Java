package SubFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RightDownPanel extends JPanel{

	private JButton newButton;
	private JButton deleteButton;
	private JButton allButton;
	
	
	public RightDownPanel()
	{
		this.setBackground(Color.YELLOW);
		
		newButton = new JButton("new");
		deleteButton = new JButton("delete");
		allButton = new JButton("all");
		System.out.printf(" x : %d , y : %d \n" , getWidth(), getHeight() );
		newButton.setSize( 60, 25);
		deleteButton.setSize( 60, 25);
		allButton.setSize( 60, 25);
		
		this.add(newButton);
		this.add(deleteButton);
		this.add(allButton);
		
		newButton.addActionListener( new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"NEW BUTTON!");
				
			}
		}
		);
		
		deleteButton.addActionListener( new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"DELETE BUTTON!");
				
			}
		}
		);
		
		allButton.addActionListener( new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"ALL BUTTON!");
				
			}
		}
		);
	}

}
