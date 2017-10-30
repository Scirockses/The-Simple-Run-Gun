package com.Scroller.Game.Main;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;



public class GamePanel extends JPanel implements Runnable,KeyListener {
	private int FPS = 60;
	private long TargetTime = 1000 / FPS;
	private GameStateManager gsm;
	
	
	private boolean isrunning = false;
	private Thread thread;
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public GamePanel() {
		addKeyListener(this);
		setFocusable(true);
		
		setPreferredSize (new Dimension(WIDTH,HEIGHT));
		Start();
		
	}
	
	
	public void Start() {
		
		isrunning = true;
		thread = new Thread(this);
		thread.start();
	}
	public void run(){
		long Start,Elapsed,Wait = 0;
		gsm = new GameStateManager();
		while(isrunning){
			Start = System.nanoTime();
			
			tick();
			repaint();
			
			Elapsed = System.nanoTime() - Start;
			Wait = TargetTime - Elapsed / 1000000;
			if (Wait <= 0){
			Wait = 5;
		}
		}
	try{
		Thread.sleep(Wait);
	}catch(Exception e){
		e.printStackTrace();
	}
		
		
	}
	public void tick() {
		gsm.tick();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.clearRect(0, 0, WIDTH, HEIGHT);
		gsm.draw(g);
	}

	
	public void keyPressed(KeyEvent e) {
	gsm.keypressed(e.getKeyCode());
		
	}


	public void keyReleased(KeyEvent e) {
	gsm.keyreleased(e.getKeyCode());
		
	}


	
	public void keyTyped(KeyEvent e) {}
		
	}

