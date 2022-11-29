package ExoHeritage;


public class Student {
	
	
	String nom;
	float note1;
	float note2;
	/**
	 * @param nom
	 * @param note1
	 * @param note2
	 */
	public Student(String nom, float note1, float note2) {
		this.nom = nom;
		this.note1 = note1;
		this.note2 = note2;
	}
	/**
	 * @return note1et2
	 */
	public float getmoy() {
		return (note1 + note2)/2;
	}
	
	/**
	 * @param note2 
	 * @param note1 
	 * @param moyenne
	 */
	
	public void setmoy(int note2, int note1) {
		this.note1 = note1;
		this.note2 = note2;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the note1
	 */
	public float getNote1() {
		return note1;
	}
	/**
	 * @param note1 the note1 to set
	 */
	public void setNote1(int note1) {
		this.note1 = note1;
	}
	/**
	 * @return the note2
	 */
	public float getNote2() {
		return note2;
	}
	/**
	 * @param note2 the note2 to set
	 */
	public void setNote2(int note2) {
		this.note2 = note2;
	}
	
	
	

}
