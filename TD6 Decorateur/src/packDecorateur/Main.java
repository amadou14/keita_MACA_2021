package packDecorateur;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Beverage boisson = new Expresso(12,"Expresso");
		boisson.setMilk(5);
		boisson.hasMilk(true);
		
		System.out.println(boisson.getDescription());
		System.out.println("Prix total : $"+boisson.prix);
		

	}

}
