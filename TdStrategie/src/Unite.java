
public class Unite {
	private String name_unite;
	private int view_unite = 100;
	private AbstractAttaque special_combat;
	private AbstractDeplacement stra_deplacement;
	
	public Unite(String name){
		this.name_unite = name;
	}
	public void setSpecial_combat(AbstractAttaque sp_combat){
		this.special_combat = sp_combat;
	}
	
	public void setStrat_deplacement(AbstractDeplacement strat_dep){
		this.stra_deplacement = strat_dep;
	}
	
	public int getView(){
		return this.view_unite;
	}
	
	public void setView(int puissance){
		this.view_unite -= puissance;
	}
	
	public void combatre(Unite unite){
		this.special_combat.attaquer(unite);
		if(unite.getView() <= 0){
			System.out.println("Unity "+ unite.getName_unity() +" kelled");
		}
	}
	
	public void deplacer(Position position){
		this.stra_deplacement.deplacer(position);
	}
	
	public String getName_unity(){
		return this.name_unite;
	}
	public String toString() {
		return "Unite [name_unite=" + name_unite + ", view_unite=" + view_unite
				+ ", special_combat=" + special_combat + ", stra_deplacement="
				+ stra_deplacement + "]";
	}
	
	
	
}
