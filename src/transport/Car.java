package transport;

public class Car extends Transport<DriverB> implements Diagnosticable{

    @Override
    public void runDiagnostic() throws DiagnosticNotAllowedException {
        if (getGasTankBar() > 2 && getOilTankBar() > 2) {
            System.out.println("Successful diagnostic ");
        }
        System.out.println("Diagnostic failed");
    }

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
               int gasTankBar,
               int oilTankBar,
               Mechanic mechanic) {
        super(brand, model, engineVolume, driver, gasTankBar, oilTankBar, mechanic);
    }

    @Override
    public void startMove() throws EmptyGasTankException, NoOilException{
        if (getGasTankBar() == 0){
            throw new EmptyGasTankException("Gas tank is empty, tank up!");
        }
        if (getOilTankBar() == 0){
            throw new NoOilException();
        }
        System.out.println("Car of brand "+getBrand()+" started moving");
    }

    @Override
    public void finishMove() {
        System.out.println("Car of brand "+getBrand()+" finished moving");
    }
    @Override
    public Type getType() {
        String vehicleType;
        vehicleType = String.valueOf(Type.valueOf("CAR"));
        return Type.valueOf(vehicleType);
    };
    @Override
    public void printType() {
        Type TransportType;
        TransportType = getType();
        if (TransportType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println("Transport type is: " + TransportType);
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



