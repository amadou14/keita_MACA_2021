package packDecorateur;

public class DecafWithMilkAndSoy extends Beverage{

	public DecafWithMilkAndSoy(float prix, String name) {
		super(prix, name);
		
	}

	public String getDescription() {
		String desc = "Description de "+this.name;
		return desc;
	}

	public float cost() {
		
		return prix;
	}

}
