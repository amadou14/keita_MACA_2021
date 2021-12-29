package implementDeco;

public class DecorateurMilk extends Decorateur {
	
	public DecorateurMilk(BevarageInterface boisson,Ingredient ingredient) {
		super(boisson,ingredient);
		
	}

	public String description(){
		String desc = this.boisson.description()+" et Milk comme ingredient";
		return desc;
	}
}
