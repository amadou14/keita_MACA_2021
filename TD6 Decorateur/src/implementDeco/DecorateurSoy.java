package implementDeco;

public class DecorateurSoy extends Decorateur{

	public DecorateurSoy(BevarageInterface boisson,Ingredient ingredient) {
		super(boisson, ingredient);
	}

	public String description() {
		String desc = this.boisson.description()+" et Soja comme ingredient";
		return desc;
	}

}
