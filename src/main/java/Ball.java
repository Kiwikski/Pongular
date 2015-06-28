import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	private int posX = Pongular.WIDTH / 2;
	private int posY = Pongular.HEIGHT / 2;
	private int velX = 2;
	private int velY = 2;
	private int diameter = 20;
	private Color color = Color.BLACK;

	public void paint(Graphics graphics) {
		graphics.setColor(color);
		graphics.fillOval(posX - diameter / 2, posY - diameter / 2, diameter,
				diameter);
	}

	public void update() {
		posX = posX + velX;
		posY = posY + velY;
	}

}
