package GamePack;

import java.util.*;

public class Plateau {
	int longueur=10;
	int largeur=10;
	ArrayList<ArrayList<Integer>> surface = new ArrayList<ArrayList<Integer>>();
	
	double r=Math.random();
	double r1=Math.random();
	int x = (int) (r*longueur);
	int y = (int) (r1*largeur);
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Plateau() {
		for (int i=0;i<longueur;i++) {
			ArrayList<Integer> ligne = new ArrayList<>();
			for (int j=0;j<largeur;j++) {
				ligne.add(null);
			}
			surface.add(ligne);
		}
	}
	
}
