package ExoHeritage;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entrez votre nom");
		Scanner scan = new Scanner (System.in);
		Student student = new Student(scan.next(), scan.nextFloat(), scan.nextFloat());
		System.out.println(student.getmoy());
		System.out.println("etudiant: " +student.nom +" " + student.getmoy()+ " moyenne");
		scan.close();

	}

}
