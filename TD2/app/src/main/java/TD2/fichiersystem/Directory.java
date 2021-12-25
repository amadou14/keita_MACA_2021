package TD2.fichiersystem;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class Directory extends  ComposantImplement implements Composite{
    private List<Composant> listeC = new ArrayList<>();
    public Directory(String nom,Owner owner){
        super(nom, owner);
    }

    @Override
    public int getTaille() {
        return this.listeC.size();
    }

    @Override
    public String getContant() {
        String res = "";
        res = res + "\n  FICHIER[ [ \n";
        for (Composant in : listeC) {
            res = res + "{+in.toString()+";
        }
        res = res   +"]\n ";


        return  res;
    }

    @Override
    public void ajoutContant(String nom) {

    }

    @Override
    public Boolean IsComposity() {
        return true;
    }


    @Override
    public List<Composant> getchild() {
        return this.listeC;
    }

    @Override
    public void addchildren(Composant comp) {
        this.listeC.add(comp);

    }

    @Override
    public boolean removechildren(Composant comp) {
        return this.listeC.remove(comp);
    }

    @Override
    public boolean removeChildren(List<Composant> comp) {
        return this.listeC.removeAll(comp);
    }


    public String toString() {
        String res = "Directory,nom:"+ super.getNom()+", o:"+ super.getOwner().toString();
        res = res + this.getContant();
        return res ;

    }
}
