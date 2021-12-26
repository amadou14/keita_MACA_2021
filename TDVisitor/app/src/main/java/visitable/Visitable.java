package visitable;

import TDVisitor.Visitor;

public interface Visitable {
    void accept(Visitor visit);

}
