package packDecorateur;

public class Decaf extends Beverage {

	public Decaf(float prix,String name) {
		super(prix,name);
		
	}

	public String getDescription() {
		String desc = "autre description de "+this.name;
		return desc;
	}

	public float cost() {
		
		return this.prix;
	}

}
