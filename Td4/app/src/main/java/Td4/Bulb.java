package Td4;

public  final class Bulb {
    public static  final int  Max_used =2;
    private int used;
    private BulbEtat etat;

    public Bulb() {
        this.etat = BulbOff.instance();
        this.used= 0;

    }

    public BulbEtat getEtat() {
        return etat;
    }

    public void setEtat(BulbEtat etat) {
        this.etat = etat;
    }

    public  int used(){
        return used;
    }
    public void raUsed(){
        used = 0;
    }
    public void increasseUsage(){
        used++;
    }
    public void light(){
    this.etat.light(this);

    }
    public void turnOff(){
    this.etat.turnOff(this);

    }
    public void repaired(){
    this.etat.repaired(this);

    }

}
