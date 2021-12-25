package TD2.fichiersystem;

public interface Composant {
     public String getNom();
    public Owner getOwner();
    void setOwner(Owner proprietaire,Boolean rec);

    int getTaille();
    String getContant();
    void ajoutContant(String nom);

    Boolean IsComposity();
}
