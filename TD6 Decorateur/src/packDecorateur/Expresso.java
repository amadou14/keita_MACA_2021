package packDecorateur;

public class Expresso extends Beverage{

	public Expresso(float prix,String name) {
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
