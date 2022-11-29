package ExoHeritage;

public class Rectangle {
	
	int a;
	int b;
	
	public void surface(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
    /**
     * @return surface
     */
	
	public int getAB() {
		return a*b;
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

}
