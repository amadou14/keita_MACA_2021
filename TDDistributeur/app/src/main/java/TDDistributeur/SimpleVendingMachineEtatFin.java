package TDDistributeur;

public class SimpleVendingMachineEtatFin  extends SimpleVendingMachineEtat{
    public  static final SimpleVendingMachineEtat ins = new SimpleVendingMachineEtatFin();
    public SimpleVendingMachineEtatFin(){

    }
    public  static SimpleVendingMachineEtat getInstance(){
        return  ins;
    }

    @Override
    public void given(SimpleVendingMachineContext simpleVendingMachineContext, int argent) throws IncorrectEtatExcep {

        throw new IncorrectEtatExcep("impoissible");

    }

    @Override
    public void askingCoffee(SimpleVendingMachineContext simpleVendingMachineContext) throws IncorrectEtatExcep {
        simpleVendingMachineContext.setEtat(SimpleVendingMachineEtatDebut.ins);
        System.out.println(" donated coffee");
        simpleVendingMachineContext.setCouArgent(0);

    }

    @Override
    public void askingThea(SimpleVendingMachineContext simpleVendingMachineContext) throws IncorrectEtatExcep {
        simpleVendingMachineContext.setEtat(SimpleVendingMachineEtatDebut.ins);
        System.out.println("donated coffee");
        simpleVendingMachineContext.setCouArgent(0);

    }
}
