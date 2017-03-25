package Ingenieria;

import java.awt.Button;
import java.awt.Point;
import java.util.Random;

public class Ordenamiento {	
 
	public static boolean estaCerca(Point boton1, Point boton2, int dist) {
		//controla que esten a una distancia corta y en alguno de sus ejes
		return ((boton1.getX()-boton2.getX()<=dist)
				&& (boton1.getX()-boton2.getX()>=-dist)
				&& (boton1.getY()-boton2.getY()<=dist)
				&& (boton1.getY()-boton2.getY()>=-dist)
				&& ((boton1.getX()==boton2.getX()
				|| boton1.getY()==boton2.getY())));
	}
	
	
	public static void presionar(Button b1, Button b2) {
		if(Ordenamiento.estaCerca(b1.getLocation(), b2.getLocation() ,b1.getHeight())){
		
			Point aux = b2.getLocation();
			
			b2.setLocation(b1.getLocation());
			b1.setLocation(aux);
		}
	}
	
	public static int[] desordenar(int[] ini){
		
		Random azar = new Random();
		
		int[] ret = new int[ini.length];
		
		if(ini.length-1<0) return ret;
		
		int corte = azar.nextInt(ini.length);
		
		ret[0] = ini[corte];
		
		if(ini.length-1==0) return ret;
		
		int[] siguiente = new int[ini.length-1];
		
		int j = 0;		
				
		for(int i=0; i<ini.length;i++){

			if(i!=corte){
				siguiente[j] = ini[i];
				j++;
			}
		}			
		
		int[] nuevo = desordenar(siguiente);
		
		j=1;
		
		for(int i=0;i<nuevo.length;i++){
			
			ret[j] = nuevo[i];
			j++;
		}
		
		return ret;
		
	}
	
	public static void main(String[] args) {
		
		int[] pos = new int[1];
		
		for(int i=0;i<pos.length;i++){
			
			pos[i] = i;
		}
		
		pos = desordenar(pos);
		
		for(int i=0;i<pos.length;i++){
			
			System.out.println(pos[i]);
		}
		
	}
	
	public static Point[] posicionar(int tam, int interv) {
		
		Point[] posiciones = new Point[tam];
		
		int[] orden = new int[tam];
		
		for(int i=0;i<tam;i++){
			
			orden[i] = i;
		}
		
		orden = desordenar(orden);
		
		int x = 0;
		int y = 0;
		
		int cont = 0;
		
		for(int i=0;i<tam;i++){
			
			posiciones[orden[i]]= new Point(x,y);
			
			x += 50;
						
			cont++;
			
			if(cont>interv-1){
				
				y += 50;
				x = 0;
				cont = 0;
			}
		
		}
		return posiciones;
	}
	
}
