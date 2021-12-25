
public abstract class AbstractDeplacement {
	private String name_deplacement;
	private int vitesse;
	
	public AbstractDeplacement(String name,int vitesse){
		this.name_deplacement = name;
		this.vitesse = vitesse;
	}
	
	public String getName_deplacement(){
		return this.name_deplacement;
	}
	
	public abstract void deplacer(Position position);

	public String toString() {
		return "[name_deplacement=" + name_deplacement
				+ ", vitesse=" + vitesse + "]";
	}
	
	
	
}
