package TDDistributeur;

public class VendingMachineEtatFin  extends  VendingMachineEtat{
    public  static final VendingMachineEtat ins = new VendingMachineEtatFin();

    private VendingMachineEtatFin() {

    }
    public static  VendingMachineEtat getInstance(){
        return  ins;
    }

    @Override
    public void given(VendingMachineContext c, int argent) throws IncorrectEtatExcep {
        throw  new IncorrectEtatExcep("impossible");

    }

    @Override
    public void askingCoffee(VendingMachineContext c) throws IncorrectEtatExcep {
        throw  new IncorrectEtatExcep("pas possible");

    }

    @Override
    public void askingThea(VendingMachineContext c) throws IncorrectEtatExcep {
        throw  new IncorrectEtatExcep("pas possible");

    }
}
