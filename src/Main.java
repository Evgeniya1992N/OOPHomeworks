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
                    5,
                    5,
                    Car.CarModel.CUPE
            );
            Truck truck = new Truck(
                    "Truck brand " + i,
                    "Truck model " + i,
                    4.0,
                    driverC,
                    5,
                    5,
                    Truck.TruckWeight.N1
            );
            Bus bus = new Bus(
                    "Bus brand " +  i,
                    "Bus model " +  i,
                    1+i,
                    driverD,
                    -1+i,
                    -1 +i,
                    Bus.CapacityBus.LARGE
            );
            printInfo(car);
            printInfo(bus);
            printInfo(truck);

            int carGas = car.getGasTankBar();
            System.out.println(carGas);
            try {
                car.startMove();
            } catch (NoOilException | EmptyGasTankException message) {
                System.out.println(message.getMessage());
            } finally {
                System.out.println("Проверка завершена");
            }
            int busGas = bus.getGasTankBar();
            System.out.println(busGas);
            try {
                bus.startMove();
            } catch (NoOilException | EmptyGasTankException message) {
                System.out.println(message.getMessage());
            } finally {
                System.out.println("Проверка завершена");
            }

            try {
                car.runDiagnostic();
            } catch (DiagnosticNotAllowedException e) {
                throw new RuntimeException(e);
            }

            try {
                truck.runDiagnostic();
            } catch (DiagnosticNotAllowedException e) {
                throw new RuntimeException(e);
            }

            try {
                bus.runDiagnostic();
            } catch (DiagnosticNotAllowedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    private static void printInfo(Transport<?> transport){
        System.out.println("Driver " + transport.getDriver().getName() + " drives  " + transport.getBrand() + " will participate in the run.");
    }


}