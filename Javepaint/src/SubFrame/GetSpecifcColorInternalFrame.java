package SubFrame;

import java.awt.Color;

import javax.swing.JColorChooser;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Frame.main;
import Infomation.Infomation;

public class GetSpecifcColorInternalFrame extends JInternalFrame implements ChangeListener{
	
	JColorChooser colorChooser;
	public GetSpecifcColorInternalFrame()
	{
		super("GetSpecifcColorInternalFrame",true,true,true,true);
		setBackground(Color.DARK_GRAY);
		setSize(300,300);
		setVisible(true);
				
		colorChooser = new JColorChooser(Infomation.getInstance().getCurrentColor());
		colorChooser.getSelectionModel().addChangeListener(this);
		this.add(colorChooser);
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		Color newColor = colorChooser.getColor();
		Infomation.getInstance().setCurrentColor(newColor.getRed(), newColor.getGreen(), newColor.getBlue());
		main.mainframe.setBottomLabel(newColor);
	}

}
