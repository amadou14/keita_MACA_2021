package TD2.forumversion2;

public class Salon extends Container <Message>implements InterfaceContaned<Salon>{
    public  Salon(String subjet){
        super(subjet);
    }
    @Override
    public String typeRepertoire() {
        return  "\n  : "+ this.subjet()+", contenaid ["+this.Contained()+"]";
    }

}
