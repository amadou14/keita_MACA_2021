package Comm;

import TDVisitor.AvantVisitor;
import TDVisitor.Visitor;
import visitable.AvantVisitable;
import visitable.Visitable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupeCli implements AvantVisitable, Visitable {
    List<Owner> groupeCliList;
    private String nom;
    public  GroupeCli(String nom){
        this.nom = nom;
        this.groupeCliList = new ArrayList<Owner>();
    }
    public void ajoutOwner(Owner owner){
        this.groupeCliList.add(owner);

    }
    public   void ajoutCommand(String owner , Commande commande){
        Iterator<Owner> c = groupeCliList.iterator();
        while (c.hasNext()){
            Owner owner1 = c.next();
            if(owner1.getNom().equals(owner));
            owner1.ajoutCommande(commande);
        }


    }

    public List<Owner> getGroupeCliList() {
        return groupeCliList;
    }

    public void setGroupeCliList(List<Owner> groupeCliList) {
        this.groupeCliList = groupeCliList;
    }
    public void ajoutLine(String owner, String commande,Lines lines){
        Iterator<Owner> c = groupeCliList.iterator();
        while (c.hasNext()){
            Owner ownert = c.next();
            ownert.ajoutLine(commande,lines);
        }
    }

    @Override
    public void accept(AvantVisitor avantVisitor) {
        avantVisitor.preVisit(this);
        Iterator<Owner> c = groupeCliList.iterator();
        while (c.hasNext()){
            c.next().accept(avantVisitor);
        }
        avantVisitor.postVisit(this);




    }

    @Override
    public void accept(Visitor visit) {
        visit.Visit(this);
        Iterator<Owner> c = groupeCliList.iterator();
        while (c.hasNext()){
            c.next().accept(visit);

        }




    }
}
