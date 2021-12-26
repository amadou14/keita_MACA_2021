package easyvisitorimplement;

import Comm.Commande;
import Comm.GroupeCli;
import Comm.Lines;
import Comm.Owner;
import TDVisitor.Visitor;

public class AfficherRapportCommandes  implements Visitor {


    @Override
    public void Visit(GroupeCli groupeCli) {
        System.out.println("groupecli"+groupeCli);

    }

    @Override
    public void Visit(Owner owner) {
        int prix = 0;
        for(Commande co: owner.getCommandeList()){
            prix = prix + co.getLinesList().stream().mapToInt(i->i.getNumber()).sum();
        }
        System.out.println("the owner "+ owner.getNom()+","+prix+"euro");

    }

    @Override
    public void Visit(Commande co) {

    }

    @Override
    public void Visit(Lines line) {

    }
}
