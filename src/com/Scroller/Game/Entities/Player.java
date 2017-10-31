package com.Scroller.Game.Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import com.Scroller.Game.Main.GamePanel;


public class Player extends Rectangle {
	private boolean right = false, left = false;
	private static final long serialVersionUID = 1L;
	public Player(int x, int y, int width, int height){
		setBounds(x,y,width,height);
	}
	public void tick(){
		if (right){
			System.out.println("right");
			x++;
		}
		if (left) {
			System.out.println("left");
		}

	}
	public void draw(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
	}
	
	public void keypressed(int k){
		if(k == KeyEvent.VK_D) right = true;
		if(k == KeyEvent.VK_A) left = true;
	}
	public void keyreleased(int k){
		if(k == KeyEvent.VK_D) right = false;
		if(k == KeyEvent.VK_A) left = false;
	}
}
