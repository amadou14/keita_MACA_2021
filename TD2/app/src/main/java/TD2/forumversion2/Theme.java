package TD2.forumversion2;

public class Theme  extends  Container<Salon> implements InterfaceContaned<Message>{
    public Theme(String subjet){
        super(subjet);
    }
    @Override
    public String typeRepertoire() {
        return "\n   : "+ this.subjet()+",: ["+this.Contained()+"]";
    }
}
