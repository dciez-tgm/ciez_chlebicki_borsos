import java.lang.Math.PI;

public class Flaeche {
	
	public static double rechteck(double breite, double hoehe){
		double ausgabe = breite * hoehe;
		return ausgabe;
	}
	
	public static double kreis(double radius){
		double ausgabe = PI * radius^2;
		return ausgabe;
	}
	
	public static double dreieck(double laenge, double hoehe){
		double ausgabe = (laenge * hoehe) / 2;
		return ausgabe
	}
}
