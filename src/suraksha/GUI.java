package suraksha;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class GUI {
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTabbedPane tpane = new JTabbedPane();
	static JPanel upload = new JPanel();

	public static void main(String[] args) {
		frame.setSize(800,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Suraksha");
		
		placeComponents(panel, tpane);
		frame.add(panel);
		frame.add(tpane);
		frame.setBackground(Color.CYAN);
        frame.setVisible(true);
	}
	
	private static void placeComponents(JPanel panel, JTabbedPane tp) {
		panel.setLayout(null);
		tp.setPreferredSize(new Dimension(50,400));
		Font font = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 18);
		tp.setFont(font);
		
		tp.setBackground(new Color(83, 83, 83));
	    tp.setForeground(new Color(255, 255, 255));
        
		tp.addTab("Upload", upload);
		
	}
	
}
