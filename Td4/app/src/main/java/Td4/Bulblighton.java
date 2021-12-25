package Td4;

public  final class Bulblighton  implements  BulbEtat {
    public static final BulbEtat INSTANCE = new Bulblighton();

    public BulbEtat intance() {
        return INSTANCE;
    }

    private Bulblighton() {
    }


    @Override
    public void light(Bulb bulb) {
        System.out.println("bulb on");

    }

    @Override
    public void turnOff(Bulb bulb) {
        bulb.setEtat(BulbOff.instance());
        System.out.println("bulb off");


    }

    @Override
    public void repaired(Bulb bulb) {
        System.out.println("Impossible");

    }
}
