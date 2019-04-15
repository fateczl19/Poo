package com.thales.graphinterface;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Drawing extends JPanel{
	public void paint(Graphics g){
		g.drawRect(25, 75, 125, 175);
	}
}
