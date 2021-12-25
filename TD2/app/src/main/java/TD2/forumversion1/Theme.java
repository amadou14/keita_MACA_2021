package TD2.forumversion1;

import java.util.ArrayList;
import java.util.List;

public class Theme {
    private List<Salon> salon;
    private final String top ;
    public Theme(String top){
        this.top=top;
        this.salon=new ArrayList<>();
    }
    public String sujet(){
        return this.top;
    }
    public void add(Salon children){
        this.salon.add(children);
    }
    public void remove(Salon child){
        this.salon.remove(child);
    }
    public int size(){
        return this.salon.size();
    }

}
