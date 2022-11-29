package ExoHeritage;

public class Complex {
	
	
	double nbrélle, img;
	

	Complex (double réelle, double imaginaire) {
	
	this.nbrélle = réelle;
	this.img = imaginaire;
	
}
	
	public static Complex somme(Complex c1, Complex c2) {
		Complex c = new Complex (0, 0);
		c.nbrélle = c1.nbrélle + c2.nbrélle;
		c.img = c1.img + c2.img;
		return c;
	}
	
}
