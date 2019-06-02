package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MyDemoFrame extends JFrame {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 300;

	public MyDemoFrame() {
		setTitle("I'm the title."); // set the title
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // what happens on close?
		setSize(FRAME_WIDTH, FRAME_HEIGHT); // set size of the "root window"
		setLayout(new FlowLayout()); // default layout is BorderLayout

		JPanel pane = new GreenPanel(FRAME_WIDTH / 2, FRAME_HEIGHT);
		JPanel pane2 = new YellowPanel(FRAME_WIDTH / 2, FRAME_HEIGHT);

		add(pane);
		add(pane2);

		pack(); // layout subcomponents
		setResizable(false);
		setVisible(true);
	}
}
