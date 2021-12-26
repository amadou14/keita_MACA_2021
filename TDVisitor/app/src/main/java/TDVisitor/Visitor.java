package TDVisitor;

import Comm.Commande;
import Comm.GroupeCli;
import Comm.Lines;
import Comm.Owner;

public interface Visitor  extends  AbstractVisitor{
    void  Visit(GroupeCli groupeCli);
    void Visit(Owner owner);
    void Visit(Commande co);
    void Visit(Lines line);
}
