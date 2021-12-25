
public class Rouler extends AbstractDeplacement{

	public Rouler(String name) {
		super(name,10);
	}

	public void deplacer(Position position) {
		System.out.println("["+this.getName_deplacement()+"]"+position);
	}
	

}
