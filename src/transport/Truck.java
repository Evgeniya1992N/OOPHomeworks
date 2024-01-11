package transport;

public class Truck extends Transport<DriverC> implements Diagnosticable{
    @Override
    public void runDiagnostic() throws DiagnosticNotAllowedException {
        if (getGasTankBar() > 2 && getOilTankBar() > 2) {
            System.out.println("Successful diagnostic ");
        }
        System.out.println("Diagnostic failed");
    }

    public enum TruckWeight{
        N1(3.5),
        N2(12),
        N3(13);

        private double loadWeight;

        TruckWeight(double loadWeight) {
            this.loadWeight = loadWeight;
        }

        public double getLoadWeight() {
            return loadWeight;
        }

        public void setLoadWeight() {
            this.loadWeight = loadWeight;
        }

    }
        @Override
        public String toString() {
            return "Грузоподъемность: " + Truck.TruckWeight.values();

    }
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver,
                 int gasTankBar,
                 int oilTankBar,
                 TruckWeight truckWeight) {
        super(brand, model, engineVolume, driver, gasTankBar, oilTankBar);
    }

    @Override
    public void startMove() throws EmptyGasTankException, NoOilException{
        if (getGasTankBar() == 0){
            throw new EmptyGasTankException();
        }
        if (getOilTankBar() == 0){
            throw new NoOilException();
        }
        System.out.println("Truck of brand "+getBrand()+" started moving");
    }

    @Override
    public void finishMove() {
        System.out.println("Truck of brand "+getBrand()+" finished moving");

    }

    @Override
    public Type getType() {
        String vehicleType;
        vehicleType = String.valueOf(Type.valueOf("TRUCK"));
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
