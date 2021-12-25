package TD2.fichiersystem;

import org.checkerframework.checker.units.qual.C;

import java.util.Objects;

public abstract class  ComposantImplement  implements  Composant{
    private final String nom;
    private Owner owner ;

    public ComposantImplement(String nom, Owner owner){
        this.nom = nom;
        this.owner = owner;
    }

    @Override
    public Owner getOwner() {
        return this.owner ;
    }

    @Override
    public void setOwner(Owner proprietaire, Boolean rec) {
        if(rec == false){
            this.setOwner(proprietaire,rec);
        }

    }


    @Override
    public String getNom() {
        return nom;
    }
    public  boolean equals(Objects objects){
        return owner.equals(objects);
    }


    public int hashCode() {
        return owner.hashCode();
    }
}
