package implementDeco;
/**
 * 
 * @author Amadou
 * Cette classe reprente l'ingredient constituée d'un nom, d'un prix et une 
 * quantité
 */

public class Ingredient {
	private String name;
	private float prix;
	private int quantite;
	
	public Ingredient(String name, float prix, int quantite){
		this.name = name;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public String getNameIng(){
		return this.name;
	}
	
	public float getPrixIng(){
		return this.prix;
	}
	
	public int getQuantiteIng(){
		return this.quantite;
	}
	
}
