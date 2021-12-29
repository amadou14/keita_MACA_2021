package implementDeco;

public abstract class Decorateur implements BevarageInterface {
	protected BevarageInterface boisson;
	protected Ingredient ingredient;
	
	public Decorateur(BevarageInterface boisson,Ingredient ingredient){
		this.boisson = boisson;
		this.ingredient = ingredient;
	}
	
	public abstract String description();
	
	public float cost(){
		return (this.boisson.cost() + (this.ingredient.getQuantiteIng()* this.ingredient.getPrixIng()));
	}
	
}
