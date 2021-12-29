package implementDeco;

public class HouseBlend extends Beverage {

	public HouseBlend(String name, float prix,int quantite) {
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
