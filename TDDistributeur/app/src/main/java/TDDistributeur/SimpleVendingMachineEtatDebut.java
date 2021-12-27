package TDDistributeur;

public class SimpleVendingMachineEtatDebut  extends SimpleVendingMachineEtat{
    public   static  final  SimpleVendingMachineEtatDebut ins = new SimpleVendingMachineEtatDebut();
    private SimpleVendingMachineEtatDebut(){

    }
    public  SimpleVendingMachineEtat getInstance(){
        return  ins;
    }
    @Override
    public void given(SimpleVendingMachineContext simpleVendingMachineContext, int argent) throws IncorrectEtatExcep {
        if(argent + simpleVendingMachineContext.getCouArgent()>= 10){
            simpleVendingMachineContext.setEtat(SimpleVendingMachineEtatFin.getInstance());
            simpleVendingMachineContext.setCouArgent(argent+ simpleVendingMachineContext.getCouArgent());
        }else{
            simpleVendingMachineContext.setCouArgent(argent + simpleVendingMachineContext.getCouArgent());
        }

    }

    @Override
    public void askingCoffee(SimpleVendingMachineContext simpleVendingMachineContext) throws IncorrectEtatExcep {
        throw  new IncorrectEtatExcep("impossible");

    }

    @Override
    public void askingThea(SimpleVendingMachineContext simpleVendingMachineContext) throws IncorrectEtatExcep {
        throw  new IncorrectEtatExcep("impossible");

    }
}
