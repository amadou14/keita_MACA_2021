package packDecorateur;

public class HouseBlendwithMilkAndMocha extends Beverage {

	public HouseBlendwithMilkAndMocha(float prix, String name) {
		super(prix, name);
		
	}

	public String getDescription() {
		String desc = "description de "+this.name;
		return desc;
	}

	public float cost() {
		
		return this.prix;
	}
	
}
