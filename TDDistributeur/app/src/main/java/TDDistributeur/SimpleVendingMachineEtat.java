package TDDistributeur;

public  abstract  class SimpleVendingMachineEtat {
    public  abstract  void given(SimpleVendingMachineContext simpleVendingMachineContext , int argent) throws IncorrectEtatExcep;
    public abstract  void askingCoffee(SimpleVendingMachineContext simpleVendingMachineContext) throws IncorrectEtatExcep;
    public abstract  void askingThea(SimpleVendingMachineContext simpleVendingMachineContext) throws IncorrectEtatExcep;

}
