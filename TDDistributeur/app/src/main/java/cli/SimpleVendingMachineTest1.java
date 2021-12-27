package cli;

import TDDistributeur.IncorrectEtatExcep;
import TDDistributeur.SimpleVendingMachineContext;

public class SimpleVendingMachineTest1 {
    public static  void main(String []args ) throws IncorrectEtatExcep {
        SimpleVendingMachineContext mac = new SimpleVendingMachineContext();
        try {
            mac.askingCoffee();
        }
        catch (IncorrectEtatExcep e ){
            System.out.println(e);
        }
        try {
            mac.given(30);
            mac.askingCoffee();
        }catch (IncorrectEtatExcep e){
            System.out.println(e);
        }
        try {
            mac.given(1);
            mac.askingCoffee();
        }catch (IncorrectEtatExcep e ){
            System.out.println(e);
        }


    }
}
