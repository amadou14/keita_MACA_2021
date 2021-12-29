package implementDeco;

public class DecorateurMocha extends Decorateur {

	public DecorateurMocha(BevarageInterface boisson,Ingredient ingredient) {
		super(boisson,ingredient);
		
	}

	public String description() {
		String desc = this.boisson.description()+" et Mocha comme ingredient";
		return desc;
	}

}
