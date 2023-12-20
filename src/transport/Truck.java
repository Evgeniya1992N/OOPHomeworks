package transport;

public class Truck extends Transport<DriverC>{
    public enum TruckWeight{
        N1,
        N2,
        N3
    }
        @Override
        public String toString() {
            return "Грузоподъемность: " + Truck.TruckWeight.values();

    }
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Truck of brand "+getBrand()+" started moving");
    }

    @Override
    public void finishtMove() {
        System.out.println("Truck of brand "+getBrand()+" finished moving");

    }

    @Override
    public void getType() {

    }

    @Override
    public void printType() {
        System.out.println("Type of vehicle is Truck");

    }

    @Override
    public void pitStop() {
        System.out.println("Pit-stop by truck");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 90;
        int maxBound = 140;
        int maxSpeed = (int) (minBound +(maxBound - minBound)*Math.random());
        System.out.println("The best time for truck is" + maxSpeed);


    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maxSpeed = (int) (minBound +(maxBound - minBound)*Math.random());
        System.out.println("The best speed for truck  is" + maxSpeed);


    }
}
