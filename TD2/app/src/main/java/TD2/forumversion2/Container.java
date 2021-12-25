package TD2.forumversion2;

import java.util.ArrayList;
import java.util.List;

public  abstract class Container<T extends InterfaceContaned<T>>implements IContainer{
    private String subjet;
    private List<IContainer>listConta;
public Container(String subjet){
    this.subjet= subjet;
    this.listConta = new ArrayList<>();
}


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void ajoutC(IContainer enfant) {
            this.listConta.add(enfant);
        }


    @Override
    public void removeC(int enfant) {
        this.listConta.remove(this.listConta.get(enfant));
    }

    @Override
    public int Taille() {
        return 0;
    }
    public String subjet(){
        return this.subjet;
    }

    @Override
    public String Contained() {
        String cointaned ="";
        for(IContainer<T> enfant:listConta){
            cointaned = cointaned+ enfant.typeRepertoire();
        }
        return cointaned;
    }
}
