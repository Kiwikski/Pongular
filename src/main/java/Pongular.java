import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pongular extends JPanel implements Runnable {

	private Player player1 = new Player();
	private Ball ball = new Ball();
	boolean running = true;
	private JFrame frame;
	private Canvas canvas;
	public final static int WIDTH = 640;
	public final static int HEIGHT = 360;
	private final Dimension CANVAS_SIZE = new Dimension(WIDTH, HEIGHT);
	private final long REFRESH_RATE = 1000 / 60;
	private final String TITLE = "Pong";

	public Pongular() {

		frame = new JFrame();
		frame.setSize(CANVAS_SIZE);
		setMinimumSize(CANVAS_SIZE);
		setPreferredSize(CANVAS_SIZE);
		setMaximumSize(CANVAS_SIZE);
		setBackground(Color.BLACK);

		frame.setLayout(new BorderLayout());
		frame.add(this, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(TITLE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);

	}

	public synchronized void start() {
		running = true;
		new Thread(this).start();

	}

	public synchronized void stop() {
		running = false;
		System.exit(0);
	}

	public void update() {
		ball.update(player1.paddlePosX,player1.paddlePosY);
		player1.update();
	}

	public void paintComponent(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, WIDTH, HEIGHT);

		ball.paint(graphics);
		player1.paint(graphics);
	}

	public static void main(String[] args) {
		Pongular pongular = new Pongular();
		pongular.start();
	}

	public void run() {

		while (running) {
			update();
			repaint();
			try {
				Thread.sleep(REFRESH_RATE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
