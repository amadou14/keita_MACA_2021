package Comm;

import TDVisitor.AvantVisitor;
import TDVisitor.Visitor;
import visitable.AvantVisitable;
import visitable.Visitable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Commande implements AvantVisitable, Visitable {
    private  String nom;
    private List<Lines>linesList = new ArrayList<>();
    public Commande(String nom){
        this.nom = nom;
    }
    public void ajoutLine(Lines lines){
        this.linesList.add(lines);

    }
    public  List<Lines>getLinesList(){
        return linesList;
    }
    @Override
    public void accept(AvantVisitor avantVisitor) {
        avantVisitor.preVisit(this);
        Iterator<Lines> c = linesList.iterator();
        while(c.hasNext()){
            c.next().accept(avantVisitor);
        }
        avantVisitor.postVisit(this);

    }

    @Override
    public void accept(Visitor visit) {
        visit.Visit(this);
        Iterator<Lines> c = linesList.iterator();
        while (c.hasNext()){
            c.next().accept(visit);
        }





    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commande)) return false;
        Commande commande = (Commande) o;
        return Objects.equals(nom, commande.nom) && Objects.equals(linesList, commande.linesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, linesList);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
