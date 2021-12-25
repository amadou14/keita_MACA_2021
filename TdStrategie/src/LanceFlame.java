
public class LanceFlame extends AbstractAttaque {

	public LanceFlame(String name) {
		super(name, 2);
	}

	public void attaquer(Unite unite) {
		unite.setView(this.getPuissance());
	}

}
