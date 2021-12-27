package TDDistributeur;

public abstract  class VendingMachineEtat {
    public  abstract  void  given(VendingMachineContext c ,int argent) throws  IncorrectEtatExcep;
    public  abstract  void askingCoffee(VendingMachineContext c) throws  IncorrectEtatExcep;
    public  abstract  void askingThea(VendingMachineContext c) throws IncorrectEtatExcep;
    public  int getRemboursement(VendingMachineContext context) throws IncorrectEtatExcep{
        int tampon  = context.getLiquide();
        context.setLiquide(0);
        context.setEtat(VendingMachineEtatDebut.getInstance());
        return tampon;
    }


}
