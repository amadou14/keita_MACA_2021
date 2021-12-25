package TD2.forumversion1;

public class Message {
    private final String top;
    private final String contents;

    public Message(String top,String contents){
        this.top = top;
        this.contents = contents;
    }
    public  String subjet(){
        return this.top;
    }
}
