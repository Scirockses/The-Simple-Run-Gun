package com.Scroller.Game.Main;

import java.awt.Graphics;
import java.util.Stack;

public class GameStateManager {
	private Stack<GameState> States;

	public GameStateManager(){
		States = new Stack<GameState>();
		States.push(new MenuState(this));
	}
	
	
	public void tick(){
		States.peek().tick();
	}
	public void draw(Graphics g){
		States.peek().draw(g);
	}
	public void keypressed(int k){
		States.peek().keypressed(k);
	}
	public void keyreleased(int k){
		States.peek().keyreleased(k);
	}
}
