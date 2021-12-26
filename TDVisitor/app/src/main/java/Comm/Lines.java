package Comm;

import TDVisitor.AvantVisitor;
import TDVisitor.Visitor;
import visitable.AvantVisitable;
import visitable.Visitable;

public class Lines  implements AvantVisitable, Visitable {
    private  String nom;
    private int number;
    public Lines(String nom,int number){
        this.nom = nom;
        this.number = number;
    }
    public  Lines(String nom){
        this.nom = nom;
        this.number = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void accept(AvantVisitor avantVisitor) {
        avantVisitor.postVisit(this);
        avantVisitor.preVisit(this);

    }

    @Override
    public void accept(Visitor visit) {
        visit.Visit(this);

    }
}
