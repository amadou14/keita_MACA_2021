package Comm;

import TDVisitor.AvantVisitor;
import TDVisitor.Visitor;
import visitable.AvantVisitable;
import visitable.Visitable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public  class Owner implements AvantVisitable, Visitable {
    protected   String nom;
    public Owner(String nom){
        this.nom = nom;
        this.commandeList = new ArrayList<>();


    }
    private List<Commande> commandeList;
    public List<Commande> getCommandeList(){
        return commandeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return Objects.equals(nom, owner.nom) && Objects.equals(commandeList, owner.commandeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, commandeList);
    }
    public void ajoutCommande(Commande co){
        this.commandeList.add(co);
    }
    public void ajoutLine(String co,Lines lines){
        Iterator<Commande> commandeIterator=commandeList.iterator();
        while (commandeIterator.hasNext()){
            Commande commande = commandeIterator.next();
            if(commande.getNom().equals(co));
            commande.ajoutLine(lines);

        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }




    @Override
    public void accept(Visitor visit) {
        visit.Visit(this);
        Iterator<Commande>commandeIterator = commandeList.iterator();
        while (commandeIterator.hasNext()){
            commandeIterator.next().accept(visit);
        }


    }


    @Override
    public void accept(AvantVisitor avantVisitor) {
        avantVisitor.preVisit(this);
        Iterator<Commande> commandeIterator=commandeList.iterator();
        while (commandeIterator.hasNext()){
           commandeIterator.next().accept(avantVisitor);
        }
        avantVisitor.postVisit(this);

    }
}
