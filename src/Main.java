import transport.*;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i <= 4; i++){
            DriverB driverB = new DriverB(
                    "Driver No" + i,
                    true,
                    5 + i
                    );
            DriverC driverC = new DriverC(
                    "Driver No" + i ,
                    true,
                    7+i
                     );
            DriverD driverD = new DriverD(
                    "Driver No" + i,
                    true,
                    10+i
            );
            Car car = new Car(
                    "Car brand " + i,
                    "Car model "  + i,
                    1.6,
                    driverB,
                    Car.CarModel.CUPE
            );

            Truck truck = new Truck(
                    "Truck brand " + i,
                    "Truck model " + i,
                    4.0,
                    driverC
            );
            Bus bus = new Bus(
                    "Bus brand " +  i,
                    "Bus model " +  i,
                    1+i,
                    driverD
            );
            printInfo(car);
            printInfo(bus);
            printInfo(truck);

        }
    }
    private static void printInfo(Transport<?> transport){
        System.out.println("Driver " + transport.getDriver().getName() + " drives  " + transport.getBrand() + " will participate in the run.");
    }


}