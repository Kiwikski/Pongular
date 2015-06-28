import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	private int posX = Pongular.WIDTH / 2;
	private int posY = Pongular.HEIGHT / 2;
	private int pongBondaryPosX = Pongular.WIDTH;
	private int pongBondaryNegX = 0;
	private int pongBondaryPosY = Pongular.HEIGHT;
	private int pongBondaryNegY = 0; // The ball still bounces lower than the boundary of the screen.
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
		
		if ( posX > pongBondaryPosX )
			velX = velX * -1;
		if ( posX < pongBondaryNegX )
			velX = velX * -1;
		if ( posY > pongBondaryPosY )
			velY = velY * -1;
		if ( posY < pongBondaryNegY )
			velY = velY * -1;
		
//		System.out.printf("%d %d\n", posX, posY);
	}

}
