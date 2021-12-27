package TDDistributeur;

public class VendingMachineEtatIntermediate  extends  VendingMachineEtat {
    public static final VendingMachineEtat ins=new  VendingMachineEtatIntermediate();
    private  VendingMachineEtatIntermediate(){

    }
    public static  VendingMachineEtat getInstanc(){
        return  ins;
    }

    @Override
    public void given(VendingMachineContext c, int argent) throws IncorrectEtatExcep {
        throw  new IncorrectEtatExcep("pas possible");

    }

    @Override
    public void askingCoffee(VendingMachineContext c) throws IncorrectEtatExcep {
        System.out.println("donated coffee");
        c.setLiquide(c.getLiquide() -10);
        c.setEtat(VendingMachineEtatFin.getInstance());

    }

    @Override
    public void askingThea(VendingMachineContext c) throws IncorrectEtatExcep {
        System.out.println("donated coffee");
        c.setLiquide(c.getLiquide() -10);
        c.setEtat(VendingMachineEtatFin.getInstance());
    }
}
