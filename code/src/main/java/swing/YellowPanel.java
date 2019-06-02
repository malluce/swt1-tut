package swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class YellowPanel extends JPanel {

	public YellowPanel(int width, int height) {
		setBackground(Color.YELLOW);
		setPreferredSize(new Dimension(width, height));
		add(new JTextField("Standard-Text"));
	}
}
