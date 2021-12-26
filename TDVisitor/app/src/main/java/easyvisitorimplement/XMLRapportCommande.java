package easyvisitorimplement;

import Comm.Commande;
import Comm.GroupeCli;
import Comm.Lines;
import Comm.Owner;
import TDVisitor.AvantVisitor;
import TDVisitor.Visitor;

public class XMLRapportCommande  implements AvantVisitor {

    @Override
    public void preVisit(GroupeCli groupeCli) {
        System.out.println("groupe");
    }

    @Override
    public void preVisit(Owner owner) {
        System.out.println("the owner"+ owner.getNom());

    }

    @Override
    public void preVisit(Commande co) {
        System.out.println("the command"+ co.getNom());

    }

    @Override
    public void preVisit(Lines line) {

    }

    @Override
    public void postVisit(GroupeCli groupeCli) {
        System.out.println("groupecli");

    }

    @Override
    public void postVisit(Owner owner) {
        System.out.println("owner");

    }

    @Override
    public void postVisit(Commande co) {
        System.out.println("commande");

    }

    @Override
    public void postVisit(Lines line) {
        System.out.println("lines");

    }
}
