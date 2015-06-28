import java.awt.Rectangle;


public class Collision {
	
	
	
	public boolean areColliding(Rectangle rect1,Rectangle rect2) {
		return rect1.intersects(rect2);
	}
}
