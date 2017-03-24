package Ingenieria;

import java.awt.Button;
import java.awt.Point;

public class Ordenamiento {
 
	public static boolean estaCerca(Point boton1, Point boton2) {
		return ((boton1.getX()-boton2.getX()<=50)
				&& (boton1.getX()-boton2.getX()>=-50)
				&& (boton1.getY()-boton2.getY()<=50)
				&& (boton1.getY()-boton2.getY()>=-50)
				&& ((boton1.getX()==boton2.getX()
				|| boton1.getY()==boton2.getY())));
	}
	
	
	public static void presionar(Button b1, Button b2) {
		if(Ordenamiento.estaCerca(b1.getLocation(), b2.getLocation())){
		
			Point aux = b2.getLocation();
			
			b2.setLocation(b1.getLocation());
			b1.setLocation(aux);
		}
	}
}
