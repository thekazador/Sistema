package Frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
// import javax.swing.JPanel;

public class Login {

	
	public void paint (Graphics g) {
	    Graphics2D g2 = (Graphics2D) g;
	    RoundRectangle2D r = new RoundRectangle2D.Double (5, 5, 480, 480, 20, 20);
	    g2.draw (r);
	}

	public static void LoginWindow() {

//		JPanel panel = new JPanel();

		JFrame frame = new JFrame("Sistema");
//		JPanel background = new JPanel();
		MotionPanel move = new MotionPanel(frame);

		move.setBounds(15, 15, 480, 480);
		move.setBackground(new Color(0, 0, 0, 0));

		frame.setSize(510, 510);
		frame.setUndecorated(true);
		frame.setShape(new RoundRectangle2D.Double(5, 5, 500, 500, 20, 20));
		frame.setVisible(true);
		frame.setBackground(new Color(0, 0, 0, 80));

//		frame.getContentPane().add(new paint());
		frame.add(move);

//		frame.add(panel);
//		panel.setSize(384, 279);
//		panel.setOpaque(false);
//		panel.setBackground(new Color(0, 0, 0, 0));
		//JFrame.setDefaultLookAndFeelDecorated(true);
		//frame.getContentPane().setBackground(new Color(0, 0, 0, 50));
		//frame.setOpacity(0.55f);
		//com.sun.awt.AWTUtilities.setWindowOpacity(frame, 0.5f);
		//frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
