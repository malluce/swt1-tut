package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MyDemoFrame extends JFrame {

	public MyDemoFrame() {
		setTitle("I'm the title."); // set the title
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // what happens on close?
		setSize(300, 300); // set size of the "root window"
		Container c = getContentPane();

		JPanel pane = new JPanel();
		pane.setBackground(Color.YELLOW);
		pane.setPreferredSize(new Dimension(300, 150));

		JButton button = new JButton("Click me!");
		button.addActionListener(e -> {
			System.out.println("clicked");
			System.out.println(pane);
		});

		pane.add(button);
		pane.add(new JTextField("Standard-Text"));
		c.add(pane);

		JPanel pane2 = new JPanel();
		pane2.setLayout(new BoxLayout(pane2, BoxLayout.PAGE_AXIS));
		pane2.setPreferredSize(new Dimension(300, 150));
		pane2.setBackground(Color.GREEN);
		pane2.add(button);
		pane2.add(new JLabel("Ein Label"));

		c.add(pane2);

		pack();
		setVisible(true);
	}
}
