package transport;

public class Car extends Transport<DriverB> {

    public enum CarModel {
        SEDAN,
        PICKUP,
        MINIVAN,
        CUPE
    }
        @Override
        public String toString() {
            return "Тип кузова: " + CarModel.values();

    }
    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver,
               CarModel carModel) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Car of brand "+getBrand()+" started moving");
    }

    @Override
    public void finishtMove() {
        System.out.println("Car of brand "+getBrand()+" finished moving");
    }

    @Override
    public void getType() {

    }

    @Override
    public void printType() {
        System.out.println("Type of vehicle is Car");

    }

    @Override
    public void pitStop() {
        System.out.println("Pit-stop by car");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 70;
        int maxBound = 160;
        int maxSpeed = (int) (minBound +(maxBound - minBound)*Math.random());
        System.out.println("The best time for car is" + maxSpeed);


    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maxSpeed = (int) (minBound +(maxBound - minBound)*Math.random());
        System.out.println("The best speed for car  is" + maxSpeed);


    }
}



