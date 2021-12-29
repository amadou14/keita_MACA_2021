package implementDeco;

public class Main {

	public static void main(String[] args) {
		//Instanciation d'un e boisson
		BevarageInterface expresso = new Expresso("Expresso",8,1);
		System.out.println(expresso.description());
		System.out.println(expresso.cost());
		
		//instanciation d'un ingredient
		Ingredient milk = new Ingredient("Milk", 2, 2);
		
		//decoration de boisson avec l'ingredient milk
		BevarageInterface expressowithMilk = new DecorateurMilk(expresso,milk);
		System.out.println(expressowithMilk.description());
		System.out.println(expressowithMilk.cost());
		
		
		//instanciation d'un ingredient
		Ingredient soja = new Ingredient("Soja", 5, 1);
		
		//decoration de expressowithMilk avec du soja
		BevarageInterface expressowithMilkWithSoy = new DecorateurSoy(expressowithMilk, soja);
		System.out.println(expressowithMilkWithSoy.description());
		System.out.println(expressowithMilkWithSoy.cost());
		
		//instanciation de d'un ingredient
		Ingredient Mocha = new Ingredient("Mocha", 3, 6);
		//decoration avec l'ingredient mocha
		BevarageInterface expressowithMilkWithSoyWithMocha = new DecorateurMocha(expressowithMilkWithSoy, Mocha);
		System.out.println(expressowithMilkWithSoyWithMocha.description());
		System.out.println(expressowithMilkWithSoyWithMocha.cost());
		
		
		
		
	}

}
