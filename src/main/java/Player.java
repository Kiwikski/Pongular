import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player {

	private int posX = Pongular.WIDTH-20;
	private int posY = Pongular.HEIGHT / 2;
//	private int pongBondaryNegX = 0;
	private int pongBondaryPosY = Pongular.HEIGHT;
//	private int pongBondaryNegY = 0;
//	private int velX = 2;
//	private int velY = 2;
	private int lengthX = 10;
	private int lengthY = 50;	
	private Color color = Color.BLACK;
//	public int paddlePosX=posX;
//	public int paddlePosY=posY;
	
	public void paint(Graphics graphics) {
		graphics.setColor(color);
		graphics.fillRect(posX-lengthX/2, posY-lengthY/2, lengthX, lengthY);
	}

	public void update() {
		
//		
//		posX = posX + velX;
//		posY = posY + velY;
//		
//		if ( posX > pongBondaryPosX )
//			velX = velX * -1;
//		if ( posX < pongBondaryNegX )
//			velX = velX * -1;
//		if ( posY > pongBondaryPosY )
//			velY = velY * -1;
//		if ( posY < pongBondaryNegY )
//			velY = velY * -1;

	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public int getPosX() {
		return posX;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public int getPosY() {
		return posY;
	}

}
