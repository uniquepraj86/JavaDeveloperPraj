package interfacedemo;


 import  java.math.BigInteger;
 import  java.util.Random;

public interface Parking {

}
class TwoWheeler implements Parking{
    void show()
    {
        System.out.println("Allow");
    }
}
class FourWheeler{
    void show()
    {
        System.out.println("Dont Allow");
    }
}
class ParkingImpl{
    public static void main(String[] args) {
        TwoWheeler twoWheeler=new TwoWheeler();
        FourWheeler fourWheeler=new FourWheeler();
        if (fourWheeler instanceof Parking)
        {
            fourWheeler.show();
        }
        else {
            twoWheeler.show();
        }
        }
    }
