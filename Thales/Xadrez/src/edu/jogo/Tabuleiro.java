package edu.jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Tabuleiro extends JPanel implements MouseListener {
	private static final long serialVersionUID = -8717531967088399952L;
	
	char[][] tabuleiro = {
			{ 'T', 'C', 'B', 'Q', 'K', 'B', 'C', 'T' },
			{ 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
			{ 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
			{ 't', 'c', 'b', 'q', 'k', 'b', 'c', 't' }
	};
	
	char[] pecas = {'T', 'C', 'B', 'Q', 'K', 'P', 't', 'c', 'b', 'q', 'k', 'p'};
	String[] imageNames = {"TP", "CP", "BP", "QP", "KP", "PP", "TB", "CB", "BB", "QB", "KB", "PB"};
	BufferedImage[] images = new BufferedImage[12];

	private int largura;
	private int altura;
	
	private int linhaOrigem = -1;
	private int colunaOrigem = -1;
	
	public Tabuleiro() { 
		for (int i = 0; i < pecas.length; i++) { 
			char p = pecas[i];
			String nomeImagem = getImageName(p);
			try {
				images[i] = ImageIO.read( new File(nomeImagem) );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.addMouseListener( this );
	}
	
	public String getImageName( char peca ) {
		String nomeImagem = null;
		for (int i = 0; i < pecas.length; i++) { 
			if (peca == pecas[i]) { 
				nomeImagem = "imagens/" + imageNames[i] + ".PNG";
			}
		}
		System.out.println("Imagem a ser carregada : " + nomeImagem);
		return nomeImagem;
	}
	
	
	public int getPecaIndex( char peca ) {
		for (int i = 0; i < pecas.length; i++) { 
			if (peca == pecas[i]) { 
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void paint(Graphics g) {
		largura = getWidth() / 8;
		altura = getHeight() / 8;
		for (int lin = 0; lin < 8; lin++) {
			for (int col = 0; col < 8; col++) { 
				int x = largura * col;
				int y = altura * lin;
				
				if ( (lin + col) % 2 == 0 ) { 
					g.setColor( Color.DARK_GRAY );
				} else { 
					g.setColor( Color.WHITE );
				}
				g.fillRect(x,  y,  largura,  altura);
				
				char p = tabuleiro[lin][col];
				int i = getPecaIndex( p );
				if ( i != -1 ) {
					g.drawImage(images[i], x, y, largura, altura, null);
				}
				
				if (lin == linhaOrigem && col == colunaOrigem) {
					g.setColor(Color.BLUE);
					g.drawRect(x, y, largura, altura);
				}
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int col = e.getX() / largura;
		int lin = e.getY() / altura;
		if (linhaOrigem == -1) { 
			linhaOrigem = lin;
			colunaOrigem = col;
			System.out.println("Selecionado Lin : " + lin + "  Col : " + col);
		} else { 
			if (tabuleiro[linhaOrigem][colunaOrigem] != ' ') {
				tabuleiro[lin][col] = tabuleiro[linhaOrigem][colunaOrigem];
				tabuleiro[linhaOrigem][colunaOrigem] = ' ';
				linhaOrigem = -1;
				colunaOrigem = -1;
				System.out.println("Movido para Lin : " + lin + "  Col : " + col);
			} else { 
				linhaOrigem = -1;
				colunaOrigem = -1;
			}
		}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
