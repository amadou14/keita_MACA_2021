package TD2.forumversion2;

public interface InterfaceForumObjet {
    String subjet();
    String Contained();
    String typeRepertoire();
    default String repertoire(){
        return "default";
    }

}
