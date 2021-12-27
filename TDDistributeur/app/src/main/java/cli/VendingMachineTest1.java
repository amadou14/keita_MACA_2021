package cli;

import TDDistributeur.IncorrectEtatExcep;
import TDDistributeur.VendingMachineContext;

public class VendingMachineTest1 {
    public static  void main(String[] args){
        VendingMachineContext mac = new VendingMachineContext();
        try {
            mac.askingCoffee();

        }catch (IncorrectEtatExcep e){
            System.out.println(e);
        }
         try {
             mac.given(5);
             mac.askingCoffee();
         }catch (IncorrectEtatExcep e){
             System.out.println(e);
         }
         try {
             mac.given(10);
             mac.askingCoffee();
             System.out.println(mac.getRemboursement());
             System.out.println(mac.getRemboursement());
         }catch (IncorrectEtatExcep e){
             System.out.println(e);
         }
    }
}
