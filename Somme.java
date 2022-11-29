package ExoHeritage;

import java.util.Scanner;

public class Somme {
	
	Scanner scan = new Scanner (System.in);
	
	private int n1 = scan.nextInt();
	private int n2 =scan.nextInt();
	

	public void sum(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
     /**
      * @return somme
      */
	
	public int getsomme() {
		return n1 +n2;
	}
	
	public void setn3(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}


	/**
	 * @return the n1
	 */
	public int getN1() {
		return n1;
	}


	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(int n1) {
		this.n1 = n1;
	}


	/**
	 * @return the n2
	 */
	public int getN2() {
		return n2;
	}


	/**
	 * @param n2 the n2 to set
	 */
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	



}
