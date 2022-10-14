package innerclass;

public abstract class Parking {
    void allowVehicle() {
        System.out.println("You can park your vehicle");
    }

    abstract void allowVehicle(String vehicleType);
}
//}
//class TwoWheeler extends Parking{
//    @Override
//    void allowVehicle() {
//        super.allowVehicle();
//    }

class  ParkingImpl{
    public static void main(String[] args) {
        Parking parking = new Parking(){
            @Override
            void allowVehicle(String vehicleType) {
                System.out.println(vehicleType.equals("Bike")?"Two Wheeler not allowed":"You can park");
            }
        };

            parking.allowVehicle("Bike");
    }
}

