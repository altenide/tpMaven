package fr.glitp1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MonComposant extends JComponent implements MouseListener, Observer
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Graphics2D g2d;	
	IModel model;
	IController controller;
	
	String mTexte;
	
	public MonComposant(IModel im, IController ic) {
		mTexte = new String("Hello");
		model = im;
		controller = ic;
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Dimension d = getSize();

		g2d = (Graphics2D) g;


		g2d.setColor(Color.RED);
		Rectangle2D rect2D = new Rectangle(0+10, 0+10, d.width-10, d.height-10);
		g2d.fill(rect2D);


		g2d.setFont(new Font("Arial", Font.BOLD, 14));
		g2d.setColor(Color.WHITE);
		
		// TODO: utilisation des données du IModel pour l'affichage
		g2d.drawString( mTexte , 20, 34);
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		// TODO: vérifier si un quartier de camembert a été selectionné 
		// et renvoyer vers le controlleur 
		mTexte = "Mouse at "+arg0.getX()+"x"+arg0.getY();
		repaint();
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

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}