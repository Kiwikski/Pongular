import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	private int posX = Pongular.WIDTH / 2+250;// temporarily changed starting position to troubleshoot
	private int posY = Pongular.HEIGHT / 2 - 50;
	
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

	public void update(int paddlePosX,int paddlePosY) {
		
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
		
		// These statements control the collisions with the paddle of player1
		if ( posX >= paddlePosX-10 ){
			if(posY <=paddlePosY+25 ){
				if( posY >= paddlePosY - 25){// had to set the paddle offset manually to make it look different than the canvas edges
					velX = velX * -1;
					System.out.printf("1 is true\n");					
				}
			}
		}

			

//			if(posY>=paddlePosY)
//				System.out.printf("2 is true\n");
//				if(posY<=paddlePosY)
//					velX = velX * -1 ;
//					System.out.printf("3 is true\n");

		System.out.printf("%d %d\n", posX, posY);
	}

}
