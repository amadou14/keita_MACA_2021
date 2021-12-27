package TDDistributeur;

public class SimpleVendingMachineContext {
    private SimpleVendingMachineEtat actuel;
    private  int CouArgent;


    public SimpleVendingMachineEtat getActuel() {
        return actuel;
    }

    public void setActuel(SimpleVendingMachineEtat actuel) {
        this.actuel = actuel;
    }

    public int getCouArgent() {
        return CouArgent;
    }

    public void setCouArgent(int couArgent) {
        CouArgent = couArgent;
    }
    public  SimpleVendingMachineContext() throws IncorrectEtatExcep {
        actuel = SimpleVendingMachineEtatDebut.ins.getInstance();
    }
    public  void setEtat(SimpleVendingMachineEtat machineEtat){
        actuel = machineEtat;
    }
    public  void given(int argent) throws IncorrectEtatExcep {
        actuel.given(this,argent);

    }
    public void askingCoffee() throws IncorrectEtatExcep{
        actuel.askingCoffee(this);
    }
    public  void askingThea() throws IncorrectEtatExcep{
        actuel.askingThea(this);
    }
}

