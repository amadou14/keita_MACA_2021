package TD2.fichiersystem;

import java.util.List;

public interface Composite {
    List<Composant> getchild();
    void addchildren(Composant comp);
    boolean removechildren(Composant comp);
    boolean removeChildren(List<Composant>comp);
}
