package ExoHeritage;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Premier nombre");
		System.out.println("Entrez la partie réelle: ");
		double r1 = scan.nextDouble();
		System.out.println("Entrez la partie imaginaire: ");
		double i1 = scan.nextDouble();
		Complex c1 = new Complex(r1,i1);
		
		System.out.println("Deuxieme nombre");
		System.out.println("Entrez la partie réelle");
		double r2 = scan.nextDouble();
		System.out.println("Entrez la partie imaginaire");
		double i2 = scan.nextDouble();
		Complex c2 = new Complex (r2, i2);
		
		// calculer la somme des deux nombres complexes c1 et c2
		Complex c = somme(c1,c2);
		
		System.out.println("La somme est: " + c.nbrélle + " + " + c.img +"i");

	}

	private static Complex somme(Complex c1, Complex c2) {
		// TODO Auto-generated method stub
		return null;
	}

}
