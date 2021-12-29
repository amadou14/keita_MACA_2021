package packDecorateur;

public class ExpressoWithSoyAndMocha extends Beverage {

	public ExpressoWithSoyAndMocha(float prix, String name) {
		super(prix, name);
	}

	public String getDescription() {
		String desc = "Description de "+this.name;
		return desc;
	}

	public float cost() {
		
		return this.prix;
	}
	
}
