
public class Courir  extends AbstractDeplacement{

	public Courir(String name) {
		super(name,5);
	}
	
	/**
	 * Cette implement un algorithme de deplacement pour courir
	 */
	public void deplacer(Position position) {
		System.out.println("["+this.getName_deplacement()+"]"+position);
	}

	
	

}
