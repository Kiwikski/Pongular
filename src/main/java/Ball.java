import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {

	private int posX = Pongular.WIDTH / 2;// temporarily changed starting position to troubleshoot
	private int posY = Pongular.HEIGHT / 2;
	private int speed = 2;
	private double angle = Math.PI/2;
	private int velX = 2;
	private int velY = 2;
	private int diameter = 20;
	private Color color = Color.BLACK;

	//boundaries of the field/canvas
	private int pongBondaryPosX = Pongular.WIDTH;
	private int pongBondaryNegX = 0;
	private int pongBondaryPosY = Pongular.HEIGHT;
	private int pongBondaryNegY = 0; // The ball still bounces lower than the boundary of the screen.
		
	public void paint(Graphics graphics) {
		graphics.setColor(color);
		graphics.fillOval(posX - diameter / 2, posY - diameter / 2, diameter,
				diameter);
	}

	public void update() {
		
		posX = posX + velX;
		posY = posY + velY;
		
		// These statements control the collisions with the boundaries
		if ( posX > pongBondaryPosX )
			velX = velX * -1;
		if ( posX < pongBondaryNegX )
			velX = velX * -1;
		if ( posY > pongBondaryPosY )
			velY = velY * -1;
		if ( posY < pongBondaryNegY )
			velY = velY * -1;
	}
	
	public void checkCollision(Player player) {
		// These statements control the collisions with the paddle of player1
		if ( posX >= player.getPosX()-diameter/2 ){
			if((posY <=player.getPosY()+25 ) && (posY >= player.getPosY() - 25)){
					velX = velX * -1;
			} else {
			// if ball intersects top quarter of player, bounce back at different rate
			}
		}
	}
	
	public void setPosX(int asdf) {
		this.posX = asdf;
	}
	public int getPosX() {
		return this.posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getPosY() {
		return this.posX;
	}
}
