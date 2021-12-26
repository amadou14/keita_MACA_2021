package TDVisitor;

import Comm.Commande;
import Comm.GroupeCli;
import Comm.Lines;
import Comm.Owner;

public interface AvantVisitor   extends  AbstractVisitor{
    void  preVisit(GroupeCli groupeCli);
    void preVisit(Owner owner);
    void preVisit(Commande co);
    void preVisit(Lines line);
    void  postVisit(GroupeCli groupeCli);
    void postVisit(Owner owner);
    void postVisit(Commande co);
    void postVisit(Lines line);





}
