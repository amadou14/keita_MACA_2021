
public class Canon extends AbstractAttaque{

	public Canon(String name) {
		super(name, 5);
		
	}

	public void attaquer(Unite unite) {
		unite.setView(this.getPuissance());
		
	}

}
