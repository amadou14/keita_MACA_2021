package TD2.forumversion2;

public interface IContainer<T extends InterfaceContaned>  extends InterfaceForumObjet{
    void ajoutC(IContainer<T> enfant);
    void removeC(int enfant);
    int Taille();

}
