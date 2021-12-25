

public abstract class AbstractAttaque {
	private String name;
	private int puissance;
	
	public AbstractAttaque(String name,int puissance){
		this.name = name;
		this.puissance = puissance;
	}
	
	public String getName() {
		return name;
	}

	public int getPuissance() {
		return puissance;
	}

	public abstract void attaquer(Unite unite);

	public String toString() {
		return " [name=" + name + ", puissance=" + puissance
				+ "]";
	}
	
	
}
