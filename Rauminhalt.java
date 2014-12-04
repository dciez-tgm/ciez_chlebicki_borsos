package A07;

public class Rauminhalt{
	int grundflaeche;
	int hoehe;
	int a;
	int b;
	public Rauminhalt(int grundflaeche, int hoehe, int a, int b){
		this.grundflaeche = grundflaeche;
		this.hoehe = hoehe;
		this.a = a;
		this.b = b;
	}
	public int pyramide(int grundflaeche, int hoehe){
		int v = ((1/3)*grundflaeche*hoehe);
		return v;
	}
	public int kegel(int grundflaeche, int hoehe){
		int v = ((1/3)*grundflaeche*hoehe);
		return v;
	}
	public int quader(int hoehe, int a, int b){
		int v = (hoehe*a*b);
		return v;
	}
}
