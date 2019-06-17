package swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class GreenPanel extends JPanel {
	public GreenPanel(int width, int height) {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setPreferredSize(new Dimension(width, height));
		setBackground(Color.GREEN);

		JButton button = new JButton("Click me!");
		button.addActionListener(e -> {
			System.out.println("clicked");
			System.out.println("hi");
		});

		add(button);
		add(new JLabel("Ein Label"));
		add(new JScrollBar());
	}
}
