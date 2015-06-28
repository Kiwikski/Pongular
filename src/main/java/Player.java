import java.awt.Color;
import java.awt.Graphics;

public class Player {

	private int posX = Pongular.WIDTH / 2;
	private int posY = Pongular.HEIGHT / 2;
//	private int pongBondaryPosX = Pongular.WIDTH;
//	private int pongBondaryNegX = 0;
//	private int pongBondaryPosY = Pongular.HEIGHT;
//	private int pongBondaryNegY = 0;
//	private int velX = 2;
//	private int velY = 2;
	private int lengthX = 50;
	private int lengthY = 50;	
	private Color color = Color.BLACK;

	public void paint(Graphics graphics) {
		graphics.setColor(color);
		graphics.fillRect(posX, posY, lengthX, lengthY);
	}

	public void update() {
//		
//		posX = posX + velX;
//		posY = posY + velY;
		
//		if ( posX > pongBondaryPosX )
//			velX = velX * -1;
//		if ( posX < pongBondaryNegX )
//			velX = velX * -1;
//		if ( posY > pongBondaryPosY )
//			velY = velY * -1;
//		if ( posY < pongBondaryNegY )
//			velY = velY * -1;
		
		System.out.printf("%d %d\n", posX, posY);
	}

}
