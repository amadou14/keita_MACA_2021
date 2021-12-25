
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		AbstractAttaque Missile = new Missile("Missile");
		AbstractAttaque canon = new Canon("Canon");
		
		AbstractDeplacement voler = new Voler("Voler");
		
		//unité 1
		Unite helico1 = new Unite("Helicoptère 1");
		helico1.setSpecial_combat(Missile);
		helico1.setStrat_deplacement(voler);
		System.out.println(helico1);
		helico1.deplacer(new Position(10, 20));
		
		//unite 2
		Unite helico2 = new Unite("Helicoptère 2");
		helico2.setSpecial_combat(canon);
		helico2.setStrat_deplacement(voler);
		System.out.println(helico2);
		
		helico2.deplacer(new Position(20, 30));
		
		
		
		
		
		
		
		
		
		
	}

}
