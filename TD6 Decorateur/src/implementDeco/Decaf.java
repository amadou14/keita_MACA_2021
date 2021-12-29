package implementDeco;
/**
 * 
 * @author Amadou
 *
 */

public class Decaf extends Beverage {

	public Decaf(String name, float prix,int quantite) {
		super(name, prix,quantite);
	
	}

	public String description() {
		String desc = "Description de "+this.name;
		return desc;
	}
	
	public float cost(){
		return this.prix * this.quantite;
	}

}
