package com.Scroller.Game.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.sun.glass.events.KeyEvent;

public class  MenuState extends GameState {
	
	private String[] options = {"Kerfufle", "Options","Quit"};
	private int currentselection = 0;
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}
	public void init() {}
	public void tick() {
		
	}
	public void draw(Graphics g) {
		for(int i = 0; i < options.length; i++){
			if(i == currentselection){
				g.setColor(Color.green);
			}else{
				g.setColor(Color.black);
			}
			g.setFont(new Font("Arial", Font.PLAIN,72));
			g.drawString(options[i], GamePanel.WIDTH / 2 - 350, 100 + i * 150);
			
			
		}
	}
	public void keypressed(int k) {
		if(k == KeyEvent.VK_DOWN){
			currentselection++;
			if(currentselection >= options.length){
				currentselection = 0;
			}
		}else if (k == KeyEvent.VK_UP){
			currentselection--;
			if(currentselection < 0){
				currentselection = options.length -1;
				
			}
			
		}
		if(k == KeyEvent.VK_ENTER){
			if(currentselection == 0){
				//play
			}else if(currentselection == 1) {
				//help
			}else if(currentselection == 2){
				System.exit(0);
			}
		}
	}
	public void keyreleased(int k) {
		
	}

}
