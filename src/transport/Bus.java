package transport;

public class Bus extends Transport<DriverD> {
    public enum CapacityBus {
        EXTRASMALL,
        SMALL,
        MEDIUM,
        LARGE,
        EXTRALARGE
    }
        @Override
        public String toString() {
            return "Тип вместимости: " + Bus.CapacityBus.values();

    }

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Bus of brand "+getBrand()+" started moving");
    }

    @Override
    public void finishtMove() {
        System.out.println("Bus of brand "+getBrand()+" finished moving");

    }

    @Override
    public void getType() {

    }

    @Override
    public void printType() {
        System.out.println("Type of vehicle is Bus");

    }

    @Override
    public void pitStop() {
        System.out.println("Pit-stop by bus");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int maxSpeed = (int) (minBound +(maxBound - minBound)*Math.random());
        System.out.println("The best time for bus is" + maxSpeed);


    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound +(maxBound - minBound)*Math.random());
        System.out.println("The best speed for bus  is" + maxSpeed);


    }
}

