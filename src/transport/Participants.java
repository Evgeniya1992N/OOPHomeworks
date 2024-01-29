package transport;

import java.util.ArrayList;
import java.util.List;

public class Participants {
    public static void main(String[] args) {
        List<Transport> participants = new ArrayList<>();

            for (int i = 0; i <= 4; i++) {
                DriverB driverB = new DriverB(
                        "Driver No" + i,
                        true,
                        5 + i
                );
                DriverC driverC = new DriverC(
                        "Driver No" + i,
                        true,
                        7 + i
                );
                DriverD driverD = new DriverD(
                        "Driver No" + i,
                        true,
                        10 + i
                );
                Object mechanic = new Object();
                Car car = new Car(
                        "Car brand " + i,
                        "Car model " + i,
                        1.6,
                        driverB,
                        5,
                        5,
                        (Mechanic) mechanic


                );
                participants.add(car);
                Truck truck = new Truck(
                        "Truck brand " + i,
                        "Truck model " + i,
                        4.0,
                        driverC,
                        5,
                        5,
                        (Mechanic) mechanic
                );
                participants.add(truck);
                Bus bus = new Bus(
                        "Bus brand " + i,
                        "Bus model " + i,
                        1 + i,
                        driverD,
                        -1 + i,
                        -1 + i,
                        (Mechanic) mechanic
                );
                participants.add(bus);
            }
        for (Transport transport: participants) {
            System.out.println(participants);
        }


    }
}
