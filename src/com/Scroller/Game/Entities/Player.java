package com.Scroller.Game.Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import com.Scroller.Game.Main.GamePanel;


public class Player {
	//bounds
	private double x, y;
	private int width,height;
	//jump and fall speed
	private double jumpspeed = 3, currentjumpspeed = jumpspeed, maxfallspeed = 7;
	private double currentfallspeed = .1;
	//movement booleans
	private boolean right = false, left = false, jumping = false, falling = false;
	public Player(double x, double y, int width, int height){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	public void tick(){
		if (right){
			x++;
		}
		if (left) {
			x--;
		}
		if (jumping){
			y -= currentjumpspeed;
			currentjumpspeed -= .1;
			if (currentjumpspeed <= 0){
				currentjumpspeed = jumpspeed;
				jumping = false;
				falling = true;
			}
		}
		if (falling){
			y += currentfallspeed;
			if (currentfallspeed < maxfallspeed){
				currentfallspeed += .2;
			}
			
		}

	}
	public void draw(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect((int)x, (int)y, width, height);
	}
	
	public void keypressed(int k){
		if(k == KeyEvent.VK_D) right = true;
		if(k == KeyEvent.VK_A) left = true;
		if(k == KeyEvent.VK_W | k == KeyEvent.VK_SPACE) jumping = true;
	}
	public void keyreleased(int k){
		if(k == KeyEvent.VK_D) right = false;
		if(k == KeyEvent.VK_A) left = false;
	}
}
