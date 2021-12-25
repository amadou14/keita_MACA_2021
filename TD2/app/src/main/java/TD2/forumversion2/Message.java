package TD2.forumversion2;

public class Message implements InterfaceContaned<Message> {
    private final String subjet;
    private  final String contaned;

    public Message(String subjet, String contaned) {
        this.subjet = subjet;
        this.contaned = contaned;
    }





    @Override
    public String subjet() {
        return this.subjet;
    }

    @Override
    public String Contained() {
        return this.contaned;
    }

    @Override
    public String typeRepertoire() {
        return "\n :" + this.subjet +"containde:"+this.contaned;
    }




    @Override
    public String toString() {
        return "\n     : "+ this.subjet+", containde: "+this.contaned+"";
    }
}
