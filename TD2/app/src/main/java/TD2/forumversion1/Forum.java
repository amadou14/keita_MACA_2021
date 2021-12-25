package TD2.forumversion1;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<Theme> themes;
    private final String top;

    public Forum(String topic) {
        this.top = topic;
        this.themes = new ArrayList<>();
    }

    public String subjet() {
        return this.top;
    }

    public void add(Theme children) {
        this.themes.add(children);
    }

    public void remove(Theme children) {
        this.themes.remove(children);
    }

   public  int size(){
        return this.themes.size();
   }
}
