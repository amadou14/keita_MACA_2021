package TDDistributeur;

public class VendingMachineContext {
    private VendingMachineEtat actuel;
    private  int liquide;

    public VendingMachineContext(){
        actuel = VendingMachineEtatDebut.getInstance();
    }
    public void setEtat(VendingMachineEtat vendingMachineEtat){
        actuel = vendingMachineEtat;
    }

    public VendingMachineEtat getActuel() {
        return actuel;
    }

    public void setActuel(VendingMachineEtat actuel) {
        this.actuel = actuel;
    }

    public int getLiquide() {
        return liquide;
    }

    public void setLiquide(int liquide) {
        this.liquide = liquide;
    }
    public  void given(int argent ) throws IncorrectEtatExcep{
        actuel.given(this,argent);
    }
    public void askingThea() throws IncorrectEtatExcep{
        actuel.askingThea(this);
    }
    public  void askingCoffee() throws IncorrectEtatExcep{
        actuel.askingCoffee(this);
    }
    public int getRemboursement() throws IncorrectEtatExcep{
        return actuel.getRemboursement(this);
    }
}
