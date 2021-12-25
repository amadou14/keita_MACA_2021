package TD2.forumversion1;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Message> message;
    private final String top ;
    public Salon(String topic){
        this.top=topic;
        this.message=new ArrayList<>();
    }
    public String sujet(){
        return this.top;
    }
    public void add(Message children){
        this.message.add(children);
    }
    public void remove(Salon children){
        this.message.remove(children);
    }
    public int size(){
        return this.message.size();
    }

}
