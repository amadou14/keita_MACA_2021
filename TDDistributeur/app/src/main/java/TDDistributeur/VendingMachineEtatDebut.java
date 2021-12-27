package TDDistributeur;

public class VendingMachineEtatDebut  extends  VendingMachineEtat{
    public  static   final  VendingMachineEtat ins  = new VendingMachineEtatDebut();
    private  VendingMachineEtatDebut(){

    }
    public  static VendingMachineEtat getInstance(){
        return ins;
    }
    @Override
    public void given(VendingMachineContext c, int argent) throws IncorrectEtatExcep {
        if (c.getLiquide() + argent >= 10) {
            c.setEtat(VendingMachineEtatIntermediate.getInstanc());
        }
        c.setLiquide(argent+c.getLiquide());

    }

    @Override
    public void askingCoffee(VendingMachineContext c) throws IncorrectEtatExcep {
        throw new IncorrectEtatExcep("impossible");

    }

    @Override
    public void askingThea(VendingMachineContext c) throws IncorrectEtatExcep {
        throw  new IncorrectEtatExcep("impossible");

    }
}
