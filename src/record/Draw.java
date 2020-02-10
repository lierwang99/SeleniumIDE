package record;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

public class Draw {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Runtime rt = Runtime.getRuntime();
		rt.exec("C:\\Windows\\system32\\mspaint.exe");
		
		Robot rb = new Robot();
		int x = 500;
		int y = 600;
		for( ; y>=x ;y--) {
			if(y>x){
				rb.mouseMove(x, y);
				rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				Thread.sleep(10);
				rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				
			}
			if(y==x) {//x=y=500;
				for(;x<=700;x++) {
					if(x<700) {
						rb.mouseMove(x, y);
						rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
						Thread.sleep(10);
						rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					}
					if(x==700) {
						for(;y<=600;y++) {
							if(y<600) {
								rb.mouseMove(x, y);
								rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
								Thread.sleep(10);
								rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
							}
							if(y==600) {
								for(;x>=500;x--) {
									if(x==500) {
										break;
									}
									if(x>500) {
										rb.mouseMove(x, y);
										rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
										Thread.sleep(10);
										rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
									}
									
									break;
								}
								break;
							}
							break;
						}
						break;
						
					}
					break;
				}
				
			}
		}
		

	}

}
