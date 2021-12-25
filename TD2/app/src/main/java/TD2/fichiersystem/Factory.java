package TD2.fichiersystem;

import org.checkerframework.checker.units.qual.C;

import static TD2.fichiersystem.ComposantT.Fichier;

public class Factory {
    public static final  Factory factory= new Factory();

    private Factory(){

    }
    public static Factory getInstance(){
        return factory;
    }
    public  Composant creeComposant(ComposantT t,String nom,Owner owner){
        Composant compo = null;
        if(t == ComposantT.FICHIER){
            compo = new File(nom,owner);
            return  compo;
        }
        if(t == ComposantT.REPERTOIRE){
            compo = new Directory(nom,owner);
            return compo;
        }
        return  null;
    }


}
