package listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInteraction implements KeyListener {

	@Override
	public void keyPressed(KeyEvent event) {
		int keyCode = event.getKeyCode();
		switch(keyCode) {
		case KeyEvent.VK_UP:
			
			break;
		case KeyEvent.VK_DOWN:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent event) {
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		
	}

}
