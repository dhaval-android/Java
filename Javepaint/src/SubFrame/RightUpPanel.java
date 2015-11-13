package SubFrame;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JPanel;
import java.util.EventListener;	//AWT�� event�� ����ִ� ���
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Panel;

public class RightUpPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	public RightUpPanel()
	{
		this.setBackground(Color.RED);

		this.setLocation(240,0);	//������ ������ ���� �г���ġ�� �������� �����ϴ� �޼ҵ�(X,Y������ ����)
		this.setSize(240,300); //�г� ����� ����!
		this.setVisible(true);
		
		this.setLayout(new GridLayout(4,1));	//���� Panel�� ��ġ���¸� GirdLayout(1,4)���·� �����Ѵ�.
		
		Panel p1 = new Panel();		//�ǳ� �ȿ��� ���ο� �ǳ� 4������
		p1.setBackground(Color.BLACK);
		Panel p2 = new Panel();		//�ǳ��� �Ű������� ������ ���̾ƿ������̴�.
		p2.setBackground(Color.DARK_GRAY);
		Panel p3 = new Panel();
		p3.setBackground(Color.GREEN);
		Panel p4 = new Panel();
		p4.setBackground(Color.PINK);
		
		this.add(p1);		//�ǳھȿ� 4���� �ǳ��� �ٿ� ������ �����Ѵ�.
		this.add(p2);		//�ڿ������� ����1ĭ ����4ĭ���� ����� �߰��ȴ�.
		this.add(p3);
		this.add(p4);
		
	}
}
