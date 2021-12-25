
public class Mitraillete extends AbstractAttaque {

	public Mitraillete(String name) {
		super(name, 2);
	}

	public void attaquer(Unite unite) {
		unite.setView(this.getPuissance());
	}
	
}
