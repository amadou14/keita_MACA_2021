package TD2.fichiersystem;

public class File  extends  ComposantImplement{
    private StringBuilder con;
    public  File(String nom,Owner owner){
        super(nom,owner);
        this.con = new StringBuilder();
    }

    @Override
    public int getTaille() {
        return 1;
    }

    @Override
    public String getContant() {
        return  this.con.toString();
    }

    @Override
    public void ajoutContant(String nom) {
        this.con.append(nom);

    }

    @Override
    public Boolean IsComposity() {
        return false;
    }
    public  String toString(){
        return "File nom:"+super.getNom()+",o"+super.getOwner()+", contant :"+this.getContant().toString();
    }


}
