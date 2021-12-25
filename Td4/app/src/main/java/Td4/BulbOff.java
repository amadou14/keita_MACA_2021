package Td4;

public  final class BulbOff implements  BulbEtat {
    private static  final BulbEtat INSTANCE = new BulbOff();
    public  static BulbEtat instance(){
        return INSTANCE;
    }


    @Override
    public void light(Bulb bulb) {
        if(bulb.used()+1>Bulb.Max_used){
            bulb.setEtat(BulbBroken.instance());
            System.out.println("bulb broken ");
        }else{
            bulb.setEtat(Bulblighton.INSTANCE);
            bulb.increasseUsage();
            System.out.println("bulb on ");
        }

    }

    @Override
    public void turnOff(Bulb bulb) {
        System.out.println("turn off");

    }

    @Override
    public void repaired(Bulb bulb) {
        bulb.raUsed();

    }
}
