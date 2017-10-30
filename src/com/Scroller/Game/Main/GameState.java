package com.Scroller.Game.Main;

import java.awt.Graphics;

public abstract class GameState {

	protected GameStateManager gsm;
	public GameState(GameStateManager gsm){
		this.gsm = gsm;
		init();
	}
	public abstract void init();
	public abstract void tick();
	public abstract void draw(Graphics g);
	public abstract void keypressed(int k);
	public abstract void keyreleased(int k);
}
