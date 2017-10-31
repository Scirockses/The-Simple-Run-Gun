package com.Scroller.Game.GameState;

import java.awt.Graphics;

import com.Scroller.Game.Entities.Player;

public class LevelState extends GameState {
	private Player player;

	public LevelState(GameStateManager gsm) {
		super(gsm);
		
	}
	public void init() {	
		player = new Player(400,400,30,30);
	}
	
	public void tick() {	
		player.tick();
	}
	
	public void draw(Graphics g) {	
		player.draw(g);
	}
	
	public void keypressed(int k) {	
		player.keypressed(k);
	}
	
	public void keyreleased(int k) {	
		player.keyreleased(k);
	}

}
