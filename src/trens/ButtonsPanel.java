package trens;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel
{
	//JButton launchButton;
	JComboBox velocityComboBox;
	JButton	launchRightTrain;
	JButton launchLeftTrain;
	Dimension size;
	public ButtonsPanel()
	{
		this.setLayout(null);
		new JPanel();
		this.setBackground(Color.cyan);
		System.out.println("buttons panel");
		size = new Dimension((int) (500),
				(int) (400));
		this.setPreferredSize(size);
		this.setSize(size);
		
		
		
		ActionListener actLisLB = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("left pressed");
			}
		};
		ActionListener actLisRB = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("right pressed");
			}
		};
		
		this.launchLeftTrain = new JButton("LaunchLeft");
		this.launchLeftTrain.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.launchLeftTrain.addActionListener(actLisLB);
		this.launchLeftTrain.setVisible(true);
		this.launchLeftTrain.setBounds(0, 0, 150, 50);
		this.add(launchLeftTrain);
		this.launchLeftTrain.setVisible(true);
		this.launchRightTrain = new JButton("LaunchRight");
		this.setAlignmentX(CENTER_ALIGNMENT);
		this.launchRightTrain.setBounds(0, 60, 150, 50);
		this.launchRightTrain.addActionListener(actLisRB);
		this.add(launchRightTrain);
		this.velocityComboBox = new JComboBox<Float>();
		this.velocityComboBox.addItem(30);
		this.velocityComboBox.addItem(40);
		this.velocityComboBox.addItem(60);
		this.velocityComboBox.setBounds(200, 0, 100, 50);
		this.add(this.velocityComboBox);
		final JLabel l1 = new JLabel(
				"Welcome to War. Enter the name of each player:");
		l1.setMaximumSize(new Dimension(300, 50));
		this.add(l1);
		this.setVisible(true);
		this.setOpaque(true);
	}
	
}
