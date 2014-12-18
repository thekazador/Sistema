package Frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
				RoundRectangle2D r2 = new RoundRectangle2D.Double (10, 10, 432, 240, 45, 45);
				g3.setPaint(new Color(0x262626));
				g3.fill (r2);

				Graphics2D g4 = (Graphics2D) g;
	            RenderingHints qualityHints3 = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            qualityHints3.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	            g4.setRenderingHints(qualityHints3);
				RoundRectangle2D r3 = new RoundRectangle2D.Double (400, 10, 110, 240, 45, 45);
				g4.setPaint(new Color(0x30afd2));
				g4.fill (r3);

				Graphics2D g5 = (Graphics2D) g;
	            RenderingHints qualityHints4 = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	            qualityHints4.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	            g5.setRenderingHints(qualityHints4);
				RoundRectangle2D r4 = new RoundRectangle2D.Double (370, 10, 50, 240, 0, 0);
				g5.setPaint(new Color(0x262626));
				g5.fill (r4);

			}
		}
		
		

		
		//ImageIcon icon = new ImageIcon("img/line-sep.png");
		
		JFrame frame = new JFrame();
		JComponent elfondo = new MyCanvas();
		JLabel linesep = new JLabel();
		MotionPanel move = new MotionPanel(frame);

		linesep.setBounds(15, 75, 402, 2);		
		
        //linesep.setIcon(new ImageIcon(Image.class.getResource("/img/line-sep.png")));
		
        //ImageIcon(img.class.getResource("/img/line-sep.png")));
        

		move.setBounds(15, 15, 492, 230);
		move.setBackground(new Color(0, 0, 0, 0));
		
		//frame.add(elfondo);
		
		// start
		ImageIcon imageIcon = new ImageIcon(Image.class.getResource("/img/line-sep.png")); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(492, 2,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back

		linesep.setIcon(imageIcon);
		// end
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(522, 260);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		// frame.setBackground(new Color(0, 0, 0, 0));
		
		frame.add(linesep);
		frame.add(move);
		

		
	}

}
