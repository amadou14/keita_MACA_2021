
public class Missile extends AbstractAttaque {

	public Missile(String name) {
		super(name, 10);
		
	}

	public void attaquer(Unite unite) {
		unite.setView(this.getPuissance());
	}

}
