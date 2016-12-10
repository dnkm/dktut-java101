package com.dktut.java101.project.etc;

import java.awt.*;

class Clock extends Frame
{
	int h=0;
	int m=0;
	int s=0;

	Graphics g;


	Clock(String title) {
		super(title);
		setBounds(100,100,300,300);
		setVisible(true);
		g = getGraphics();
	}

	Clock() {
		this("");
	}

	Clock(int h, int m, int s) {
		this("");
		this.h=h;
		this.m=m;
		this.s=s;
	}

	public void paint(Graphics g) {
		drawClock(150,150,150,50,100, s*6);
		drawClock(150,150,150,50,70, m*6);
		drawClock(150,150,150,50,50, h*30+m/2); // 60�� : 30�� = 1�� : x, 60x = 30
		g.drawString(h+":"+m+":"+s, 120, 280);
	}

	public void drawClock(int ox, int oy, int x, int y, int l, int angle) {
		x = ox + (int)(l*Math.sin(angle*Math.PI/180));
		y = oy - (int)(l*Math.cos(angle*Math.PI/180));

		g.drawLine(ox, oy, x, y);
	}

	public void start(){
		for(int i=0;true;i++) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}

			s++;
			if (i!=0 && s%60==0) m++;
			if (m==60 && s==60) h++;

			if (s==60) s=0;
			if (m==60) m=0;
			if (h==12) h=0;

			System.out.println(h+":"+m+":"+s);
		}
	}

	public static void main(String[] args) 
	{
		Clock f = new Clock(2,30,0);
		f.start();
	}
}
