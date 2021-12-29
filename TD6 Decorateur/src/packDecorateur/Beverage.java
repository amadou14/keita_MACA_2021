package packDecorateur;

public abstract class Beverage {
	protected float prix;
	protected String name;
	private float prix_milk;
	private float prix_soja;
	private float prix_mocha;
	
	public Beverage(float prix,String name){
		this.prix = prix;
		this.name = name;
	}
	
	public abstract String getDescription();
	public abstract  float cost();
	
	public void setMilk(float prix){
		this.prix_milk = prix;
	}
	
	public void hasMilk(boolean doubleMilk){
		if(doubleMilk){
			this.prix += (2*this.prix_milk);
		}else{
			this.prix += this.prix_milk;
		}
	}
	
	public void hasSoy(boolean doubleSoy){
		if(doubleSoy){
			this.prix += (2*this.prix_soja);
		}else{
			this.prix += this.prix_soja;
		}
	}
	
	public void setSoy(float prix){
		this.prix_soja = prix;
	}
	
	public void SetMocha(float prix){
		this.prix_mocha = prix;
	}
	
	public void hasMocha(boolean doubleMocha){
		if(doubleMocha){
			this.prix += (2*this.prix_mocha);
		}else{
			this.prix += this.prix_mocha;
		}
	}
	

	
}
