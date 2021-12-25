package Td4;

public  final class BulbBroken implements BulbEtat{
    private static final BulbEtat INSTANCE = new BulbBroken();
    private static  final String Inform  = "Broken";
    private static  final String reperd = "Repared";
    public  static  BulbEtat instance(){
        return INSTANCE;
    }

    @Override
    public void light(Bulb bulb) {
            System.out.println(Inform);

    }

    @Override
    public void turnOff(Bulb bulb) {
        System.out.println(Inform);

    }

    @Override
    public void repaired(Bulb bulb) {
        bulb.raUsed();
        bulb.setEtat(BulbOff.instance());
        System.out.println(reperd);

    }
}
