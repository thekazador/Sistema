package Frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Login {

	


	public static void LoginWindow() {

		class MyCanvas extends JComponent {
			private static final long serialVersionUID = 1L;
			public void paint(Graphics g) {
	            Graphics2D g2 = (Graphics2D) g.create();
	            RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	            g2.setRenderingHints(qualityHints);
				RoundRectangle2D r = new RoundRectangle2D.Double (0, 0, 522, 260, 50, 50);
				g2.setPaint(new Color(0, 0, 0, 30));
				g2.fill (r);
				
				Graphics2D g3 = (Graphics2D) g;
	            RenderingHints qualityHints2 = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            qualityHints2.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	            g3.setRenderingHints(qualityHints2);
				RoundRectangle2D r2 = new RoundRectangle2D.Double (10, 10, 502, 240, 45, 45);
				g3.setPaint(new Color(0x3b3b3b));
				g3.fill (r2);
			}
		}
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComponent elfondo = new MyCanvas();
		frame.add(elfondo);

		MotionPanel move = new MotionPanel(frame);

		move.setBounds(15, 15, 492, 230);
		move.setBackground(new Color(0, 0, 0, 0));

		frame.setSize(522, 260);
		frame.setUndecorated(true);

		frame.setVisible(true);
		frame.setBackground(new Color(0, 0, 0, 0));

		frame.add(move);
		
	}

}
