
public class Voler extends AbstractDeplacement{

	public Voler(String name) {
		super(name,20);
	}

	public void deplacer(Position position) {
		System.out.println("["+this.getName_deplacement()+"]"+position);
	}
	
}
