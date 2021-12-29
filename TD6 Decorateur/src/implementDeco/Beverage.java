package implementDeco;

public  abstract class Beverage implements BevarageInterface {
	protected float prix;
	protected String name;
	protected int quantite;
	
	public Beverage(String name,float prix,int quantite){
		this.name = name;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public abstract String description();
	
	
}
